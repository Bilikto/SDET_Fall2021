package homeWorks;

public class PalindromIntExample {
    public static void main(String[] args) {

        System.out.println(isPalindromeInt(121));
        System.out.println(isPalindromeInt(123));
        System.out.println(isPalindromeInt(2332));

    }

    public static boolean isPalindromeInt(int x) {


        //#1 Converting to String
/*        String n = Integer.toString(x);
        int i = 0;
        int j = n.length()-1;

        while(i <= j) {
            if(n.charAt(i) != n.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;*/


        //#2 Without converting --> using % and / operators
        int temp = x;
        int lastDigit = 0;
        int reversedNum = 0;

        while(temp > 0) {
            lastDigit = temp % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            temp = temp / 10;
        }

        return reversedNum == x;
    }
}
/*
* Consider x = 123 is the given number. Lets take a temporary variable to store this given number, lets say tmp (this step is necessary because we need the original number x unmodified
* so that it can be compared with the reversed number in the final step). Also take a variable to store the reversed number, lets call it reversedNum. Initially reversedNum = 0.
* One by one we process each digit in tmp starting with the last digit 3. Extract last digit from tmp using the mod operator i.e. lastDigit = tmp%10 = 123 % 10 = 3.
* Next step is to move lastDigit to its correct base position in reversedNum. This step is similar to the leetcode 8 problem where we had to move converted digit to its correct base position.
* As in leetcode 8 problem we can accomplish this by multiplying reversedNum with 10 and then adding the lastDigit to it. So reversedNum = reversedNum * 10 + lastDigit = 0 * 10 + 3 = 3.
* Now that we have processed the last digit completely we need to remove it from tmp. We can do this using the divide operation, tmp = tmp/10 = 123/10 = 12.
* */