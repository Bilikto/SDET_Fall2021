package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AirportsMap {
    public static void main(String[] args) {

        Map<String, String> airportCodes = new HashMap<>();

        airportCodes.put("ORD", "Chicago International O`hare Airport");
        airportCodes.put("JFK", "John F. Kennedy");
        airportCodes.put("ATL", "Hartsfield-Jackson Atlanta");

        Set<Map.Entry<String, String>> entryOfAirports = airportCodes.entrySet();

        for(Map.Entry<String, String> airport : entryOfAirports) {
            //System.out.println(airport);
            System.out.printf("%s : %s%n", airport.getKey(), airport.getValue());
//            System.out.println(airport.getKey());
//            System.out.println(airport.getValue());
//            System.out.println(airport.getClass());
        }



    }
}
