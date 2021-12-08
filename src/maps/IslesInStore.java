package maps;

import java.util.HashMap;
import java.util.Map;

public class IslesInStore {
    public static void main(String[] args) {

        Map<Byte, String> islesMap = new HashMap<>();

        // since Java treads numbers as integers by default
        // we need to explicitly type cast the "byte" and autoboxing it to an Object of it`s type
        islesMap.put((byte) 1, "Pharmacy");
        islesMap.put((byte) 2, "Pharmacy");
        islesMap.put((byte) 3, "Fruits");
        islesMap.put((byte) 4, "Vegetable");
        islesMap.put((byte) 5, "Home goods");
        islesMap.put((byte) 6, "Electronics");
        islesMap.put((byte) 7, "Bakery");
        islesMap.put((byte) 8, "Kids Department");

        System.out.println(islesMap);

        System.out.println(islesMap.get((byte) 5));

        //containsKey(Object K) --> returns true if the map contains a mapping for the specified key.
        boolean hasKeyFour = islesMap.containsKey((byte) 4);
        System.out.println(hasKeyFour); //true

        boolean hasKeyNine = islesMap.containsKey((byte) 9);
        System.out.println(hasKeyNine); //false





    }
}
