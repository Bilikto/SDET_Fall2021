package homeWorks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddPlusToString {
    public static void main(String[] args) {

//        String[] str = {"aplha", "beta", "gamma"};
//        List<String> strList = new ArrayList<>(Arrays.asList(str));

//        List<String> strList = new ArrayList<>(10);

        ArrayList<String> strList = new ArrayList<>(); // size 0, capacity 10
//        System.out.println(strList.size());
        strList.add("aplha");
        strList.add("beta");
        strList.add("gamma");
        //System.out.println(strList);

        System.out.println(getStringWithPlus(strList));
    }

    public static ArrayList<String> getStringWithPlus(ArrayList<String> arrList) {

        ArrayList<String> newArrList = new ArrayList<>();
        for(String word : arrList) {
            newArrList.add(word + "+");
        }

        return newArrList;

    }




}
