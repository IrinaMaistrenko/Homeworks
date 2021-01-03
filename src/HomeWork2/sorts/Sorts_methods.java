package HomeWork2.sorts;

import java.util.Arrays;

class Sorts_methods {
    public void bubbleSort(int[] arr) { //4.1. + 4.2.1. Пузырьковая сортировка с выводом в консоль
        System.out.print("[Какой массив был до пузырьковой сортировки]: " + Arrays.toString(arr) + " --> ");
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("[Какой массив стал после пузырьковой сортировки]: " + Arrays.toString(arr));
    }

     public void shakerSort(int[] arr){ //4.1. + 4.2.2. Шейкерная сортировка с выводом в консоль
         System.out.print("[Какой массив был до шейкерной сортировки]: " + Arrays.toString(arr) + " --> ");

         int left = 0;
         int right = arr.length - 1;
         int temp;

         do {
             for (int i = left; i < right; i++) { // Сдвигаем большие элементы влево (в самой левой позиции окажется максимальный элемент)
                 if (arr[i] > arr[i + 1]) { //если эта часть кода будет считаться дублированием - пожалуйста, дай мне знать, я напишу второй вариант реализации (через побитовое исключающее OR. Сразу не писала, т.к. не очень люблю побитовые операторы
                     temp = arr[i];
                     arr[i] = arr[i + 1];
                     arr[i + 1] = temp;
                 }
             }
             right--; // Уменьшаем количество проходов, т.к. после первого прохода максимальный элемент уже будет в самой левой позиции
             for (int i = right; i > left; i--) { // Теперь идём в обратную сторону, сдвигаем маленькие элементы вправо
                 if (arr[i] < arr[i - 1]) {
                     temp = arr[i];
                     arr[i] = arr[i - 1];
                     arr[i - 1] = temp;
                 }
             }
             left++; // Уменьшаем количество проходов т.к. в последнем цикле мы проходили массив с конца
         } while (left < right); // Перемешиваем массив, пока все элементы не выстроятся от меньших к большим

         System.out.println("[Какой массив стал после шейкерной сортировки]: " + Arrays.toString(arr));
     }

 }
