package loops.while_loop;

public class WhileLoopWithBool {
    public static void main(String[] args) {

        boolean flag = true;
        int i = 1;

        while(flag) {
//            int i = 1; // this is dangerous bc "i" will be initialized to 1 every iteration
            System.out.println("Yay! While loop iterated! " + i + " times");
            if(i == 5) {
                flag = false;
            }
            i++;
        }

    }
}
