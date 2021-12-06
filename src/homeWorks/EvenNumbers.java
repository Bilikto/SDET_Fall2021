package homeWorks;

import java.util.ArrayList;

public class EvenNumbers {

    public static void main(String[] args) {

        System.out.println(getEvenNumbers());

    }

    public static ArrayList<Integer> getEvenNumbers() {

        ArrayList<Integer> newIntList = new ArrayList<>();

        for(int i = 0; i <= 100; i++) {
            if((i % 2) != 0) continue;
            newIntList.add(i);
        }

        return newIntList;

    }
}
