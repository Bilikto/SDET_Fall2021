package loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        * while loop --> repetition control structure in Java
        * */


        // in below while statement we are printing numbers from 1 to 10 including
        // and in order to break the iteration of the loop
        // we have to the control the condition to evaluate to false
        int n = 1;
        while(n <= 10) {
            System.out.print(n);
            n++;
        }

        System.out.println();

        int c = 10;
        while(c > 0) {
            System.out.print(c);
            c--;
        }

        System.out.println();

        //find even numbers
        int v = 1;
        while(v <= 10) {
            if (v % 2 == 0) {
                System.out.print(v);
            }
            v++;
        }



    }
}
