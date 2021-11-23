package loops.for_loop;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence or word");
        String str = scanner.nextLine();
        System.out.println("Please enter a character to be looked for");
        char target = scanner.next().charAt(0);
        System.out.println(findNumberOfAppears(str, target));
    }


    public static int findNumberOfAppears(String str, char c) {

        int count = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
