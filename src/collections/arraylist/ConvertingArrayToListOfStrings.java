package collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToListOfStrings {

    public static void main(String[] args) {

        String[] animalsArray = {"Lion, 'Wolf", "Penguin", "Polar bear",  "Dolphin"};
        System.out.println("Array before converting to List: " + Arrays.toString(animalsArray));

        List<String> animalsList = Arrays.asList(animalsArray);
        System.out.println("List after converting from Array: " + animalsList);

        animalsList.set(2, "White sharks");

        //changes affected on both array and arrayList
        System.out.println("After replacing: " + Arrays.toString(animalsArray));
        System.out.println("After replacing: " + animalsList);

        animalsArray[animalsArray.length - 1] = "Blue Whale";

        System.out.println("After replacing: " + Arrays.toString(animalsArray));
        System.out.println("After replacing: " + animalsList);

    }
}
