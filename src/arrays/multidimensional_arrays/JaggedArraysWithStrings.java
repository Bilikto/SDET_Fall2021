package arrays.multidimensional_arrays;

public class JaggedArraysWithStrings {

    public static void main(String[] args) {
        /*
        * "Jagged" array means that the size of nested arrays can be initialized after
        * declaring the size for main array
        *
        * */


        //we can create jagged arrays by providing elements

        String[][]  computers = {
                {"Hp", "Lenovo", "Toshiba"},
                {"MacPro", "MacAir"},
                {"IBM", "Dell", "Asus", "Samsung", "Acer"}
        };

        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers[i].length; j++) {
                System.out.println(computers[i][j]);
            }
        }


    }
}
