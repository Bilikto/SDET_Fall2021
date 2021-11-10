package strings;

public class StringConcatenation {
    public static void main(String[] args) {
        //String concatenation is simply adding another string to the end of an existing string variable
        String nameOfSchool = "DevX";
        String nameOfITSchool = "DevX";
        System.out.println(nameOfSchool + " School");
        System.out.println(nameOfITSchool);

        System.out.println(1 + 2 + ""); //3

        System.out.println(nameOfITSchool = nameOfSchool + nameOfITSchool); //DevXDevX

        System.out.println(nameOfSchool = nameOfITSchool + nameOfSchool + nameOfITSchool);

        System.out.println(nameOfSchool +=  " Great!");

        //concat()
        System.out.println(nameOfSchool.concat(nameOfITSchool));

    }
}
