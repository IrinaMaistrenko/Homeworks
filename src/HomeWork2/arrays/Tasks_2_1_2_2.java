package HomeWork2.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks_2_1_2_2 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        System.out.println("Введен массив размером: " + container.length + " элемента (-ов)");
        System.out.println("Массив содержит элементы: " + Arrays.toString(container));

        if (container.length == 1) {
            System.out.println("В массиве только 1 элемент");
        }
        else {
            System.out.println("Каждый второй элемент массива: " + Arrays.toString(printEverySecond(container)));
            System.out.println("Элементы массива в обратном порядке: " + Arrays.toString(revers(container)));
        }
    }

    public static int[] arrayFromConsole() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt(); // Считываем с консоли введенный размер массива и записываем его в size
        int container[] = new int[size]; // Создаём массив размером size
        System.out.print("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            container[i] = in.nextInt(); // Заполняем массив элементами, считанными с консоли
        }
        return container;
    }

    public static int[] printEverySecond(int[] container) {
        int[] everySecond = new int[container.length / 2];

            int index = 0;
            for (int i = 1; i < container.length; i += 2) {
                everySecond[index] = container[i];
                index++;
            }

        return everySecond;
    }

    public static int[] revers(int[] container){
        int[] revers = new int[container.length];
        int index = 0;
        for (int i = revers.length-1; i >=0 ; i--) {
            revers[index] = container[i];
            index++;
        }

        return revers;
    }
}
