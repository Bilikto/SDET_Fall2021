package maps;

import java.util.HashMap;
import java.util.Map;

public class CitiesAndZipCodes {
    public static void main(String[] args) {
//        Map<String, Integer> citiesAndZipCodes = new HashMap<>();
//        citiesAndZipCodes.put("Bolingbrook", 60490);
//        citiesAndZipCodes.put("LA", 96051); //this entry will override by second Key "LA"
//        citiesAndZipCodes.put("LA", 97862);
//        citiesAndZipCodes.put("Chicago", 67843);
//
//        System.out.println(citiesAndZipCodes);

        Map<Integer, String> citiesAndZipCodes = new HashMap<>();
        citiesAndZipCodes.put(60490, "Bolingbrook");
        citiesAndZipCodes.put(96051, "LA");
        citiesAndZipCodes.put(97862, "LA");
        citiesAndZipCodes.put(67843, "Chicago");

        System.out.println(citiesAndZipCodes);

        String laStr = citiesAndZipCodes.get(97862);
        System.out.println(laStr);

        String bbStr = citiesAndZipCodes.get(60490);
        System.out.println(bbStr);


        //remove(Object K)
        String removedLA = citiesAndZipCodes.remove(96051);
        System.out.println(removedLA); //LA

        //replace(K, V)
        String replacedLA = citiesAndZipCodes.replace(97862, "San Francisco");
        boolean isReplacedAllLA = citiesAndZipCodes.replace(97862, "San Francisco", "Bay Area");
        System.out.println(replacedLA); //returns previous value
        System.out.println(isReplacedAllLA); //returns boolean
//        System.out.println(citiesAndZipCodes);










    }
}
