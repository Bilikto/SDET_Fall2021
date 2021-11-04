package methods;

public class MethodExWithVariables {
    public static void main(String[] args) {

        printAddress(6, "Santa-Monica blvd", "Los-Angeles", "CA", 90015);

    }

    public static void printAddress(int unitNumber, String street, String city, String state, int zip) {
        System.out.println("The address is: " + unitNumber + " " + street + ", " + city + ", " + state + " " + zip);
    }
}
