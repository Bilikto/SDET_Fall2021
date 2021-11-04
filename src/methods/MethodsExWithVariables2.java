package methods;

public class MethodsExWithVariables2 {
    public static void main(String[] args) {

        int unit = 5;
        String streetName = "Las Palms st.";
        String cityName = "Santa Clarita";
        String stateName = "CA";
        int zipCode = 90072;

        printAddress(unit, streetName, cityName, stateName, zipCode);

    }
    public static void printAddress(int unitNumber, String street, String city, String state, int zip) {
        System.out.println("The address is: " + unitNumber + " " + street + ", " + city + ", " + state + " " + zip);
    }
}
