package strings;

public class EqualsMethod {

    public static void main(String[] args) {
        String school1 = new String("Devx");
        String school2 = new String("Devx");

        String school3 = "Devx";
        String school4 = "Devx";

        String school5 = "Stanford";

        //"==" -> checks objects
        System.out.println(school1 == school2); //false
        System.out.println(school3 == school4); //true
        System.out.println(school1 == school3); //false

        //equals() -> checks value
        System.out.println(school1.equals(school2)); //true
        System.out.println(school3.equals(school4)); //true
        System.out.println(school1.equals(school3)); //true

        System.out.println(school5.equals(school1)); //false

        //equalsIgnoreCase()
        System.out.println("Alex".equalsIgnoreCase("alex")); //true



    }

}
