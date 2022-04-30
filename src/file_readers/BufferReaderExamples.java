package file_readers;

import java.io.*;
import java.net.URL;


public class BufferReaderExamples {
    public static void main(String[] args) throws Exception {

        //read() --> it is used for reading a single character.
        FileReader fr = new FileReader("C:\\Users\\dashi\\Desktop\\DevX workspace\\Lessons\\Fall2021SDET\\src\\file_readers\\testout.txt");
        BufferedReader br = new BufferedReader(fr);

        int i = 0;
        while((i = br.read()) != -1) {
            System.out.print((char)i);
        }

        br.close();
        fr.close();
    }
}

class ReadFromURL {
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
        System.out.println("Total books " + totalBooks);
        System.out.println("Total pages " + totalPages);
        br.close();
    }
}

class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Welcome " + name);
    }
}

