package com.bogolyubovmaks.Lesson4;

import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {
    public static void countCharacters(String input) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String testString = "ddcdaabm";
        countCharacters(testString);
    }
}
