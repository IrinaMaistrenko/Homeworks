package HomeWork6;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {

    public static void main(String[] args) throws Exception {

        SiteLoader loader = new NBRBLoader();

        String nbrb_Eur = "Курс НБРБ " + SiteLoader.Currency.EUR + ": " + loader.load(SiteLoader.Currency.EUR) + "\n";
        String nbrb_Rub = "Курс НБРБ " + SiteLoader.Currency.RUB + ": " + loader.load(SiteLoader.Currency.RUB) + "\n";
        String nbrb_Usd = "Курс НБРБ " + SiteLoader.Currency.USD + ": " + loader.load(SiteLoader.Currency.USD) + "\n";



        newFile(nbrb_Eur, nbrb_Rub, nbrb_Usd);
    }


     public static void newFile(String nbrb_Eur, String nbrb_Rub, String nbrb_Usd) throws Exception {

        String filename, path, output;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите путь, куда нужно сохранить файл cо скаченными курсами валют");
        path=scan.nextLine();
        System.out.println("Введите имя, под которым должен быть сохранен файл");
        filename=scan.nextLine();
        output=path+filename;

        try {
            FileWriter fw=new FileWriter(output);
            fw.append(output);
            fw.close();
            System.out.println("Файл с курсами валют создан по указанному адресу");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла!");
            e.printStackTrace();
        }

        FileWriter nFile = new FileWriter(output);
        nFile.write(String.valueOf(nbrb_Eur+"\n"));
        nFile.write(String.valueOf(nbrb_Usd+"\n"));
        nFile.write(String.valueOf(nbrb_Rub+"\n"));
        nFile.close();
    }
}
