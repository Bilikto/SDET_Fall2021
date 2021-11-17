package stringbuilder;

public class ReverseMethod {

    public static void main(String[] args) {
        /*
        * StringBuilder reverse(Str) reverse a reference to the same string builder by reversing the characters
        * */

        StringBuilder sb = new StringBuilder("Ciuperca");
        sb.reverse();
        System.out.println(sb);


        String str = "Harvard";
        StringBuilder sb1 = new StringBuilder(str).reverse();
        sb1.toString();
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Maryna Nesterenko");
        System.out.println("Maryna Nesterenko reversed: " + sb2.reverse());
    }
}
