package com.company;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s =
                "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!chars.containsKey(s.charAt(i))) {
                chars.put(s.charAt(i), 1);
            }
            else {
                chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
            }
        }
        int maxPalindrome = 0;
        boolean oddExist = false;
        for (Map.Entry<Character, Integer> set : chars.entrySet()) {
            if (set.getValue() % 2 == 0) {
                maxPalindrome += set.getValue();
            }
            else {
                maxPalindrome += set.getValue() - 1;
                oddExist = true;
            }
        }

        if (oddExist) {
            maxPalindrome += 1;
        }
        System.out.println(chars);
        return maxPalindrome;
    }
}
