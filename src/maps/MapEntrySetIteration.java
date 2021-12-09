package maps;

import java.text.NumberFormat;
import java.util.*;

public class MapEntrySetIteration {
    public static void main(String[] args) {

        /*
        * entrySet() --> entrySet(): returns a "Set" view of the mappings [aka entry --> key value pair] contained in this map.
        * getKey() --> Returns the key corresponding to this entry.
        * getValue() --> Returns the value corresponding to this entry.
        * setValue(V value) --> Replaces the value corresponding to this entry with the specified value (optional operation).
        *
         * */


        Map<String, Integer> populationMap = new HashMap<>();

        populationMap.put("Indonesia", 273_523_615);
        populationMap.put("Mexico", 128_932_753);
        populationMap.put("Japan", 126_476_461);
        populationMap.put("Egypt", 102_334_404);
        populationMap.put("Tanzania", 59_734_218);

        System.out.println("Population map: " + populationMap);

        NumberFormat formatPopulation = NumberFormat.getInstance();
//        System.out.println(formatPopulation.format((populationMap.get("Mexico"))));

        Set<Map.Entry<String, Integer>> entries = populationMap.entrySet();

        System.out.println("Population set: " + entries);

//        for(Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " has population of: " + formatPopulation.format(entry.getValue()));
        }


    }
}
