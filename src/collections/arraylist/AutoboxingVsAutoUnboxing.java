package collections.arraylist;

public class AutoboxingVsAutoUnboxing {

    //Boxing --> converting primitive to Wrapper Object manually
    //Autoboxing --> converting primitive to Wrapper Object type automatically java handles it

    //Unboxing --> converting Wrapper object to primitive type
    //AutoUnboxing --> converting Wrapper object to primitive

    public static void main(String[] args) {

        //Boxing
        int i = 77;
        Integer iObj = Integer.valueOf(i);

        //Autoboxing
        int age = 67;
        Integer ageObj = age;

        //Unboxing
        Character cObj = new Character('h');
        char cPrimitive = cObj.charValue();

        //Autoboxing
        Double temp = 87.45;
        double tempPrimitive = temp;



    }
}
