package HomeWorks;

public class Operators2 {
    public static void main(String[] args) {
        System.out.println("#1");
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        double result = ((a * b - b * b) / (c - d));
        System.out.println(result);

        System.out.println();

        System.out.println("#2");
        double a1 = 1.0;
        double b1 = 4.0;
        int c1 = 1;
        int d1 = 3;
        int e1 = 5;
        int f1 = 7;
        int g1 = 9;
        int i1 = 11;
        result = b1 * (c1 - (a1/d1) + (a1/e1) - (a1/f1) + (a1/g1) - (a1/i1));
        System.out.println(result);

    }
}
