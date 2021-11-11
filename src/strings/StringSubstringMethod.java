package strings;

public class StringSubstringMethod {
    public static void main(String[] args) {

        String str1 = "DevX".substring(1);
        System.out.println(str1);
        String str2 = "DevX".substring(2);
        System.out.println(str2);


        String str3 = "DevX".substring(0, 2);
        System.out.println(str3);

        String str4 = "Stanford".substring(2, 5);
        System.out.println(str4);

        System.out.println("=========================");

        //String is immutable !!!
        String name = "Elon Musk";
        name.substring(5);
        System.out.println(name); //"Elon Musk"

        name = name.substring(5); // -> creates a new string "Musk"
        System.out.println(name); // "Musk"






    }
}
