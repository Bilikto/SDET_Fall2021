package strings;

public class StringReplaceMethod {
    public static void main(String[] args) {
        String str = "feeksforfeeks";
        System.out.println(str);
        System.out.println(str.replace('f', 'g'));

        String str2 = str.replace("feeks", "geeks");
        System.out.println(str2);
    }
}
