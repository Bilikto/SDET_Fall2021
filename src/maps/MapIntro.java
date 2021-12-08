package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    /**
     * Map is an interface that`s part of Java Collections Framework
     * Map stores Objects in Key - Value pair aka "entry"
     * We can store same "Values" but unique Keys
     * Map interface has 3 implementations:
     * - HashMap<K, V> --> without any orders of the keys, allows null key
     * - LinkedHashMap<K, V> --> orders elements in inserted order of the entries, allows one null key
     * - TreeMap<k, V> --> orders it`s elements in natural order of the keys, does not allow null key
     *
     * Methods:
     * put(K, V) --> is used for adding, inserting elements [entries] into a map collection
     * get(Object K) --> method returns the value associated with the specified key, or returns null if the map contains no mapping for the key
     * containsKey(Object K) --> returns true if the map contains a mapping for the specified key.
     * remove(Object K) --> Method removes the mapping for a key from the map if it is present (we care about only the key, and the value does not matter).
     *                      This method returns the value to which the map previously associated the key, or null if the map doesn’t contain mapping for the key.
     * replace(K, V) --> Method replaces the entry for the specified key only if it is currently mappingto some value.
     *                   This method returns the previous value associated with thespecified key.
     *
     *
     *
     */

    public static void main(String[] args) {

        //Using ArrayList
//        String ssnElena = "011-10-1011";
//        String nameElena = "Elena Sova";
//
//        ArrayList<String> infoElena = new ArrayList<>();
//        infoElena.add(ssnElena);
//        infoElena.add(nameElena);
//
//        int indexOfSSN = infoElena.indexOf("011-10-1011");
//        System.out.println("Here is the name associated with this SSN: " + infoElena.get(indexOfSSN + 1));

        //Using Map
        // created an object of map with String type for key and value
        Map<String, String> map = new HashMap<>();

        //put()
        map.put("012-12-1221", "Karishma Chintala");
        //we can store same values but different Keys
        map.put("012-12-1256", "Karishma Chintala");
        map.put("010-00-0934", "Karishma Chintala");
        System.out.println(map);

        //When we use put() method with the existing key
        // then we will update the value associated that key
        map.put("012-12-1256", "Elmaz Safina");
        System.out.println(map);

        //get()
        String name = map.get("012-12-1221");
        System.out.println(name);

        //containsKey(Object K)
        boolean hasKeyFour = map.containsKey("012-12-1221");
        System.out.println(hasKeyFour); //true

        boolean hasKeyNine = map.containsKey("000-12-0000");
        System.out.println(hasKeyNine); //false



    }

}
