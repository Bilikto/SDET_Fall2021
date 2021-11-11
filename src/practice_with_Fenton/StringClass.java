package practice_with_Fenton;

import homeWorks.Strings;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) throws ParseException {

        //creation String
        // String str1 = "DevX"; // -> "literal"
        // String str2 = new String("school"); // -> "using constructor of String class"

        // String pool
        // Since strings are everywhere in Java, they use up a lot of memory. In some production applications, they can use up 25 – 40 percent of the memory in the entire program.
        // Java realizes that many strings repeat in the program and solves this issue by reusing common ones. The "string pool", also known as the intern pool, is a location
        // in the Java virtual machine (JVM) that collects all these strings.
        // The string pool contains literal values that appear in your program. For example, “name” is a literal and therefore goes into the string pool.
        // myObject.toString() is a string but not a literal, so it does not go into the string pool. Strings not in the string pool are garbage collected just like any other object.
        // Ex:   String name = "Fluffy"; //is a literal and goes into the string pool.
        // String name = new String("Fluffy"); // object in JVM

            String school = "Devx";

            String school1 = school; //school1 -> "Devx"

            System.out.println(school); // "Devx"
            System.out.println(school1); // "Devx"

            System.out.println("======================");

            school = "DevxSchool"; //school -> "DevxSchool"

            System.out.println(school); // "DevxSchool"
            System.out.println(school1); // "Devx"

            System.out.println("======================");

            System.out.println("School: " + school);
            System.out.println("School1 " + school1);

            System.out.println("======================");

            String school2 = new String();
            //System.out.println(school2); //null
            String school3 = new String("Standford");

            school2 = school3; //school2 -> "Standford"
            school3 = "Princeton"; //school3 -> "Princeton"

            System.out.println("School3: " + school3); //School3:Princeton
            System.out.println("School2: " + school2); //School2:Standford

//            String myDate = "13/08/2021 07:28";
//            //System.out.println(myDate);
//
//            DateTimeFormatter inputParser = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
//            LocalDate date = LocalDate.parse(myDate, inputParser);
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy hh mm", Locale.ENGLISH);
//            String output = date.format(formatter);
//            System.out.println(output);

//            DateFormat df = new SimpleDateFormat("yy/MM/dd hh:mmZ");
//            Date result =  df.parse(myDate);
//            System.out.println(result);

    }

}
