package file_readers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileUsingScanner {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\dashi\\Desktop\\DevX workspace\\Lessons\\Fall2021SDET\\src\\file_readers\\zipCodes_2.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        List<String> zipCodeList = new ArrayList<>();
        while(scanner.hasNext()) {
            zipCodeList.add(scanner.nextLine());
        }

        for(String zipCode : zipCodeList) {
            System.out.println("zip code " + zipCode);
        }
    }
}
