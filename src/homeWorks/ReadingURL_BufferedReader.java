package homeWorks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingURL_BufferedReader {
    public static void main(String[] args) throws Exception {
        String path = "https://public.karat.io/content/test/test_file.txt";
        URL url = new URL(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        int totalBooks = 0;
        int totalPages = 0;
        String line = "";
        String pageData = "";

        while((line = br.readLine()) != null) {
            totalBooks = totalBooks + 1;

            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ',') {
                    pageData = line.substring(i + 1);
                }
            }
            totalPages = totalPages + Integer.parseInt(pageData);
        }

        System.out.println("Book count " + totalBooks);
        System.out.println("Pages count " + totalPages);
    }
}
