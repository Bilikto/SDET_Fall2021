package loops.while_loop;

public class StringCharsPrint {

    // we will print out the characters of a given string
    public static void main(String[] args) {

        printCharsOfString("Devx");

    }

    static void printCharsOfString(String str) {

        int count = 0;
        while(count < str.length()) {
            System.out.println(str.charAt(count));
            count++;
        }
    }




}
