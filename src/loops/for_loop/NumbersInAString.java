package loops.for_loop;

public class NumbersInAString {


    public static void main(String[] args) {

        System.out.println(getNumFromStr("dev1x2 3Scho4ol5"));
    }

    public static int getNumFromStr(String str) {
        String  numstr = str.replaceAll("[a-zA-Z]", "").replaceAll(" ", "");
        return Integer.parseInt(numstr);
    }

}
