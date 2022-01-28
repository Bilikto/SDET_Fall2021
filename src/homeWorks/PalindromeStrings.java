package homeWorks;

public class PalindromeStrings {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

    }

    public static boolean isPalindrome(String s) {
//        s = s.toLowerCase();
//        int i = 0;
//        int j = s.length() - 1;
//        char head = ' ';
//        char tail = ' ';
//
//        while(i < j) {
//            head = s.charAt(i);
//            tail = s.charAt(j);
//
//            if(!Character.isLetterOrDigit(head)) {
//                i++;
//            }else  if(!Character.isLetterOrDigit(tail)) {
//                j--;
//            } else {
//                if (head != tail) {
//                    return false;
//                }
//                i++;
//                j--;
//            }
//        }
//        return true;


        //more concise way
        char[] charArr = s.toCharArray();
        for(int i = 0, j = charArr.length - 1; i < j; ) {
            if(!Character.isLetterOrDigit(charArr[i])) {
                i++;
            } else if(!Character.isLetterOrDigit(charArr[j])) {
                j--;
            } else {
                if(Character.toLowerCase(charArr[i++]) != Character.toLowerCase(charArr[j--])) {
                    return false;
                }
            }
        }
        return true;
    }



}
