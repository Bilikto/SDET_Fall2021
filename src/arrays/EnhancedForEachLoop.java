package arrays;

public class EnhancedForEachLoop {

    public static void main(String[] args) {
        /*
        * enhanced for loop is aka for each loop
        * which is used to iterate over collections
        * */

        String[] names = new String[]{"Aisha", "Vipra", "Elena", "Serhii"};

        for(String name: names) {
            System.out.println(name);
        }

        for(String name: names) {
            if (name.startsWith("E")) System.out.println(name); //Elena
        }


    }
}
