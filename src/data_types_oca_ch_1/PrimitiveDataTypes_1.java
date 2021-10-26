package data_types_oca_ch_1;

public class PrimitiveDataTypes_1 {

    public static void main(String[] args) {

        //byte
        //variable names are also CamelCase but only the first letter is lowercase
        //all var should have a data type and a name for that variable
        //this process is called declaring a variable
        byte b; //declared a byte type variable name b
        byte b1; //declared a byte type variable name b1

        //variable names cannot be the same
        // there will be a naming conflict

        b = 13; // assigning a value to a variable is called initialization a variable
        System.out.println(b);

        b1 = 7;
        System.out.println(b1);

        byte b2 = b;
        System.out.println(b2);

        //int
        int minNum = -2_147_483_647; //underscores are also allowed to be included in the value for whole number
        System.out.println(minNum);

//        multiple variables can be declared in one statement
//        but have to have same type
        int numberOfComments = 58, numberOfLikes, numberOfFollowers = 1_000_000;
        numberOfLikes = 999_000;
//        int numberOfComments;
//        int numberOfLikes;
//        int numberOfFollowers;


    }



}
