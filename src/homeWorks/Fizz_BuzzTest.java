package homeWorks;

/*FizzBuzz is a fun game mostly played in elementary school. The rules are simple: when your turn arrives, you say the next number.
However, if that number is a multiple of five, you should say the word “fizz” (preferably with a French accent) instead.
If the number is a multiple of seven, you should say “buzz.” And if it is a multiple of both, you should say “fizzbuzz.”
If you mess up, you’re out, and the game continues without you.*/

public class Fizz_BuzzTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
