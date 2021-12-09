package maps;

import java.util.*;

public class ArraysAsMapValues {

    public static void main(String[] args) {

        // created an object of Map that stores String as a key and String[] array as a value
        Map<String, String[]> majorCitiesOfContinents = new HashMap<>();

        majorCitiesOfContinents.put("EU", new String[]{"London", "Paris", "Barcelona", "Rome"});
        majorCitiesOfContinents.put("North America", new String[]{"Chicago", "Toronto", "Vancouver", "Los Angeles"});
        majorCitiesOfContinents.put("Asia", new String[]{"Bangkok", "Singapore", "Delhi", "Tokyo", "Hong-Kong", "Beijing"});

        System.out.println(Arrays.toString(majorCitiesOfContinents.get("EU")));
        System.out.println(Arrays.toString(majorCitiesOfContinents.get("North America")));
        System.out.println(Arrays.toString(majorCitiesOfContinents.get("Asia")));

        printMajorCities(majorCitiesOfContinents);
    }

    public static void printMajorCities(Map<String, String[]> mapOfMajorCities) { // <-- String is a Array!!!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the continent for the major cities: ");
        String continent = scanner.nextLine().toLowerCase();

        String majorCitiesText = "These are the major cities in " + continent + ": ";

        switch(continent) {
            case "eu", "europe", "european":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("EU")));
                break;
            case "na", "northamerica", "america", "north america":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("North America")));
                break;
            case "asia", "asian":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("Asia")));
                break;
            default:
                System.out.println("We only have the major cities for EU, NA, Asia.");
        }

    }
}
