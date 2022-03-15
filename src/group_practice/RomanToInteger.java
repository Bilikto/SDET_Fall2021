package group_practice;

import homeWorks.Strings;

import javax.xml.stream.events.Characters;
import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String s0 = "III";
        String s1 = "LVIII";
        String s2 = "MCMXCIV";
        String s3 = "MMC";
        System.out.println(romanToInt(s0));
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2)); // 1994
        System.out.println(romanToInt(s3)); // 2100
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> mapOfSymbols = new HashMap();
        mapOfSymbols.put('I', 1);
        mapOfSymbols.put('V', 5);
        mapOfSymbols.put('X', 10);
        mapOfSymbols.put('L', 50);
        mapOfSymbols.put('C', 100);
        mapOfSymbols.put('D', 500);
        mapOfSymbols.put('M', 1000);

        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int val = mapOfSymbols.get(a);
            if(i < s.length()- 1 && val < mapOfSymbols.get(s.charAt(i+1))) {
                val = mapOfSymbols.get(s.charAt(i+1)) - val;
                i++;
            }
            ans += val;

        }
        return ans;
    }
}
