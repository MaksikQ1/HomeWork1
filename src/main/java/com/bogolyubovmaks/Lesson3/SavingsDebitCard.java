package com.bogolyubovmaks.Lesson3;

public class SavingsDebitCard extends BankCard {
    private double savings;

    public SavingsDebitCard(String cardName, double balance) {
        super(cardName, balance);
        this.savings = 0;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("-------------------------------");
        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть положительной");
            return;
        }
        balance += amount;
        double savingAmount = amount * 0.0005;
        savings += savingAmount;
        System.out.println("Пополнение на " + formatMoney(amount) +
                ". Новый баланс: " + formatMoney(balance) +
                "\nНачислено накоплений: " + formatMoney(savingAmount));
    }

    @Override
    public void makePurchase(double amount) {
        System.out.println("-------------------------------");
        if (amount <= 0) {
            System.out.println("Сумма покупки должна быть положительной");
            return;
        }
        if (balance < amount) {
            System.out.println("Недостаточно средств на карте");
            return;
        }
        balance -= amount;
        System.out.println("Покупка на " + formatMoney(amount) +
                ". Остаток: " + formatMoney(balance));
    }

    @Override
    public String getCardInfo() {
        System.out.println("-------------------------------");
        return "Карта: " + cardName +
                "\nБаланс: " + formatMoney(balance) +
                "\nНакопления: " + formatMoney(savings);
    }
}
