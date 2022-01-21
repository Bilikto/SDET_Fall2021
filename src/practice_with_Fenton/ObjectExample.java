package practice_with_Fenton;

public class ObjectExample {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 2, true, false);
        System.out.println(animal.age);
        System.out.println(animal.name);
        System.out.println(animal.tail);
        System.out.println(animal.head);
        animal.eat();

        Animal animal2 = new Animal("Animal", 4, false, true);
        System.out.println(animal2.age);
        System.out.println(animal2.name);
        System.out.println(animal2.tail);
        System.out.println(animal2.head);
        animal2.eat();



    }
}

class Animal {

    String name; //instance variable
    int age;
    boolean tail; //static variable
    boolean head;

    public Animal(String name, int age, boolean tail, boolean head) {
        this.name = name;
        this.age = age;
        this.tail = tail;
        this.head = head;
    }

    public void eat() {
        System.out.println("eating..");
    }



}
