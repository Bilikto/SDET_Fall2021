package homeWorks;

public class Strings {

    public static void main(String[] args) {

        System.out.println("#1");
        String name = "Bill Gates  ";
        String address =  "1 Microsoft Way   |\n|                    Redmond, WA, 98104";
        System.out.println("+-----------------------------------------+\n" +
                           "|                                     ####|\n" +
                           "|                                     ####|\n" +
                           "|                                     ####|\n" +
                           "|                                         |\n" +
                           "|                                         |\n" +
                           "|                          " + name + "   |\n" +
                           "|                       " + address + "   |\n" +
                           "|                                         |\n" +
                           "|                                         |\n" +
                           "+-----------------------------------------+");

        System.out.println();

        System.out.println("#2");
        String myName = "Zed A. Shaw";
        int myAge = 35;
        double myHeight = 74.5;
        double myWeight = 180.0;
        String myEyes = "Blue";
        String myTeeth = "White";
        String myHair = "Brown";

        double total = myAge + myHeight + myWeight;

        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "He's " + myHeight + " inches tall." );
        System.out.println( "He's " + myWeight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add my age ("+ myAge + "), my height (" + myHeight + "), and my weight (" + myWeight
                + ") I get total " + total + "." );

    }

}
