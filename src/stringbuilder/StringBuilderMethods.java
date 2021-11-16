package stringbuilder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        /*
        * substring(), length(), charAt(), indexOf() -> work exactly like String class methods.
        * They, don`t update the value of StringBuilder */

        StringBuilder sb = new StringBuilder("Java");

        String str = sb.substring(sb.indexOf("J"), sb.indexOf("v"));
        System.out.println("String str: " + str); //String str: Ja

        System.out.println("Sb: " + sb); //Sb: Java

        sb.substring(1, 3);
        System.out.println(sb); //Java

    }
}
