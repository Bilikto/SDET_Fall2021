package java_recap.java_practice;

public class SumFromStringInteger {
    public static void main(String[] args) {
        String numbers = "apple12345";

        int sum = 0;

        for(int i = 0; i < numbers.length(); i++) {
            Character c = numbers.charAt(i);
            if(Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }

        System.out.println(sum);
    }
}
