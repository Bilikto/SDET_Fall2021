package practice_with_Fenton;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClass {

    public static void main(String[] args) {
/* //                             0         1           2            3
        String[] cities = {"Boston", "New York", "Chicago", "Washington DC"};
        System.out.println("The length is: " + cities.length); //4

        String city0 = cities[0];
        String city1 = cities[1];
        String city2 = cities[2];
        String city3 = cities[3];
        System.out.println(city0 + ", " + city1 + ", " + city2 + ", " + city3);
//        cities[4] = "Los Angeles";
//        System.out.println(cities[4]); //ArrayIndexOutOfBoundsException


        String[] newCitiesArr = new String[4];
        System.out.println(newCitiesArr.length); //4
        newCitiesArr[0] = "Boston";
        newCitiesArr[1] = "New York";
        newCitiesArr[2] = "Chicago";
        newCitiesArr[3] = "Washington DC";

        System.out.println(Arrays.toString(newCitiesArr));

        for(int i = 0; i < newCitiesArr.length; i++) {
            System.out.println(newCitiesArr[i]);
        }


        int[] indexes = {22842, 36985, 15478, 65412, 85246};
        System.out.println(Arrays.toString(indexes));

        for(int i = 0; i < indexes.length; i++) { // 0+1=1 1<5=true 1+1=2 2<5=true 2+1 = 3 3 < 5 = true 3 + 1 = 4 4< 5 = true 4 + 1 = 5 5 < 5 = false --> goes to out
            System.out.println(indexes[i]); // 0 1 2 3 4
        } */

        //for loop
/*        int[] phoneNumbers = {751453689, 571366548, 968947512, 30175589};

        for(int everyNum : phoneNumbers) {
            System.out.println(everyNum);
        }

        //sort
        Arrays.sort(phoneNumbers);
        System.out.println(Arrays.toString(phoneNumbers));


        String[] cities = {"Boston", "New York", "Chicago", "Washington DC", "500", "2ABS"};
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities)); //[2ABS, 500, Boston, Chicago, New York, Washington DC] */

        //copy
        String[] cities = {"Boston", "New York", "Chicago", "Washington DC", "500", "2ABS"};
        String[] copyOfCities;

        copyOfCities = Arrays.copyOf(cities, cities.length);

        copyOfCities[1] = "Seattle";

        System.out.println(Arrays.toString(copyOfCities));
        System.out.println(Arrays.toString(cities));


    }
}
