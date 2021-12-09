package practice_with_Fenton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {

        /*
        byte -- >  Byte
        short -->  Short
        int -->    Integer
        long -->   Long
        double --> Double
        float -->  Float
        boolean --> Boolean
        char --> doesn`t have wrapper class
        */

        int num1 = 12;
        int num2 = 13;
        int num3 = 14;
//        Integer wrapperInt = Integer.valueOf(num);

//        String numStr = "15";
//        int num2 = Integer.parseInt(numStr);
//        Integer wrapperInt2 = Integer.valueOf(numStr);
//        System.out.println(wrapperInt2);

        int[] arrNums = {1, 5, 88, 98, 101};
//        List<Integer> arrN = new ArrayList<Integer>(Arrays.asList(arrNums));
//        System.out.println(arrN.toArray());

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(Integer.valueOf(num1));
        numList.add(num2);
        numList.add(num3);

        String[] str = {"New York", "Washington", "Baltimore"};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
        System.out.println(strList);



    }
}
