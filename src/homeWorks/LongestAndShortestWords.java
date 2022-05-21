package homeWorks;

import java.util.Arrays;
import java.util.List;

public class LongestAndShortestWords {
    public static void main(String[] args) {
//        Given a comma-separated String of words, return the longest and shortest words
//        e.g. "I, like, programming, in, Java"
//                longest word: ---> programming		shortest word: --->  I

        String str = "I, like, programming, in, Java";
        String[] strArr = str.split(", ");
        System.out.println(Arrays.toString(strArr));

        String longestWord = "";
        String shortestWord = "";
        longestWord = shortestWord = strArr[0];

        for(int i = 0; i < strArr.length; i++) {
            if(longestWord.length() < strArr[i].length()) {
                longestWord = strArr[i];
            }
            if(shortestWord.length() > strArr[i].length()) {
                shortestWord = strArr[i];
            }
        }
        System.out.println(longestWord);
        System.out.println(shortestWord);
    }
}
