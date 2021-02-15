package Homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UniqueWords {
    public String scanFile (String text) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(text));
        String words = " ";
        while (scanner.hasNext()) {
            words += scanner.nextLine() + "\r\n";
        }
        scanner.close();
        return words;
    }
}
