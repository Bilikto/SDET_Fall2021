package stringbuilder;

public class DeleteCharAtMethod {
    public static void main(String[] args) {
        /*
        * StringBuilder deleteCharAt(int index) returns a reference to the same string builder object by removing
        * the char at the target index
        * */

        StringBuilder college = new StringBuilder("Harvard");
        college.deleteCharAt(college.length() / 2);
        System.out.println(college);

        StringBuilder name = new StringBuilder("Phillip");
        name.deleteCharAt(2);
        System.out.println(name);


    }
}
