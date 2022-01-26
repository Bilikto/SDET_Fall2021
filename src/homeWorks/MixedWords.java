package homeWorks;

public class MixedWords {
    public static void main(String[] args) {
        String companyName = "Groupon";
        String companyNameMixed = "nopGrou";
        int[] indexes = {3, 4, 5, 6, 2, 1, 0};

        String newString = "";

        for(int i = 0; i < indexes.length; i++) {
            newString += companyNameMixed.charAt(indexes[i]);
        }

        System.out.println(newString);

    }
}
