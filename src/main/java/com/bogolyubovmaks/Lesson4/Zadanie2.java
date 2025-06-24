package com.bogolyubovmaks.Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadanie2 {

    public static <T> T findFirstUnique(List<T> list) {

        Map<T, Integer> countMap = new HashMap<>();

        for (T element : list) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        for (T element : list) {
            if (countMap.get(element) == 1) {
                return element;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("a");
        testList.add("c");
        testList.add("b");

        System.out.println("Первый не повторяющийся элемент: " + findFirstUnique(testList));
    }
}
