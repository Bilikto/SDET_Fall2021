package homeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class numSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter at least 5 numbers:");
        int nums = scanner.nextInt();

        String number = String.valueOf(nums);
        char[] digits = number.toCharArray();
        System.out.println(Arrays.toString(digits));

    }
}
