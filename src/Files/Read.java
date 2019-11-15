package Files;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        String filename = "FileToRead.txt";
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String text = br.readLine();
        System.out.println(text);
        br.close();
    }
}
