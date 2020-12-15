package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task_5_3_using_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Представьтесь пожалуйста: ");
        String name = in.nextLine();

        final String boyFriend = "Вася";
        final String friend = "Анастасия";

        switch (name) {
            case boyFriend:
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждала");
                break;
            case friend:
                System.out.println("Я тебя так долго ждала");
                break;
            default:
                System.out.println("Добрый день, а Вы кто?");
        }
    }
}

