package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tasks_2_3_2_4 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5, 5);
        System.out.println("Введен массив размером: " + container.length + " элемента (-ов)");
        System.out.println("Массив содержит элементы: " + Arrays.toString(container));

        if (container.length == 1) {
            System.out.println("В массиве только 1 элемент");
        } else
            System.out.println("Сумма четных положительных элементов массива: " + sum(container));
            System.out.println("Сумма элементов массива: " + sumElements(container));
            System.out.println("Максимальный из элементов массива с четными индексами: " + max(container));
            System.out.println("Элементы массива, которые меньше среднего арифметического: " + Arrays.toString(minAverage(container)));
            System.out.println("Два наименьших (минимальных) элемента массива: " + Arrays.toString(twoMinElements(container)));
            System.out.println("Сжатый массив: " + Arrays.toString(compressionArray(container, 2, 4)));


    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] container = new int[size];


        for (int i = 0; i < size; i++) {
            Random number = new Random();
            container[i] = number.nextInt(maxValueExclusion);

        }
        return container;
    }

    public static int sum(int[] container) {
        int sum = 0;
        for (int element : container) {
            if ((element > 0) && (element % 2 == 0)) {
                sum += element;
            }
        }
        return sum;
    }

    public static int max(int[] container) {
        int max = 0;
        for (int i = 0; i < container.length; i++) {
            if ((container[i] > max) && (i % 2 == 0)) {
                max = container[i];
            }

        }
        return max;
    }

    public static int[] minAverage(int[] container) {
        int sum = 0;
        double average;
        for (int element : container) {
            sum += element;
        }

        int j = 0;
        average = sum / container.length;
        for (int i = 0; i < container.length; i++) {
            if (container[i] < average) {
                container[j++] = container[i];
            }

        }
        int[] container1 = Arrays.copyOf(container, j);

        return container1;
    }

    public static int[] twoMinElements(int[] container) {
        int min1 = Integer.MAX_VALUE;

        int min2 = Integer.MAX_VALUE;


        for (int i = 0; i < container.length; i++) {

            if (container[i] < min1) {
                min2 = min1;
                min1 = container[i];

            } else if (container[i] < min2 && container[i] != min1) {
                min2 = container[i];
            }
        }
        return new int[]{min1, min2};
    }

    public static int[] compressionArray(int[] container2, int first, int last) {

        for (int i = 0; i < container2.length; i++) {
            if (container2[i] >= first & container2[i] <= last) {
                container2[i] = 0;
            }

        }
        return container2;
    }

    public static int sumElements(int[] container) {
        int sum = 0;
        for (int element : container) {
            sum += element;
        }
        return sum;
    }
}



