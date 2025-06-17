package com.bogolyubovmaks.Lesson3;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Дебетовая карта с бонусами ===");
        BonusDebitCard bonusCard = new BonusDebitCard("Bonusnaya", 1000);
        System.out.println(bonusCard.getCardInfo());
        bonusCard.makePurchase(500);
        System.out.println(bonusCard.getCardInfo());
        bonusCard.makePurchase(200);
        System.out.println(bonusCard.getCardInfo());
        bonusCard.deposit(1000);
        System.out.println(bonusCard.getCardInfo());

        System.out.println("\n=== Дебетовая карта с накоплениями ===");
        SavingsDebitCard savingsCard = new SavingsDebitCard("Nakopitelnyaya", 2000);
        System.out.println(savingsCard.getCardInfo());
        savingsCard.deposit(1000);
        System.out.println(savingsCard.getCardInfo());
        savingsCard.makePurchase(500);
        System.out.println(savingsCard.getCardInfo());

        System.out.println("\n=== Кредитная карта ===");
        CreditCard creditCard = new CreditCard("Kreditka", 500, 5000);
        System.out.println(creditCard.getCardInfo());
        creditCard.makePurchase(1000);
        System.out.println(creditCard.getCardInfo());
        creditCard.makePurchase(4000);
        System.out.println(creditCard.getCardInfo());
        creditCard.makePurchase(1000); // Должно не хватить
        creditCard.deposit(2000);
        System.out.println(creditCard.getCardInfo());
        creditCard.deposit(3000);
        System.out.println(creditCard.getCardInfo());
    }
}
