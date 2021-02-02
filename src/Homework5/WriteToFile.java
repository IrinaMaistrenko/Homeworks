package Homework5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile
{
    public static void main(String[] args) throws IOException
    {
        Path fileName = Path.of("C:\\Users\\Admin\\Dropbox\\Мой ПК (MNSK-MS-2951)\\Desktop\\Java\\Домашки\\Война и мир_книга.txt");
        String content  = "";
        Files.writeString(fileName, content);

        String actual = Files.readString(fileName);
        System.out.println(actual);
    }
}