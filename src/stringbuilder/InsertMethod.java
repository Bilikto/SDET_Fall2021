package stringbuilder;

public class InsertMethod {
    public static void main(String[] args) {
        //insert(int offset[index], String str)

        StringBuilder sb = new StringBuilder("Devx");
        sb.insert(sb.length(), " School");
        System.out.println(sb);

        sb.insert(sb.indexOf(" "), " IT");
        System.out.println(sb);
    }

}
