package data_types_oca_ch_1;

public class TypeCasting {
    public static void main(String[] args) {

        double ethStockPriceDouble = 3609.783;
        System.out.println("Before change to an int " + ethStockPriceDouble);

        int numberOfEthTokens = 200_000;
        double currentBalance = ethStockPriceDouble * numberOfEthTokens;
        System.out.println("Your current balance " + currentBalance);

        //type casting of larger data type to a small type is called a "narrowing" casting
        // or explicit casting or converting one data type to another data type.
        //Explicit -> means manual
        //Emplicit -> means automatically
        // we have to manually (explicitly) type cast it by
        // adding the desired data type in parentheses before the assigning variable
        int ethStockPriceWhole = (int) ethStockPriceDouble; //while casting double to int we are loosing decimal part
        System.out.println("After casting double to int: " + ethStockPriceWhole);

        //when converting from smaller data type to larger one it`s done implicitly
        //widening casting
        byte var1 = 12;
        System.out.println(var1);

        short var2 = var1;
        System.out.println(var2);

        double var3 = var2;
        System.out.println(var3);

        // since float is smaller than double data type
        // we have to explicitly type cast by adding the data type of the variable
        // we are converting to.
        float var4 = (float) var3;

        System.out.println("============================");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println("============================");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
/*
ctrl + R - replace
(type cast) has higher precedence than adding (+)


 */