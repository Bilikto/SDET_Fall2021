package java_recap;

public class ForLoopExamples {
    public static void main(String[] args) {
//        //Nested for loop
//        for(int i = 1; i <= 3; i++) {
//            for(int j = 1; j <= 3; j++) {
//                System.out.println(i+ " " + j);
//            }
//        }
//
//        System.out.println("================================");
//
//        //Labeled for loop
//        aa: for(int i = 1; i <= 3; i++) {
//            bb: for(int j = 1; j <= 3; j++) {
//                    if(i == 2 && j == 2) {
//                        break aa;
//                    }
//                    System.out.println(i+ " " +j);
//                }
//            }

        System.out.println("================================");

        for(int i = 1; i < 5; i++) {
            for(int j = i; j < i; j++) {
                System.out.println("Hello");
            }
        }

    }
}
