package oop_class_Chirag.exceptions;

public class ExceptionMultipleCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        String str = null;
        int[] data = new int[5];

        try {
            System.out.println(a/b); //error here
            System.out.println(str.length()); //never executed
            System.out.println(data[5]); //never executed
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("1");
        } catch(NullPointerException e) {
            System.out.println("2");
        } catch(ArithmeticException e) {
            System.out.println("3"); //only 3
        } catch(Exception e) { //Root exception class must be at the end of try catch block..
            System.out.println("4");
        }
    }





}
