package oop_class_Chirag.exceptions;

public class TryCatchPractice {
    public static void main(String[] args) {
        String currency = "$12";

        try {
            System.out.println(Integer.parseInt(currency));
        } catch(RuntimeException e) {                        // --> run-time polymorphism
            System.out.println("Error! Can not convert $ into number.");
        }


    }


}
