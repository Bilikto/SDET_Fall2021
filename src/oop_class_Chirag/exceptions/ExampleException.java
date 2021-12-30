package oop_class_Chirag.exceptions;

public class ExampleException {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println(a - b); //-10

//        int a = 10;
//        int b = 20;
//        System.out.println(a / b); //0


//        int a = 10;
//        double b = 20;
//        System.out.println(a / b); //0.5

//        double a = 10;
//        int b = 20;
//        System.out.println(a / b); //0.5

//        int a = 10;
//        double b = 20;
//        String str = "Hello";
//        System.out.println(str + a / b); //Hello0.5
//        System.out.println(a - b + str); //-10.0Hello
//        System.out.println(str + a - b); //error

//        int a = 10;
//        int b = 0;
//        System.out.println(a / b); //Exception / by zero


        //try - catch
        int a = 10;
        int b = 0;
        int[] data = new int[5];
        String str = null;

        System.out.println("Start...");

        try {
//            System.out.println(data[5]);
//            System.out.println(a / b);
            System.out.println(str.length());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! please try after sometime.");
        } catch(ArithmeticException e) {
            System.out.println("Error! Please don`t enter zero.. it hurts.");
        } catch(NullPointerException e) {
            System.out.println("Error! Object is null...");
        }

        System.out.println("Finish...");

        //We can use dynamic polymorphism --> "exception" class or its child RuntimeException or
        //its childs like IndexOutOfBoundsException..
    }
}
