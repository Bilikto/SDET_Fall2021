package java_recap.java_practice;

public class FibonacciExample {
    /**
     * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
     * The first two numbers of fibonacci series are 0 and 1.
     *
     * There are two ways to write the fibonacci series program in java:
     * - Fibonacci Series without using recursion
     * - Fibonacci Series using recursion
     * */

    public static void main(String[] args) {

        //without using recursion
//        int n1 = 0, n2 = 1, n3, count = 10;
//        System.out.print(n1 + " " + n2);
//
//        for(int i = 0; i < count; i++) {
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.print(" " + n3);
//        }


        //using recursion
        System.out.print(n1 + " " + n2);
        printFibonacci(10);


        //find nth number of Fibonacci
//        System.out.println(getNthFibonacciNumber(0));
//        System.out.println(getNthFibonacciNumber(1));
//        System.out.println(getNthFibonacciNumber(2));
//        System.out.println(getNthFibonacciNumber(5));
//        System.out.println(getNthFibonacciNumber(6));
    }

    private static int n1 = 0;
    private static int n2 = 1;
    public static void printFibonacci(int count) {
        if(count > 0) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }


//    public static int getNthFibonacciNumber(int n) {
//        int[] f = new int[n + 1];
//        f[0] = 0;
//        if(n > 0) {
//            f[1] = 1;
//            for(int i = 2; i <= n; i++) {
//                f[i] = f[i-1] + f[i-2];
//            }
//        }
//        return f[n];
//    }


}
