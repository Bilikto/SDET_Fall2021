package loops.for_loop;

public class ForLoopIntro {
    public static void main(String[] args) {

        /*
        * For loop statement are used when we know the number of times the loop
        * needs to iterate over. The structure is:
        * for (initialization; boolean exp; update of value) {
        * statement;
        * }
        * */

//        int num = 10;
//        for(int i = 0; i <= num; i++) {
//            System.out.println(i);
//        }

        for(int a = 0, b = 1; a < 5 || b < 10; a++, b++) {
//            System.out.println(a);
//            System.out.println(b);
            System.out.println("The value of 'a': " + a + ". The value of 'b': " + b);
        }



    }
}
