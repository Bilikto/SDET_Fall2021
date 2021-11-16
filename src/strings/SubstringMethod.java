package strings;

public class SubstringMethod {
    public static void main(String[] args) {
        String str = "| timezone | start-time 10:22:001 | end-time 10:23:234 |";

        String startTime = str.substring(str.indexOf(":") - 2, str.indexOf(" ", str.indexOf(":")));
        String endTime = str.substring(str.length() - 11, str.length()-1);

        System.out.println(startTime); //10:22:001
        System.out.println(endTime); //10:23:234


    }
}
