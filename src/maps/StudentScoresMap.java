package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentScoresMap {

    public static void main(String[] args) {

        Map<String, Double> scoresMap = new HashMap<>();

        scoresMap.put("Elon Mask", 67.5);
        scoresMap.put("John Doe", 78.9);
        scoresMap.put("Bill Gates", 90.0);
        scoresMap.put("Leo Messi", null);


        Set<String> scoresKey = scoresMap.keySet();

        for (String key: scoresKey) {
            System.out.println(key + " --> " + scoresMap.get(key));
        }



    }
}
