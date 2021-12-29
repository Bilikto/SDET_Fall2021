package oop_class_Chirag.generics;

class Box <T> {

    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

public class Generic {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>();
        b1.setData(10);
        System.out.println(b1.getData());

        Box<String> b2 = new Box<String>();
        b2.setData("Chiraq");
        System.out.println(b2.getData());
    }
}
