package HomeWork2.arrays;

import java.text.DecimalFormat;

public class Task_1_1_2 {
    /*Интересно, а можно в System.out.print этот for запихнуть?..Чисто теоретически?*/
    public static void main(String[] args) {
        for (String arg : args) {
            long n = Long.parseLong(arg); //Использовала foreach для обрабатки аргумента, переданного в программу (как у Вас на видео)
            if ((n < 0) || (n > 20)) {
                throw new IllegalArgumentException(n + " !!! Значение аргумента программы не должно быть меньше 0 и больше 20. Введите значение в пределах допустимого интервала!");
            }

            for (int i = 1; i < n; i++) {
                System.out.print(i + " * ");} //перебрали циклом номера итерации для того, чтобы вывести их в консоль

            long f1 = Factorial(n);
            System.out.print(n + " = " + new DecimalFormat("#,###,###,###,###,###,###").format(f1));

        }
    }

    static long Factorial(long n) { //Создаю отдельный рекурсивный метод для вычисления !n
           while (n <= 1) {
                return 1;
            }
           return n * Factorial(n - 1);
        }
    }






