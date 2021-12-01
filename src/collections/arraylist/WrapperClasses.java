package collections.arraylist;

public class WrapperClasses {

    public static void main(String[] args) {

        int primitive = Integer.parseInt("123"); //--> converts a String to an "int" primitive
        System.out.println(primitive);

        Integer wrapper = Integer.valueOf("123"); //--> converts a String to an "Integer" wrapper class
        System.out.println(wrapper);

//        Integer wrapperInt = Integer.valueOf("123.45"); //--> NumberFormatException: For input string: "123.45"
//        System.out.println(wrapperInt);

        String wrapperStr = String.valueOf("123.45"); //--> NumberFormatException: For input string: "123.45"
        System.out.println(wrapperStr);

        System.out.println("====================================================");

        String stringNumber = "2021";

        System.out.println(stringNumber + 5); //20215

        short shortPrimitive = Short.parseShort(stringNumber);
        System.out.println(shortPrimitive + 5); //2026

        Short shortWrapper = Short.valueOf(stringNumber);
        System.out.println(shortWrapper + 5); //2026

        short added2Shirts = (short) (shortPrimitive + 5); // --> when we use arithmetic operation the expression is converted to integer!
        System.out.println(added2Shirts);


        String yearBuilt = "1977";

        System.out.println(yearBuilt + 1);

        int intValueOfYear = Integer.parseInt(yearBuilt); // parseInt method comes from Integer class and it parses String to on int (primitive)

        System.out.println(intValueOfYear + 1);

        //Now let`s try to get the Integer object value of String yearBuilt
        Integer wrapperInt = Integer.valueOf(yearBuilt);

        System.out.println("==============================================================");
        char c = 'a';

        Character objC = Character.valueOf(c); //converted primitive type c to an Object of Character objectC

        char numC = '8';

        int primitiveIntC1 = Integer.parseInt(Character.toString(numC));

        System.out.println(primitiveIntC1); //8

        int primitiveIntC2 = Integer.parseInt(String.valueOf(numC)); //converted char to String and then parsing String to an int

        System.out.println(primitiveIntC2); //8

        //Converted char to int by using getNumericValue() method of Character class
        int primitiveOfChar = Character.getNumericValue(numC); // Returns the int value that the specified character (Unicode code point) represents

        System.out.println(primitiveOfChar); //8

        if(primitiveIntC1 == primitiveOfChar) System.out.println("Yes, these 2 values are equal");

        System.out.println(Character.isDigit(c)); //false
        System.out.println(Character.isDigit(numC)); //true

        System.out.println(Character.isAlphabetic(c)); //true
        System.out.println(Character.isAlphabetic(numC)); //false

        System.out.println(Character.isLetter(c)); //true
        System.out.println(Character.isLetter(numC)); //false

        System.out.println(Character.isLetterOrDigit(c)); //true
        System.out.println(Character.isLetterOrDigit(numC)); //true







    }
}
