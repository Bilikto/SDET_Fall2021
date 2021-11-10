package strings;

public class StringCharAt {
    public static void main(String[] args) {
//        public char charAt(int index) {
//            return char;
//        }

        // charAt() method returns a character at specific index within the String variable
        System.out.println("DevX School".charAt(1));

        String school = "DevX School";

        System.out.println(school.charAt(3) + school.charAt(4) + school.charAt(5)); // 203 ASCII table

        System.out.println("" + school.charAt(3) + school.charAt(4) + school.charAt(5)); // X S


    }


}
