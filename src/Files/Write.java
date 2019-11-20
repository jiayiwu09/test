package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String filename = "FileToWrite.txt";
        String message = "I'm writing data that will be placed to a file";

        File file = new File(filename);
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(message);
        } catch (IOException e) {
            System.out.println("Error could not read file:"+ filename);
            e.printStackTrace();
        }
    }
}
