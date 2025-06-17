package com.bogolyubovmaks.Lesson3;

import java.text.DecimalFormat;

public abstract class BankCard{
    protected String cardName;
    protected double balance;

    public BankCard(String cardName, double balance) {
        this.cardName = cardName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void makePurchase(double amount);

    public abstract String getCardInfo();

    protected String formatMoney(double amount) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(amount);
    }
}
