package homeWorks;

public class ReverseString {
    public static void main(String[] args) {
        String str = "SDET";
        String nstr = " ";
        char ch;

        System.out.println("Original word: " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println("Reversed word: " + nstr);



        //Using StringBuilder
        StringBuilder str1 = new StringBuilder();
        str1. append(str).reverse();
        System.out.println("Reversed using StringBuilder: " + str1);

    }
}
