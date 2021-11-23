package practice_with_Fenton;

public class LoopsPractice {
    public static void main(String[] args) {


        String str = "Washigton"; //9 --> characters, 8 - index of last character!

        //String str = "Devx";
        //String str = "New York";

//        for(int i = 0; i <= str.length()-1; i++) { // we use it when we know how many times we will iterate.
//            System.out.println(str.charAt(i));
//        }

        //while
//        int i = 0;
//        while(i <= str.length() - 1) { // it will run if boolean expression is true, if false --> goes to the next statement
//            System.out.println(str.charAt(i));
//            i++;
//        }

        //do while
        int i = 0;
        do {
            System.out.println(str.charAt(i));
            i++;
        } while (false); // it will runs once and then will check boolean expression, if false --> go to next statement, if true --> run do statement again until boolean expression gets false!

        System.out.println("Hi");


    }
}
