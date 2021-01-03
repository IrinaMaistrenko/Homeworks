package HomeWork2.sorts;

import static HomeWork2.arrays.Tasks_2_1_2_2.arrayFromConsole;
import static HomeWork2.arrays.Tasks_2_3_2_4.arrayRandom;

public class Sorts_main {
    public static void main(String[] args) {
        Sorts_methods bubbleSort = new Sorts_methods();
        Sorts_methods shakerSort = new Sorts_methods();
        // 4.3. тесты:
        /*int[] A = {1,2,3,4,5,6};
        int[] B = {1,1,1,1};
        int[] C = {9,1,5,99,9,9};
        int[] D = {};

       bubbleSort.bubbleSort(A);
       bubbleSort.bubbleSort(B);
       bubbleSort.bubbleSort(C);
       bubbleSort.bubbleSort(D);

       shakerSort.shakerSort(A);
       shakerSort.shakerSort(B);
       shakerSort.shakerSort(C);
       shakerSort.shakerSort(D);*/


        // 4.4. Чтобы не писать лишний код, для создания массива рандомной длины воспользовалась уже написанным в Tasks_2_3_2_4 методом:
        int[] arr1 = arrayRandom(10, 25);
        int[] arr2 = arrayRandom(25, 1025);
        bubbleSort.bubbleSort(arr1);
        shakerSort.shakerSort(arr2);

        // 4.5. ну и соответственно для создания массива с консоли также воспользовалась уже написанным в Task_2_1_2_2 методом:
        int[] arr3 = arrayFromConsole();
        int[] arr4 = arrayFromConsole();
        bubbleSort.bubbleSort(arr3);
        shakerSort.shakerSort(arr4);
        }
    }

