package interview_questions_Baha.solutions;

import java.util.*;

public class MacDonald {
    private static Scanner scanner = new Scanner(System.in);

    private static int amountOfItem;
    private static char selectedOption;
    private static char answer;
    private static double totalPrice;
    private static String orderItems= "";

    public static void main(String[] args) {

        Map<String, Double> listOfBurgers = new HashMap<>();
        listOfBurgers.put("CheeseBurger", 0.99);
        listOfBurgers.put("McChicken", 1.99);
        listOfBurgers.put("Big Mac", 3.99);

        Map<String, Double> listOfDrinks = new HashMap<>();
        listOfDrinks.put("Coke", 0.49);
        listOfDrinks.put("Diet Coke", 0.49);
        listOfDrinks.put("Sprite", 0.49);

        Map<String, Double> listOfSalads = new HashMap<>();
        listOfSalads.put("Caesar", 2.49);
        listOfSalads.put("Grilled Chicken", 3.49);
        listOfSalads.put("Green salad", 2.99);

        System.out.println("Welcome to McDonald's!");
        System.out.println("What would you like to eat?\n(Please choose: 'B' - MacBurgers, 'D' - Drinks, 'S' - Salads)");
        answer = scanner.next().charAt(0);

        switch(answer) {
            case 'B':
                buyItems(listOfBurgers);
                System.out.println("Would you like to drink?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                    buyItems(listOfDrinks);
                }
                System.out.println("Would you like to order salad?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                   buyItems(listOfSalads);
                }
                printTotal();
                break;

            case 'D':
                buyItems(listOfDrinks);
                System.out.println("Would you like to order burgers?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                    buyItems(listOfBurgers);
                }
                System.out.println("Would you like to order salad?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                   buyItems(listOfSalads);
                }
                printTotal();
                break;

            case 'S':
                buyItems(listOfSalads);
                System.out.println("Would you like to order burgers?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                    buyItems(listOfBurgers);
                }
                System.out.println("Would you like to drink?\n(Please type 'Y' for yes and 'N' for no)");
                answer = scanner.next().charAt(0);
                if (answer == 'Y' || answer == 'y') {
                    buyItems(listOfDrinks);
                }
                printTotal();
                break;

            default:
                System.out.println("Sorry, we don`t have item. Please, select 'B' for MacBurgers, 'D' for Drinks, 'S' for Salads");
        }

    }


    public static void buyItems(Map<String, Double> list) {
        String nameOfItem = "";
        double pricePerItem = 0.0;

        for (Map.Entry<String, Double> item : list.entrySet()) {
            nameOfItem = item.getKey();
            pricePerItem = item.getValue();
        }

            printMenu(list);
            selectedOption = scanner.next().charAt(0);

            System.out.println("How many would you like?");
            amountOfItem = scanner.nextInt();

            if (selectedOption == 'A' || selectedOption == 'a') {
                totalPrice +=  pricePerItem * amountOfItem;
                orderItems += amountOfItem + " - " + nameOfItem + "\n";
            } else if (selectedOption == 'B' || selectedOption == 'b') {
                totalPrice +=  pricePerItem * amountOfItem;
                orderItems += amountOfItem + " - " + nameOfItem + "\n";
            } else if (selectedOption == 'C' || selectedOption == 'c'){
                totalPrice +=  pricePerItem * amountOfItem;
                orderItems += amountOfItem + " - " + nameOfItem + "\n";
            } else {
                System.out.println("Please enter the provided choices.");
            }

    }

    public static void printMenu(Map<String, Double> list) {
        System.out.println("Please choose A, B or C:");
        char i = 65;
        for (Map.Entry<String, Double> item : list.entrySet()) {
            System.out.println(i++ + " " + item.getKey() + " $" + item.getValue());
        }
    }

    public static void printTotal() {
        System.out.println("Here is your order details: ");
        System.out.format("The items you ordered are:\n%s", orderItems);
        System.out.format("Your total: $%.2f", totalPrice);
    }

 }

