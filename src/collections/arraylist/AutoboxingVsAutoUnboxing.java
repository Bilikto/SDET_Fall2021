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
        Character cObj = 'h';
        char cPrimitive = cObj;
        System.out.println(cPrimitive);

        Double str = 12.0;
        double dbl = str;
        System.out.println(dbl);

        //AutoUnboxing
        Double temp = 87.45;
        double tempPrimitive = temp;



    }
}
