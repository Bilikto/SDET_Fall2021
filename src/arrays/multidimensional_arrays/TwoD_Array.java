package arrays.multidimensional_arrays;

import java.util.Arrays;

public class TwoD_Array {

    /*
    * Arrays can be nested which means that we can store other arrays inside the arrays
    * */

    public static void main(String[] args) {
        int[] evenNumbers = {2, 4, 6, 8, 10, 24, 96, 1048};

        //to print element at certain index we just need to call the array name
        // and add [] to the end of it by passing index into [] --> arrayName[index]

        System.out.println("Number 8 is stored in index 3: " + evenNumbers[3]);

        // for 2 dimensional arrays we need to provide pair of square brackets
        // after the data type of the name of array
        int [][] oddNumbers = {{1, 3, 5}, {7, 9, 11}};

        // to access the elements of multidimensional arrays
        // we need to first provide the index of nested array itself
        // and then provide the index of an element inside that nested array
        System.out.println(oddNumbers[0][1]);
        System.out.println(oddNumbers[1][2]);
        System.out.println(oddNumbers[oddNumbers.length -1][1]);



        String[][] carModels = new String[3][4];

        carModels[0][0] = "Accord";
        carModels[0][1] = "Civic";
        carModels[0][2] = "Odyssey";
        carModels[0][3] = "Pilot";

        carModels[1][0] = "Suburban";
        carModels[1][1] = "Silverado";
        carModels[1][2] = "Camaro";
        carModels[1][3] = "Impala";

        carModels[2][0] = "Fiesta";
        carModels[2][1] = "Mustang";
        carModels[2][2] = "F150";
        carModels[2][3] = "Raptor";

        System.out.println(Arrays.toString(carModels[0]));
        System.out.println(Arrays.toString(carModels[1]));
        System.out.println(Arrays.toString(carModels[2]));
        System.out.println("=========================================");

        for(int i = 0; i <= carModels.length; i++) {
            for(int j = 0; j < carModels.length; j++) {
                System.out.print(carModels[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("=========================================");

        char[][] symbols = new char[4][2];

        symbols[0][0] = '!';
        symbols[0][1] = '@';

        symbols[1][0] = '#';
        symbols[1][1] = '$';

        symbols[2][0] = '%';
        symbols[2][1] = '^';

        symbols[3][0] = '&';
        symbols[3][1] = '*';

        for(char[] chars: symbols) {
            System.out.println(Arrays.toString(chars));
        }

    }


}
