package com.bogolyubovmaks.Lesson3;

public class BonusDebitCard extends BankCard {
    private double bonusPoints;

    public BonusDebitCard(String cardName, double balance) {
        super(cardName, balance);
        this.bonusPoints = 0;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("-------------------------------");
        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть положительной");
            return;
        }
        balance += amount;
        System.out.println("Пополнение на " + formatMoney(amount) +
                ". Новый баланс: " + formatMoney(balance));
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
        double bonus = amount * 0.01;
        bonusPoints += bonus;
        System.out.println("Покупка на " + formatMoney(amount) +
                ". Остаток: " + formatMoney(balance) +
                ". Начислено бонусов: " + formatMoney(bonus));
    }

    @Override
    public String getCardInfo() {
        System.out.println("-------------------------------");
        return "Карта: " + cardName +
                "\nБаланс: " + formatMoney(balance) +
                "\nБонусные баллы: " + formatMoney(bonusPoints);
    }
}

