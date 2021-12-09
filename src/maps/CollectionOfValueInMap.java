package maps;

import java.util.*;

public class CollectionOfValueInMap {

    public static void main(String[] args) {
        /*
        * values() --> returns a "collection" of values contained in the map.
        *
        * */

        Map <String, Integer> carYearBuilt = new HashMap<>();

        carYearBuilt.put("Camaro", 1965);
        carYearBuilt.put("Mustang", 2001);
        carYearBuilt.put("Accord", 2019);
        carYearBuilt.put("Impala", 1976);
        carYearBuilt.put("Camry", 2020);
        carYearBuilt.put("Highlander", 2021);

        Collection<Integer> yearsBuilt = carYearBuilt.values();
        System.out.println(yearsBuilt);

        Set<String> cars = carYearBuilt.keySet();
        System.out.println(cars);


    }
}
