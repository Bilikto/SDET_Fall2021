package methods.int_return_type;

public class MethodIntReturnEx1 {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(3));
    }

    // methods should have either void or valid return type
    // when declaring them
    // methods can return int, char, boolean etc all primitive and non-primitive types
    // such as String

    public static int addTwoNumbers (int num) {
        return num + 2;
    }
}
