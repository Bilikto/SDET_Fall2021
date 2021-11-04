package methods;

public class MethodCallsMethod {


    public static void main(String[] args) {

        method1();
        method2();

    }

    private static void method1() {
        method2();
        System.out.println("Method #1");
    }

    private static void method2() {
        System.out.println("Method #2");
    }
}
