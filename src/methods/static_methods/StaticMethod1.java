package methods.static_methods;

public class StaticMethod1 {

    public static void main(String[] args) {

        addTwoNumbers(1, 2);
        StaticMethod1 myObj = new StaticMethod1();
        myObj.subtractNumber1(10, 2);

        StaticMethod1 myObj2 = new StaticMethod1();
        myObj2.subtractNumber2(8, 3);

    }

    // static -> means belong to the class
    // and that enables us to call those static methods
    // from other classes without creating an object of that class
    public static void addTwoNumbers(int a, int b) {
        System.out.println("The sum is: " + a + b);
        System.out.format("The sum is: %d\n", a + b);

        StaticMethod1 myObj3 = new StaticMethod1(); //instance method
        myObj3.subtractNumber1(15, 2);

    }


    // there are methods called "instance" methods a.k.a non-static
    // and these instance methods belong to an object of the class
    // instance methods can call static methods directly without creating an object
    // non-static methods can call other non-static methods directly without creating an object of that class
    // within that class only
    public void subtractNumber1(int a, int b) {
        //addTwoNumbers(1, 2); //static method
        System.out.println(a - b);
    }

    public void subtractNumber2(int a, int b) {
        subtractNumber1(16, 4);
        System.out.println(a - b);
    }



}
