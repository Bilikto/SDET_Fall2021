package homeWorks;

public class MiddleOfString {
    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
        System.out.println(withoutEnd("ab"));
        System.out.println(withoutEnd("abc"));

    }

    public static String withoutEnd(String str) {

        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }
        return str;

    }
}
