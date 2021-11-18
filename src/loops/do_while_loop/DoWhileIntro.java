package loops.do_while_loop;

public class DoWhileIntro {
    public static void main(String[] args) {
        // do while statement will iterate at least once before checking the expression
        // A do..while loop allows a series of instructions in the body of the loop to run
        // once before validation of the condition that controls the loop.

        int i = 1;
        do {
            System.out.println("The number of iteration is " + i);
            i++;
        } while(i <= 5);

    }
}
