package stringbuilder;

public class StringBuilderWithDifferentDataTypes {
    public static void main(String[] args) {
        //StringBuilder append() metjhod can take different primitive and non-primitive data types
        //as a parameter and convert them to StringBuilder and manipulate them

        StringBuilder sb = new StringBuilder("String");
        sb.append('$')
                .append(123) //int
                .append(false) //boolean
                .append(000.67) // float
                .append(true) // boolean
                .append(2184681279L); // long

        System.out.println(sb);
    }
}
