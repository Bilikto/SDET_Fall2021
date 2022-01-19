package java_recap.java_practice;

public class PrimeNumber {
    /*
    * Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers
    * can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
    * Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
    * */

    public static void main(String[] args) {

//        System.out.print("prime number between 1 to 100\n");
//        int flag = 0;
//        String primeNums = "";
//
//        for(int i = 2; i <= 100; i++) {
//
//            for(int j = 1; j <= i; j++) {
//                if(i % j == 0) { // 2%1 == 0, 3%1 == 0 !!!
//                    flag++;
//                }
//            }
//
//            if(flag == 2) {
//                System.out.print(primeNums+ i + " ");
//            }
//
//            flag = 0;
//        }


        //Another way
        System.out.println(isPrimeNumber(13));
    }

    public static boolean isPrimeNumber(int n) {
        int i = 1;
        int flag = 0;

        while(i <= n) {
            if(n % i == 0) {
                flag++;
            }
            i++;
        }


        if(flag == 2) {
            return true;
        }
        return false;
    }
}
