package java_recap.java_practice;

public class Palindrome {
    public static void main(String[] args) {
        String palindromeStr = "Mr Owl ate my metal worm";
        System.out.println(isPalindrome(palindromeStr));
    }

    public static boolean isPalindrome(String s) {
        s = s.replace(" ", "").toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
