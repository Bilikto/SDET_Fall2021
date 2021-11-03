package methods;

public class CallingMethodWithAnArgumentPassed {
    public static void main(String[] args) {

        sayHi("Billy");

    }

    //private means this method can only be called within this class
    private static void sayHi(String str) {
        System.out.println(str);

    }
}

