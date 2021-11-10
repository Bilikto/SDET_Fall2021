package strings;

public class StringsIntro {

    /*
    * String is a non-primitive reference type;
    * Strings are sequence of characters, or aka array of characters
    * Any character that`s between " " is a String object
    * String are immutable objects;
    * String class has methods that can be used to manipulate it`s objects.
    *
    * There are 2 ways to create a string:
    * 1. String nameOfSchool = "DevX";   --> String literal
    * 2. String nameOfSchool = new String("DevX");
    *
    * The first way of creating a string object will check if there is an object[value]
    * that already exists in the String Pool [memory allocated specifically used for storing String literals]
    * and if it does then simply makes the object point to that value and if it doesn`t then there will be
    * a new value created for that literal.
    *
    * The second way of creating a string object will create a new object within Heap memory even if the object with same value [data]
    * exist in the heap memory, it will keep creating new object for each String object created.
    *
    * Note: The reason behind creating a String Pool within heap memory is because String objects are used consistently more times than
    * other objects therefore it can affect on the memory performance of the application, so Java dev community has created a separate String pool
    * within heap memory to store same values to the string literals
    * so that JVM can make the same String literals point to the value if it exists in the String pool rather than
    * keep creating new objects within Heap memory
    *
    * */

    public static void main(String[] args) {
        String school = "Devx";

        String school1 = school;

        school = "DevxSchool";

        System.out.println("School: " + school);
        System.out.println("School1: " + school1);

        String school2 = new String();
        String school3 = new String("Standford");

        school2 = school3;

        school3 = "Princeton";

        System.out.println("School3: " + school3);
        System.out.println("School2: " + school2);
    }


}
