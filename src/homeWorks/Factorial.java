package homeWorks;

/*
* Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
* 4! = 4*3*2*1 = 24
* 5! = 5*4*3*2*1 = 120
* Here, 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".
*/

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int fact = 1;
        //int i = 1;

//        while(i <= num) {
//            fact = fact * i;
//            i++;
//        }
//
//        System.out.println(fact);

        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(fact);

    }
}
