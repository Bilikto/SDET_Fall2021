package HomeWorks;

public class PrintMicrosoftCEO {
    public static String eMail = "@microsoft.com";

    public static void main(String[] args) {

        printCEO("Executive Vice President and Chief Commercial Officer", "Judson", "Althoff");
        printCEO("Chief Marketing Officer and Executive Vice President, Marketing and Consumer Business", "Chris", "Capossela");
        printCEO("Executive Vice President and Chief Human Resources Officer", "Kathleen", "Hogan");
        printCEO("Executive Vice President and Chief Financial Officer", "Amy", "Hood");
        printCEO("Chairman and Chief Executive Officer", "Satya", "Nadella");
        printCEO("President and Vice Chair", "Brad", "Smith");
        printCEO("Executive Vice President, Business Development, Strategy and Ventures", "Christopher", "Young");

    }

    public static void printCEO(String title, String firstName, String lastName) {
        System.out.println("'" + title + "' - " + firstName + " " + lastName + " - " + firstName + "." + lastName + eMail);
    }

}
