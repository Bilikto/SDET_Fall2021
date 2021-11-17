package stringbuilder;

public class DeleteMethod {
    // StringBuilder delete(int start, int end)
    // returns a reference to the same StringBuilder by deleting the char sequence
    // starting at start index and ending before end index

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Devx");

        sb.delete(1, 3);
        System.out.println(sb);

        StringBuilder school = new StringBuilder("Stanford");
        school.delete(school.indexOf("f"), school.length());
        System.out.println(school);

//        school.delete(0, school.indexOf("f"));
//        System.out.println(school);
    }
}
