package class_structures_oca_ch_1;

import java.util.Random;
/*
* The purpose of Javadoc comment is to make the user [developer, programmer] to pay attention to read it.
*
* @by: BahaUson
* */

public class ClassStructure {

    public static void main(String[] args) {

        //comment
        System.out.println("Hello World!");
        System.out.println("Welcome to your first class");
        System.out.println();
        System.out.print("We are covering class structure");

        System.out.println();
        System.err.println("Hello World!");

        Random random = new Random();
        System.out.println("The number below is printed randomly within 0 - 10");
        System.out.println(random.nextInt(10));

        ClassStructure newClass = new ClassStructure();
    }



}
