package homeWorks;

import java.util.ArrayList;
import java.util.List;

public class LargestPalindromeExample {
    public static void main(String[] args) {
        List<String> palindromeList = new ArrayList<>();
        palindromeList.add("TABLE");
        palindromeList.add("MOM");
        palindromeList.add("RACECAR");
        palindromeList.add("CIVIC");
        palindromeList.add("LEVEL");

        System.out.println(largestPalindrome(palindromeList));
        System.out.println(isPalindrome("LEVEL"));
    }

    public static String largestPalindrome(List<String> stringList) {
        String largest = "";
        String smallest = "";
        largest = smallest = stringList.get(0);

        for(int i = 0; i < stringList.size(); i++) {
            if(isPalindrome(stringList.get(i))) {
                if(largest.length() < stringList.get(i).length()) {
                    largest = stringList.get(i);
                }

                if(smallest.length() > stringList.get(i).length()) {
                    smallest = stringList.get(i);
                }
            }
        }
        return largest; //just retuns largets one
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
