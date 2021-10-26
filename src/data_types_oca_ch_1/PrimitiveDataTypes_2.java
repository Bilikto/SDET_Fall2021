package data_types_oca_ch_1;

public class PrimitiveDataTypes_2 {

    public static void main(String[] args) {

        // long
//        long numberOfViews;
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        numberOfViews = 1_000_000_000;
//        numberOfViews = 3_000_000_000L; //for long data type we need to include "L" to the end of the value
//        System.out.println(numberOfViews);

        // float
        float floatNum = 3.1234567F;
        System.out.println(floatNum); //for float data type we need to include "F" to the end of the value
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        // double
        double pi = 3.14; //for double to put "D" is optional! Best practice not to put it.
        System.out.println(pi);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // boolean data type is a primitive type that has only 2 states: true/false
        boolean isPresent;
        isPresent = true;
        isPresent = false;

        boolean has4tires = true;
        boolean isCold = false; //during summer

        // char [character] that can hold only one character as a value
        // they can be used for different scenarios EX: grades. gender etc.
        // char use single quotes to wrap it`s value
        char gender = 'M';
        char gradeExcellent = 'A';
        char gradeGood = 'B';
        char decimalOfLetterG = 71;
        System.out.println(decimalOfLetterG); //G

        System.out.println("============================");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println("============================");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


    }

}
/*
//What are data types?
//primitive and non-primitive (Objects) data types.
//numeric  -> byte, short, int, float(4 bytes), double (8byte)

//bytes refer to how much space this type of info takes in the memory.

//data types are means to manage different kind of information
//why do we have byte, short, int, long? - it is all about memory management


//each data types will have it`s own functionalities and meaning

having different data types:
1. in case of whole numbers we have a good number of options to optimized memory usage.
2. in case of whole numbers vs floating points -> we have an advantage of using information that has decimal points.

Disadvantages of automation is





 */
