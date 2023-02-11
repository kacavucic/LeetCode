package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
    }

    public static int romanToInt(String s) {

        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }

        if (s.length() < 1 || s.length() > 15) {
            throw new IllegalArgumentException("String must be at least 1 and at most 15 characters long");
        }

        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        char[] romanCharArray = s.toCharArray();

        int intNumber = 0;

        for (int i = 0; i < romanCharArray.length; i++) {
            if (!romanToInt.containsKey(romanCharArray[i])) {
                throw new IllegalArgumentException("String must contain only roman numerals");
            }

            int current = romanToInt.get(romanCharArray[i]);
            if ((i + 1) == romanCharArray.length) {
                intNumber += current;
                break;
            }
            int next = romanToInt.get(romanCharArray[i + 1]);
            if (current >= next) {
                intNumber += current;
            }
            else {
                int diff = next - current;
                intNumber += diff;
                i++;
            }
        }
        return intNumber;
    }
}
