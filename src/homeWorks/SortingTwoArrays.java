package homeWorks;

import java.util.Arrays;

public class SortingTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 5, 0, 7};
        int[] arr2 = {10, 0, -1, 10};
        System.out.println(Arrays.toString(sortedArray(arr1, arr2)));
    }

    public static int[] sortedArray(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] res = new int[totalLength];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1.length < arr2.length) {
                res[k] = arr1[i];
                i += 1;
                j += 1;
            } else {
                res[k] = arr2[j];
                j += 1;
                k += 1;
            }
        }

        while(i < arr1.length) {
            res[k] = arr1[i];
            i += 1;
            k += 1;
        }

        while(j < arr2.length) {
            res[k] = arr2[j];
            j += 1;
            k += 1;
        }

        //Sorting array without Arrays.sort()
        int temp = 0;
        for(int z = 0; z < res.length; z++) {
            for(int x = z + 1; x < res.length; x++) {
                if(res[z] > res[x]) {
                    temp = res[z];
                    res[z] = res[x];
                    res[x] = temp;
                }
            }
        }

//        Arrays.sort(res);
        return res;
    }
}
