package methods;

public class PrintVoidMethod {
    public static void main(String[] args) {
        printHello();

    }

    // "static" optional specifier makes this method accessible from other methods
    // by just calling it`s name
    public static void printHello() {
        System.out.println("Hello world!");
    }
}
