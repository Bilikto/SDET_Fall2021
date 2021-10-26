package java_operators_oca_ch_2;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //Arithmetic operators in java are the basic mathematical operations
        //such as addition (+), substruction (-), division (/), muliplication (*)
        //modulo operator (%)
        int num1 = 123;
        int num2 = 456;

        int numsAdded = num1 + num2;
        System.out.println(numsAdded);

        int numsSubtracted = num2 - num1;
        System.out.println(numsSubtracted);

        float numsDivided =  (float) num2/num1; //
        System.out.println(numsDivided);

        int numsMultiplied = num1*num2;
        System.out.println(numsMultiplied);

        int x = 3;
        int y = 2;
        // when dividing 2 integer java will treat them as integers and does the math operations
        // and then convert them to a float
        // rather if we want more precise outcome with the fractions
        // then we can first convert the type and then do the math operation
        float z = (float) x / y;
        System.out.println(z);

        int finalOut2 = x * 2 / 3;
        System.out.println(finalOut2);

        double salary = 100_000;
        double yearlyIncrease = 0.03;
//        double secondYearSalary = salary * yearlyIncrease + salary;
//        System.out.println(secondYearSalary);
//        double thirdYearSalary = secondYearSalary * yearlyIncrease + secondYearSalary;
//        System.out.println(thirdYearSalary);
//        double fourthYearSalary = thirdYearSalary * yearlyIncrease + thirdYearSalary;
//        System.out.println(fourthYearSalary);
//        double fifthYearSalary = fourthYearSalary * yearlyIncrease + fourthYearSalary;
//        System.out.println(fifthYearSalary);

        for (int i = 0; i < 5; i++) {
            salary = salary * yearlyIncrease + salary;
            System.out.println(salary);
        }

        //precedence order is starts with parenthesis operation first
        //then multiplication or division and then right to left
        int finalOutcome = 2 + (5 - 1);
        System.out.println(finalOutcome);
        System.out.println(6 + 2 - 3 * (4 + (5 - 3) % 2)); //-4

        int dividend = 4;
        double divisor = 2.2;
        System.out.println("Both operands are converted to double for this operation: " + dividend/divisor); //calculation goes first then concatenation
        System.out.println("Both operands are converted to double for this operation: " + 4/2.2); //Both operands are converted to double for this operation: 1.8181818181818181
        System.out.println("Both operands are converted to double for this operation: " + 4+2.2); //Both operands are converted to double for this operation: 42.2
        System.out.println("Both operands are converted to double for this operation: " +(4+2.2)); //Both operands are converted to double for this operation: 6.2
        System.out.println("Both operands are converted to double for this operation: " + 4*2.2); //Both operands are converted to double for this operation: 8.8

        char charA = 'a';
        char charB = 'b';
        int sum = charA + charB;
        System.out.println("'a' + 'b' = " + sum); //'a' + 'b' = 195 //ASCII table




    }

}
