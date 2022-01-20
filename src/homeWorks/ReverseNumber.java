package homeWorks;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 98765;
        int reverse = 0;

//        System.out.println(1234 % 10);

        //using while loop
//        while(num != 0) {
//            int reminder = num % 10;
//            reverse = reverse * 10 + reminder;
//            num = num/10;  //---> 1234/10 = 123 then 123/10 = 12 then 12/10 = 1 then 1/10 = 0!
//        }
//
//        System.out.println(reverse);

        //Using for loop
        for(; num != 0;) {
            int reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num/10;
        }

        System.out.println(reverse);
    }
}
