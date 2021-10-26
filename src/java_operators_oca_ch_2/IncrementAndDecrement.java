package java_operators_oca_ch_2;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //Increment - which add 1 to the value of variable
        //decrement - which subtracts 1 from the value of variable
        //i++ -> postfix increment
        //i-- -> postfix decrement
        //++i -> prefix increment
        //--i -> prefix decrement

        int i = 1;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
        i++; //postfix increment
        System.out.println(i);
        i--; //postfix decrement
        System.out.println(i);

        System.out.println("=============");
        int j = 1;
        ++j; //prefix increment
        System.out.println(j);
        j--; //prefix decrement
        System.out.println(j);

        float f1 = 1.2f;
        f1++;
        System.out.println(f1); //2.2

    }
}
