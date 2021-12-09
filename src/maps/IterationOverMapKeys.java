package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationOverMapKeys {
    public static void main(String[] args) {
        /*
        * One of the way to iterate over Map is using keySet() method of Set interface
        * which returns the "Set" view of map`s keys
        *
        * keySet() --> returns a "Set" view of the keys contained in the map. Hence we can iterateover the keys of the map.
        * values() --> returns a collection of values contained in the map.
        * entrySet() --> entrySet(): returns a "Set" view of the mappings contained in this map.
        *
        *
        * */

        Map<Integer, String> cityCodes = new HashMap<>();
        cityCodes.put(312, "Chicago");
        cityCodes.put(213, "LA");
        cityCodes.put(323, "LA");
        cityCodes.put(347, "NY");
        cityCodes.put(333, "Philadelphia");
        cityCodes.put(100, null);

        Set<Integer> keySetOfCities = cityCodes.keySet();// --> returns SET
        System.out.println("The keys in this map are: " + keySetOfCities);

        for(Integer key: keySetOfCities) {

            System.out.println(key + " : " + cityCodes.get(key));

        }





    }
}
