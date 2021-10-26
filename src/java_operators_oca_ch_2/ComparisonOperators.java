package java_operators_oca_ch_2;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        * "==" -> equal to when comparing 2 primitive types if both sides are equal then returns true
        * "!=" not equal
        * ">" -> strictly greater than
        * "<" ->  strictly less than
        * ">=" -> greater than or equal to
        * "<=" -> less than or equal to
        * */
        int num1 = 10;
        int num2 = 20;
        boolean isEqual = num1 == num2;
        System.out.println(isEqual); //false


        // Logical complement (!) or Negation Operator (-)
        // Logical complement operator flips, changes the value of boolean to it`s opposite value.
        // boolean isOdd = true
        // then if I change is Odd to !isOdd then the value of isOdd executes to false
        isEqual = !isEqual;
        System.out.println(isEqual); //true
        isEqual = !true;
        System.out.println(isEqual); //false


        //Negation operator where it changes the value of a variable to negative
        int x = 1;
        System.out.println(x); //1
        x = -x; // Negation Operator
        System.out.println(x); //-1

        boolean isEqual2 = num1 != num2;
        System.out.println(isEqual2);

        isEqual = isEqual2 = num2 != num1;
        System.out.println(isEqual);

        boolean isGreate = num1 > num2;
        System.out.println(isGreate);

        /*********************************************************/

        char gender = 'M';
        boolean isMale = gender == 'M';
        System.out.println("Welcome to our store here are the list of amazing fall collection we have for men");

        String str1 = "DevxSchool";
        String str2 = "DevxSchool";

        boolean isSame = str1 == str2;
        System.out.println("Is the school equal to Devx?" + ("devxSchool" == str1)); //Is the school equal to Devx?false
        System.out.println("Are they the same?" + isSame); //true

        String strObj = new String("DevxSchool");
        isSame = str1 == strObj;
        System.out.println("Are they the same?" + isSame); //false
        System.out.println(str1.equals(strObj)); //true
        System.out.println(str1.equals(str2)); //true

        int x1 = 5;
        double d1 = 5.0;
        boolean b10 = x1 == d1;
        // whenever we perform a comparison operation between
        // 2 primitive literals such as int, short, double etc.
        // Java will convert the smaller data type to the larger data type
        // and then it performs the operation
        System.out.println("Is 5 equal to 5.0? " + b10); //Is 5 equal to 5.0?true

        // using ASCII decimal value
        // when char is being compared with number first char will get the ASCII value
        char a = 'A';
        System.out.println(a == 65); //true








    }
}
