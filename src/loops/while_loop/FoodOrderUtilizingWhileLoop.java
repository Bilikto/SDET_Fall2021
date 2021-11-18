package loops.while_loop;

import java.util.Scanner;

public class FoodOrderUtilizingWhileLoop {
    /*
    * 1. Welcome message to customer and ask what would they like?
    * 2. Ask if they would like to order more?
    * 3. and if yes then create a while loop to add orders
    * 4. adding orders should be done in a separate method
    * 5. print out the order items
    * */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Mars_01_cafe. \nWhat would you like today?");
        StringBuilder order = new StringBuilder();
        order.append(scanner.nextLine()).append("\n");

//        String orderedMoreItems = orderMoreItems();
        boolean flag = orderMoreItems().equalsIgnoreCase("yes")
                || orderMoreItems().equalsIgnoreCase("sure")
                || orderMoreItems().equalsIgnoreCase("please");

        while (flag) {
            addMoreItems(order);
            if (!orderMoreItems().equalsIgnoreCase("yes")) flag = false;
        }

        System.out.println("Here is your ordered items:\n" + order);
    }

    public static void addMoreItems(StringBuilder order) {
        System.out.println("What would you like?");
        order.append(scanner.nextLine()).append("\n");
    }

    public static String orderMoreItems() {
        System.out.println("Would you like to order anything else?");
        String moreItems = scanner.nextLine();
        return moreItems;
    }

}
