package methods.boolean_return_type;

import java.util.Scanner;

public class BooleanReturnType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the room number to check availability:");
        int roomNumber = scanner.nextInt();

        BooleanReturnType myObj = new BooleanReturnType();
        System.out.println(myObj.isAvailable(roomNumber));
    }

    public boolean isAvailable(int numberOfRoom) {
        return (numberOfRoom >= 401 && numberOfRoom <= 410);
    }
}
