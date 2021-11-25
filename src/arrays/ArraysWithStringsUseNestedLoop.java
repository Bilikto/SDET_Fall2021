package arrays;

import java.util.Arrays;

public class ArraysWithStringsUseNestedLoop {

    public static void main(String[] args) {

        String[] cities = {"Chicago", "Seattle", "San Francisco", "New York", "Austin", "New Zealand"};

        int[] indexesOfCharA = new int[cities.length];

        for(int i = 0; i < cities.length; i++) {
            indexesOfCharA[i] = cities[i].toLowerCase().indexOf('a');
        }

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(indexesOfCharA));

    }

}
