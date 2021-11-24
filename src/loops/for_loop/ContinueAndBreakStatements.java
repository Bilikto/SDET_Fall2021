package loops.for_loop;

public class ContinueAndBreakStatements {

    public static void main(String[] args) {

        String school = "Devx School";
        breakStatement: for(int i = 0; i < school.length(); i++) {
            if (school.charAt(i) == 'o') continue breakStatement;
            if (school.charAt(i) == 'e') continue breakStatement;
            System.out.println(school.charAt(i) + " ");
        }

        int i = 0;
        optOutOfWhile: while(i < 10) {
            if (i == 5) break optOutOfWhile;
            System.out.println("The value of i is: " + i);
            i++;
        }

    }
}
