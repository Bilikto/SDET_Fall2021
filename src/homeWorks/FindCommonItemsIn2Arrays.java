package homeWorks;

public class FindCommonItemsIn2Arrays {
    public static void main(String[] args) {
        String[] fruits1 = {"apple", "banana", "pear", "kiwi", "mango", "plum"};
        String[] fruits2 = {"watermelon", "banana", "lime", "peach", "mango", "apple", "grapes", "kiwi"}; //apple, banana, mango, kiwi
        printCommonElements(fruits1, fruits2);
    }

    public static void printCommonElements(String[] arr1, String[] arr2) {

        String commonItems = "";

        for(String s: arr1) {
            for(String str: arr2) {
                if(s.equals(str)) {
                    commonItems += s + " ";
                }
            }
        }
        System.out.println("Common items are: " + commonItems);
    }
}
