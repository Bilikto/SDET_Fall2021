package collections.arraylist;

import java.util.ArrayList;

public class ArrayListWithIntegers {

    //Java 5 has introduced a way of storing primitive types into ArrayList
    //by providing the data type to be a wrapper class

    public static void main(String[] args) {

        ArrayList<Integer> testScores = new ArrayList<>();

        testScores.add(96);
        testScores.add(75);
        testScores.add(68);
        testScores.add(90);
        System.out.println(testScores);

        testScores.add(2, testScores.get(2) + 5);

        System.out.println(testScores);

        testScores.set(2, 55);

        System.out.println(testScores);

        for(int i = 0; i < testScores.size(); i++) {
            System.out.println(testScores.get(i));
        }

        for(int i: testScores) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Below for Each is used for printing only: ");

        //forEach()
        testScores.forEach(System.out::print);

    }
}
