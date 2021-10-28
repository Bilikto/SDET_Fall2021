package mentorClass_Askar;

public class PrintingTechniques {
    public static void main(String[] args) {
        byte quantity = 2;
        String description = "Iphone 13 Pro Max";
        double price = 1399.00;

        // "%s" and \t
        System.out.println(quantity + "\tX\t" + description+"\t$" + price);
        System.out.printf("%s\tX\t%s\t$%s", quantity, description, price);
    }
}

