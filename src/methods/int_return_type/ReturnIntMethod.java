package methods.int_return_type;

public class ReturnIntMethod {

    public static void main(String[] args) {

        ReturnIntMethod returnIntMethod = new ReturnIntMethod();
        System.out.println(returnIntMethod.subtractValue(2));

    }

    int subtractValue(int num) {
        return  5 - num;
    }

}
