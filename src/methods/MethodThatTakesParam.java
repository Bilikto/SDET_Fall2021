package methods;

public class MethodThatTakesParam {
    public static void main(String[] args) {

        sayHiToStudent("Billy", 34);

    }

    public static void sayHiToStudent(String studentName, int age) {
        System.out.println("Hello " + studentName);
        System.out.println(studentName + " " + age);
    }


}
