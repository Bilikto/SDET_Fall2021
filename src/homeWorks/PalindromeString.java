package homeWorks;

public class PalindromeString {
    public static void main(String[] args) {
        String  s = "A man a plan a canal Panama";
//      s = "race a car";
        PalindromeString myObj = new PalindromeString();
        System.out.println(myObj.isPalindromeString(s));
    }

    public boolean isPalindromeString(String str) {
        str = str.replace(" ", "").toLowerCase();
        int i = 0;
        int j = str.length()-1;

        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
