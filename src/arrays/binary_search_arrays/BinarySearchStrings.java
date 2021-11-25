package arrays.binary_search_arrays;

import java.util.Arrays;

public class BinarySearchStrings {
    public static void main(String[] args) {

        String[] schools = new String[]{"Devx", "ItSchool", "IIT", "CaterpillarAcademy"};

        System.out.println(Arrays.toString(schools));

        System.out.println("Before searching index of 'IIT' is random: " + Arrays.binarySearch(schools, "IIT")); // -2 before sort

        Arrays.sort(schools);

        System.out.println("After searching index of 'IIT' is: " + Arrays.binarySearch(schools, "IIT")); // 2

        System.out.println("==============================================================================");

        System.out.println("The number of times 'e' appears in schools is: " + Arrays.toString(schools) + " -> " + findOfChars(schools, 'e'));
    }

    static int findOfChars(String[] str, char target) {
        int count = 0;
//        for(int i = 0; i < str.length; i++) {
//            for(int j = 0; j < str[i].length(); j++) {
//                if (str[i].charAt(j) == target) {
//                    count++;
//                }
//            }
//        }

        for(String word: str) {
            for(int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == target) {
                    count++;
                }
            }
        }
        return count;
    }

}
