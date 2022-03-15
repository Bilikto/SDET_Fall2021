package java_recap;

public class StaticMethodParent {

    public static void run() {
        System.out.println("Parent class running");
    }
}

class StaticMethodChild extends StaticMethodParent {
    //@Override
    public static void run() {
        System.out.println("Child class running");
    }

    public static void main(String[] args) {
        StaticMethodParent obj = new StaticMethodChild();
        obj.run();
    }
}
/* We can not override static methods it belongs to class!
If the method is overridden parent object will call "static" method of parent class!!!
 */