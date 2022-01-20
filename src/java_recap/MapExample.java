package java_recap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();
        mapObj.put("ah", 10);
        mapObj.put("b", 20);
        mapObj.put("c", 30);
        mapObj.put("d", 40);
        mapObj.put("eb", 50);

        int n = mapObj.get("ah");
        System.out.println(n);

        for(Map.Entry<String, Integer> obj : mapObj.entrySet()) {
            System.out.print(obj.getKey() + " " + obj.getValue() + " ");
        }

        System.out.println();

        //Traversing Map
        //Converting to Set so that we can traverse
        Set<String> keys = mapObj.keySet();
        for(String key : keys) {
            System.out.println(key);
        }

        Collection<Integer> values = mapObj.values();
        for(Integer val : values) {
            System.out.println(val);
        }




    }
}
