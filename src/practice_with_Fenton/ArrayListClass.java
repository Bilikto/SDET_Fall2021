package practice_with_Fenton;

import java.util.*;

public class ArrayListClass {

    public static void main(String[] args) {

        //Boxing --> converting primitive to Wrapper Object manually
        //Autoboxing --> converting primitive to Wrapper Object type automatically java handles it

        //Unboxing --> converting Wrapper object to primitive type
        //AutoUnboxing --> converting Wrapper object to primitive

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

//        int[] arrNums = {1, 5, 88, 98, 101};
//        ArrayList<int[]> listNums = new ArrayList<>(Arrays.asList(arrNums));
//        System.out.println(Arrays.toString(listNums.get(0)));


//        List<Integer> arrN = new ArrayList<Integer>(Arrays.asList(arrNums));
//        System.out.println(arrN.toArray());

//        ArrayList<Integer> numList = new ArrayList<>();
//        numList.add(Integer.valueOf(num1));
//        numList.add(num2);
//        numList.add(num3);

//        String[] str = {"New York", "Washington", "Baltimore"};
//        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
//        System.out.println(strList);

    //===============================================================================================================

        /*Methods:
        add();
        get();


         */
      /*  int[] arrNums1 = {1, 5, 88, 98, 101};
        int[] arrNums2 = {2, 8, 108, 99, 11};
        List<int[]> scoreList = new ArrayList<>(Arrays.asList(arrNums1));
        scoreList.add(arrNums2);
        System.out.println(Arrays.toString(scoreList.get(0)));
        System.out.println(Arrays.toString(scoreList.get(1)));*/

        List<Integer> nums = new ArrayList<>();
        nums.add(80);
        nums.add(55);
        nums.add(90);
        nums.add(35);
        System.out.println(nums.get(1));


        //Collections.sort()
        Collections.sort(nums);
        System.out.println(nums);



    }
}
