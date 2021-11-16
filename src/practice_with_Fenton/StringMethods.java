package practice_with_Fenton;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Hello World!";
        String str3 = new String("Hello");
        String str4 = new String("Hello");

//        System.out.println(str1.length()); //12

//        for(int i = 0; i <str1.length(); i++) {
//            System.out.print(str1.indexOf(i));
//        }

        str1.substring(1); //ello World!
        System.out.println(str1);
        System.out.println(str1);
        System.out.println(str1.substring(0, 5));

        String num = "0123";
        int intNum = Integer.parseInt(num);
        System.out.println(intNum + 1);
        System.out.println("" + num + 1);
        System.out.println(Integer.toString(intNum) + 1);

//        System.out.println(str1.indexOf("orl")); //7

//        System.out.println(str1 == str2); //true
//
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//
//        System.out.println(str1.equals(str3));
//
//        System.out.println(str3 == str4); //false
//
//        System.out.println(str3.equals(str4)); //true








    }
}
