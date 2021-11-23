package loops.nested_loops;

public class NestedForLoop {
    //Loops can have unlimited number of inner loops but more than 3 is not recommended,
    //simply just divide them into separate loops


    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j<= 10; j++) {
                System.out.print(j + " x " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
            //if (i == 2) break;
        }

//        OUTER_LOOP: for(int i = 1; i <= 5; i++) {
//            INNER_LOOP:for(int j = 1; j<= 10; j++) {
//                if (i == 2) break OUTER_LOOP;
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }

    }

}
