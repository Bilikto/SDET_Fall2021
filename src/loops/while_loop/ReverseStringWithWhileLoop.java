package loops.while_loop;

import java.util.Scanner;

public class ReverseStringWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a text to be reversed..");
        String str = scanner.nextLine();
        String reversedString = reverseString(str).toString();
        System.out.println(reversedString);

    }

    static StringBuilder reverseString(String str) {

        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        return sb.reverse();

        int i = str.length()-1;
        while(i>=0) {
            sb.append(str.charAt(i));
            i--;
        }

        return sb;
    }
}
