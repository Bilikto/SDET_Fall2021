package data_types_oca_ch_1;

/*
    In Java, "non-primitive" data types are known as "reference types".
    A "reference type" refers to an object (an instance of a class). Unlike primitive types that hold
    their values in the memory where the variable is allocated, references do not hold the value
    of the object they refer to. Instead, a reference “points” to an object by storing the memory
    address where the object is located, a concept referred to as a pointer. Unlike other
    languages, Java does not allow you to learn what the physical memory address is. You can
    only use the reference to refer to the object.
*/

public class NonPrimitiveDataTypes_1 {
    public static void main(String[] args) {

        String firstName = "Negesti";
        String lastName = "Gomez";
        String favoriteCar = "Honda";
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(favoriteCar);

        //String can have very large amount of words or characters in it
        //String is a sequence of characters in cadence



    }
}
