package stringbuilder;

public class ToStringMethod {
    public static void main(String[] args) {
        /*
        * String toString()
        * returns a String by converting StringBuilder to String
        * */

        StringBuilder sb = new StringBuilder("Alex");
        String name = sb.toString().toUpperCase();
        System.out.println(name);


        //Searching shars--> Clfri
        String str = "California";
        String s = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'C' || ch == 'l' || ch == 'f' || ch == 'r' || ch == 'i') {
                s += ch;
            }
        }

        StringBuilder sb1 = new StringBuilder(s);
        sb1.deleteCharAt(2).toString();
        System.out.println(sb1);
    }
}
