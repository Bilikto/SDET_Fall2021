package oop_class_Chirag.exceptions;

public class FinallyBlockExample {
    public static void main(String[] args) {
        int a = 10, b = 0;

//        try {
//            System.out.println("opening browser1");
//            System.out.println(a / b);
//        } catch(NullPointerException e) {
//            System.out.println("4");
//        } finally {
//            System.out.println("closing browser1"); //--> without finally block won`t execute
//        }


        //Compare two blocks
        try {
            System.out.println("opening browser2");
            System.out.println(a / b);
        } catch(Exception e) {
            System.out.println("4");
        } finally {
            System.out.println("closing browser2");
        }


    }


}
