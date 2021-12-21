package practice_with_Fenton;

import java.util.*;

public class ArrayListClass {

    public static void main(String[] args) {

        //Boxing --> converting primitive to Wrapper Object manually
        //Autoboxing --> converting primitive to Wrapper Object type automatically java handles it
        //Unboxing --> converting Wrapper object to primitive type
        //AutoUnboxing --> converting Wrapper object to primitive

        // ArrayList is a collection of objects and it implements "List" interface
        // and it is part of Collection interface. (Collection Framework).
        // ArrayList is dynamic where we can create and manipulate it by adding or removing elements
        // from it, the size can change.

        // ArrayList stores objects, primitives by autoboxing them to their corresponding "wrapper" classes

        // ArrayList elements can be accessed by their index positions.

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
        Collections.sort();
        contains();
        isEmpty();
        equals();
        remove(element name);
        remove(index);
        set();
        Array.asList();
        toArray(); --> returns an Object!
        Autoboxing
        casting


         */


      /*  int[] arrNums1 = {1, 5, 88, 98, 101};
        int[] arrNums2 = {2, 8, 108, 99, 11};
        List<int[]> scoreList = new ArrayList<>(Arrays.asList(arrNums1));
        scoreList.add(arrNums2);
        System.out.println(Arrays.toString(scoreList.get(0)));
        System.out.println(Arrays.toString(scoreList.get(1)));*/

//        List<Integer> numsList = new ArrayList<>();
//        numsList.add(80);
//        numsList.add(55);
//        numsList.add(90);
//        numsList.add(35);
//        System.out.println(numsList);
//        System.out.println(nums.get(1));

        //Collections.sort()
//        Collections.sort(numsList);
//        System.out.println(numsList);

        //contains()
//        boolean hasValue = numsList.contains(80);
//        System.out.println(hasValue);
//
//        if(!numsList.contains(25)) {
//            numsList.add(25);
//        }
//
//        System.out.println(numsList);

        //clear()
//        numsList.clear();

        //isEmpty()
//        System.out.println(numsList);
//        boolean isEmpty = numsList.isEmpty();
//        System.out.println(isEmpty);


        //equals();
//        List<Integer> numsList2 = new ArrayList<>();
//        numsList2.add(66);
//        numsList2.add(99);
//        numsList2.add(33);
//        numsList2.add(44);
//        System.out.println(numsList2);
//
//        boolean isEqual = numsList.equals(numsList2);
//        System.out.println(isEqual);

        //remove()
//        List<String> myStr = new ArrayList<>();
//        myStr.add("NY");
//        myStr.add("NC");
//        myStr.add("AL");
//        boolean isRemovedStr = myStr.remove("NC");
//        System.out.println(isRemovedStr);
//        System.out.println(myStr);
//
//        String removedVal = myStr.remove(1);
//        System.out.println(removedVal);

//        boolean isRemoved = numsList.remove(Integer.valueOf(90));
//        System.out.println(isRemoved);
//        System.out.println(numsList);

        //set()
//        List<Integer> numsList = new ArrayList<>();
//        numsList.add(80);
//        numsList.add(55);
//        numsList.add(90);
//        numsList.add(35);
//        System.out.println(numsList);
//
//        Integer replacedNum = numsList.set(3, 100);
//        System.out.println(replacedNum);
//
//        System.out.println(numsList);

        //Arrays.asList();
//        String[] strArr = {"F 150", "Raptor", "Escape", "Fusion"};
//        System.out.println(Arrays.toString(strArr));
//
//        List<String> fordCars1 = new ArrayList<>(Arrays.asList(strArr));
//        List<String> fordCars2 = Arrays.asList(strArr);
//        System.out.println(fordCars1);
//        System.out.println(fordCars2);
//
//        List<String> fordCars3 = new ArrayList<>(Arrays.asList("F 150", "Raptor", "Escape", "Fusion"));

//        12/20/2021
        // list of objects or collections of objects
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("123");
        list.add('k');
        list.add(true);

        System.out.println(list);
        int a = (int) list.get(0);
        System.out.println(a);


        //toArray(); --> returns an Object!
        ArrayList<String> cities = new ArrayList<>();
        cities.add("NY");
        cities.add("LA");
        cities.add("SF");

        Object[] array1 = cities.toArray();
        String s = (String) array1[1]; // --> casting from Object to String
        String b = (String) array1[0];

        System.out.println(b);

        for(Object str: array1) {
            System.out.println(str);
        }

        // Ways to get elements from Array and ArrayList
        // myArr[0];
        // myArrList.get(0);


        //Boxing --> converting primitive to Wrapper Object manually
        //Autoboxing --> converting primitive to Wrapper Object type automatically java handles it
        //Unboxing --> converting Wrapper object to primitive type
        //AutoUnboxing --> converting Wrapper object to primitive

//        Integer num = new Integer(5);
//        int n = num; //--> AutoUnboxing
//
//        Byte d = 127;
//        byte f = d; //--> AutoUnboxing

//        byte f = 127;
//        Byte d = f; // Autoboxing

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(123);  // Autoboxing
        numList.add(124);
        numList.add(125);

//        System.out.println(numList);
//        System.out.println(numList.get(1));
        numList.set(2, 85);
        for(Integer n : numList) {
            System.out.println(n);
        }

        //Converting from array to ArrayList
        String[] animalsArray = {"Lion", "Wolf", "Penguin", "Polar bear",  "Dolphin"};
        List<String> animalList = Arrays.asList(animalsArray);

        System.out.println(animalList);

        animalsArray[3] = "Cat";

        System.out.println(Arrays.toString(animalsArray));
        System.out.println(animalList);




    }







}
