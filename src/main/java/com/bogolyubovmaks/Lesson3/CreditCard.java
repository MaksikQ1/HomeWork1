package com.bogolyubovmaks.Lesson3;

public class CreditCard  extends BankCard {
    private double creditLimit;
    private double availableCredit;

    public CreditCard(String cardName, double balance, double creditLimit) {
        super(cardName, balance);
        this.creditLimit = creditLimit;
        this.availableCredit = creditLimit;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("-------------------------------");
        if (!super.verifyAmountDeposit(amount)) {
            return;
        }

        // Сначала погашаем кредит
        double creditDebt = creditLimit - availableCredit;
        if (creditDebt > 0) {
            if (amount <= creditDebt) {
                availableCredit += amount;
                System.out.println("Погашение кредита на " + formatMoney(amount) +
                        ". Доступный кредит: " + formatMoney(availableCredit));
            } else {
                availableCredit = creditLimit;
                double remaining = amount - creditDebt;
                balance += remaining;
                System.out.println("Кредит полностью погашен. Остаток " +
                        formatMoney(remaining) + " зачислен на баланс." +
                        "\nДоступный кредит: " + formatMoney(availableCredit) +
                        "\nБаланс: " + formatMoney(balance));
            }
        } else {
            // Если кредит не использовался, просто пополняем баланс
            balance += amount;
            System.out.println("Пополнение на " + formatMoney(amount) +
                    ". Новый баланс: " + formatMoney(balance));
        }
    }

    @Override
    public void makePurchase(double amount) {
        System.out.println("-------------------------------");
        if (!super.verifyAmountPurchase(amount)) {
            return;
        }

        if (balance >= amount) {
            // Если хватает собственных средств
            balance -= amount;
            System.out.println("Покупка на " + formatMoney(amount) +
                    " выполнена за счет собственных средств." +
                    "\nОстаток: " + formatMoney(balance));
        } else {
            // Используем кредитные средства
            double remaining = amount - balance;
            if (availableCredit >= remaining) {
                availableCredit -= remaining;
                balance = 0;
                System.out.println("Покупка на " + formatMoney(amount) +
                        " выполнена." +
                        "\nИспользовано кредитных средств: " + formatMoney(remaining) +
                        "\nДоступный кредит: " + formatMoney(availableCredit));
            } else {
                System.out.println("Недостаточно средств (включая кредитный лимит)");
            }
        }
    }

    @Override
    public String getCardInfo() {
        System.out.println("-------------------------------");
        return "Карта: " + cardName +
                "\nБаланс: " + formatMoney(balance) +
                "\nКредитный лимит: " + formatMoney(creditLimit) +
                "\nДоступный кредит: " + formatMoney(availableCredit);
    }
}