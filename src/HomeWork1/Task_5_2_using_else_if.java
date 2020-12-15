package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task_5_2_using_else_if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Представьтесь пожалуйста: ");
        String name = in.nextLine();

        String boyfriend = "Вася";
        String friend = "Анастасия";

        boolean isBoyFriend = Objects.equals(name, boyfriend);
        boolean isFriend = Objects.equals(name, friend);

        if (isBoyFriend) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждала");
        } else if (isFriend) {
            System.out.println("Я тебя так долго ждала");
        } else {
            System.out.println("Добрый день, а Вы кто?");
        }
    }
}

