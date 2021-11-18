package loops.while_loop;

public class StringCharsPrintReverse {
    public static void main(String[] args) {
        printCharsReverse("Devx");
    }

    public static void printCharsReverse(String str) {

        int i = str.length() - 1;

        while(i >= 0) {
            System.out.print(str.charAt(i) + " ");
            i--;
        }
    }
}
