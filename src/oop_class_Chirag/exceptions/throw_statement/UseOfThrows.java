package oop_class_Chirag.exceptions.throw_statement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//"Throws" used to announce that method throws exception (used in a method signature)
//"Throw" used to throw our custom new exception

public class UseOfThrows {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader(new File(""));

        method1();
    }

    public static void method1() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        method3();
    }

    public static void method3() throws FileNotFoundException {
        int i = 1;

        if(i != 0) {
            throw new FileNotFoundException("I is not zero");
        }
    }




}
