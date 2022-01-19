package practice_with_Fenton;

public class forLoops {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        for(int i = 0; i < nums.length; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(nums[i]);
        }



        System.out.println("Hello World");

        for(int a: nums) {
            if(a == 4) {
                break;
            }
            System.out.println(a);
        }

    }
}
