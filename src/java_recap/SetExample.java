package java_recap;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> strList = new HashSet<>();
        strList.add(null);
        strList.add(null);
        strList.add(null);
        System.out.println(strList);//[null]


        //TreeSet
        Set<Integer> intSet = new TreeSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        System.out.println(intSet);

        Set<String> strSet = new TreeSet<>();
        strSet.add("Ar");
        strSet.add("Bs");
        strSet.add("Fg");
        System.out.println(strSet);

    }
}
