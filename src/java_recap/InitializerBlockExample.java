package java_recap;

public class InitializerBlockExample {
    public static void main(String[] args) {
       Bike b1 = new Bike();
       Bike b2 = new Bike();
    }
}

class ParentBike{
    public ParentBike() {
        System.out.println("Parent constructor is invoked");
    }
}

class Bike extends ParentBike {
    int speed;
    public Bike() {
        System.out.println("Child constructor is invoked");
    }

    //instance initializer block
    { System.out.println("Instance initializer block invoked"); }
}

//The java compiler copies the code of instance initializer block in every constructor!!!
/*
class Bike{
    int speed;
    public Bike() {
        super();
        { System.out.println("instance initializer block invoked"); }
        System.out.println("constructor is invoked");
    }
}

//The instance initializer block is invoked after the parent class constructor is invoked!
*/














