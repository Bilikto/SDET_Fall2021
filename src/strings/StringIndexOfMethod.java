package strings;

public class StringIndexOfMethod {

    public static void main(String[] args) {

        //indexOf(str)
        String str1 = "Devx school";
        System.out.println(str1.indexOf("v")); //2
        System.out.println(str1.indexOf("b")); // -1

        //indexOf(searchStr, fromIndex)
        String str3 = "Devx schoolx";
        System.out.println(str3.indexOf("x", 4)); //11

        //lastIndexOf() ->starts to search from end of string
        String str2 = "Devx school";
        System.out.println(str1.indexOf("h")); //7
        System.out.println(str1.indexOf("a")); // -1






    }




}
