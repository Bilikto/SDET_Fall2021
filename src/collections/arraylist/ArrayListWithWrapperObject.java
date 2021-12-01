package collections.arraylist;

import java.util.ArrayList;

public class ArrayListWithWrapperObject {

    public static void main(String[] args) {

        ArrayList<Character> charList = new ArrayList<Character>(); //second <Character> is optional

        // add(char)
        charList.add('a');
        charList.add('b');
        charList.add('c');

        System.out.println(charList);

        // add(index, element)
        charList.add(1,'k');
        System.out.println(charList);

        //get(index)
        System.out.println(charList.get(2));

        //size()
        System.out.println(charList.size());

        //get()
        System.out.println(charList.get(0)); //first element
        System.out.println(charList.get(charList.size()-1)); //last element



    }
}
