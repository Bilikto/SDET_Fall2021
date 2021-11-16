package practice_with_Fenton;

public class StringBuilderClassPractice {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(5);
        sb.append("Javascript");
        sb.append("PHP");
        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb);
        System.out.println(sb);

        String js = sb.substring(0, 10);
        String php = sb.substring(10, 13);
        String java = sb.substring(13);

        System.out.println(js);
        System.out.println(php);
        System.out.println(java);


    }
}
