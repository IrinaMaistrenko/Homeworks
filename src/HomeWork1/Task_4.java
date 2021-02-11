package HomeWork1;

import java.util.Arrays;

public class Task_4 {
   public static void main(String[] args) {
        if (sleepLn(false, true))
            System.out.println("Можно спать дальше");
        else
            System.out.println("Нужно идти на работу");
    }

    public static boolean sleepLn(boolean weekday, boolean vacation) {
        return weekday != true || vacation == true;
    }
}