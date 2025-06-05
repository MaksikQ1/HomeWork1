package com.bogolyubovmaks;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Создание и заполнение массива
        int[] myArray = new int[20];

        for (int i = 1; i < myArray.length; i++){
            myArray[i] = new Random().nextInt(100);
            System.out.println(myArray[i]);
        }

        //Наибольший элемент
        int max = myArray[0];

        for (int i = 1; i < myArray.length; i++){
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Наибольший элемент массива равен:" + max);

        //Сумма элементов
        int sum = 0;

        for (int i = 1; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("Сумма всех элементов массива равна:" + sum);
    }
}