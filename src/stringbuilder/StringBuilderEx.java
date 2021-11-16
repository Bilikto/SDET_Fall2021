package stringbuilder;

public class StringBuilderEx {
    public static void main(String[] args) {

        //StringBuilder is mutable
        StringBuilder sb1 = new StringBuilder("Devx");
        System.out.println(sb1); //Devx
        StringBuilder sb2 = sb1;
        System.out.println(sb2); //Devx

        sb1.append("School");
        System.out.println(sb1); //DevxSchool
        System.out.println(sb2); //DevxSchool

        sb2.append("IsCool");
        System.out.println(sb2); //DevxSchoolIsCool
        System.out.println(sb1); //DevxSchoolIsCool



    }
}
