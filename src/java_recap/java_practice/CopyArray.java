package java_recap.java_practice;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        char[] chars = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyOfChars = new char[chars.length];

        // 2 ways to make copy of Array
        //System.arraycopy(chars, 2, copyOfChars,0, 7);

        copyOfChars = Arrays.copyOf(chars, chars.length);

        System.out.println(copyOfChars);

    }
}
