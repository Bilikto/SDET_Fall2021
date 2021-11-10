package strings;

public class StringIndexing {

    public static void main(String[] args) {
        // indexing is basically a position that gets stored at certain index in String objects
        // Devx:
        //    'D' -> index [0]
        //    'E' -> index [1]
        //    'V' -> index [2]
        //    'X' -> index [3]

        // Every special character can be in a String
        // and white spaces in String variables are also indexed because
        // every character "" that`s in between double quotes is a String

        String school = "DevX School";
        System.out.println("Number of chars in this string: " + school.length());

//        for(int i = 0; i < school.length(); i++) {
//            System.out.println(school.indexOf(school.charAt(i)));
//        }




    }
}
