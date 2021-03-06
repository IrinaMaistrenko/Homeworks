package HomeWork2.loops;

import java.text.DecimalFormat;

public class Task_1_1_1 {
    //Вариант решения 1:
    public static void main(String[] args) {
      long n = Long.parseLong(args[0]); /*спарсили аргумент, переданный в программу, из строки в число long, чтобы можно было посчитать факториал аргумента (далее !n)*/
      long f = 1;
      if ((n < 0) || (n > 20)) {
          throw new IllegalArgumentException(n + " !!! Значение аргумента программы не должно быть меньше 0 и больше 20. Введите значение в пределах допустимого интервала!");
          /*Для корректного расчета значения !n ввела проверку на допустимый интервал значений аргумента, передаваемого в программу*/
      }
             for (int i = 1; i < n; i++) {
             f*= i+1; // вычислила !n
            System.out.print(i + " * ");
            }
        System.out.print(n + " = " + new DecimalFormat("#,###,###,###,###,###,###").format(f));
      }
    }
    /*Вариант решения 2: с сохранением значений вычисленных факториалов в массив. На одном ресурсе прочитала, что такой метод
    * выполняется быстрее, т.к. значения кэшируются в массиве. Если его раскомментить и закомментить вариант 1 (кроме объявления класса) - он работает*/
//public static void main(String[] args) {
//         for (String arg : args) {
//             long n = Long.parseLong(arg); //Использовала foreach для обрабатки аргумента, переданного в программу (как у Вас на видео)
//             if ((n < 0) || (n > 20)) {
//                 throw new IllegalArgumentException(n + " !!! Значение аргумента программы не должно быть меньше 0 и больше 20. Введите значение в пределах допустимого интервала!");
//            }
//             long f1 = factorial(n); // забрала из метода, в котором вычисляла факториал, возвращенное значение вычисления
//             System.out.print(n + " = " + new DecimalFormat("#,###,###,###,###,###,###").format(f1));//вывела вторую часть (результат вычисления) на экран
//
//         }
//     }
//     public static long factorial(long n) {
//         long[] array = new long[21]; //создали массив для хранения факториалов
//         array[0] = 1; // указали, что !0=1
//         long last = 0; // запомнили номер последнего вычисленного факториала
//
//
//         for (int i = 1; i < n; i++) {
//             System.out.print(i + "*"); //перебрали циклом итерации для того, чтобы вывести их в консоль в первой части вывода (до "=")
//
//         }
//         while (last < n) {
//             array[Math.toIntExact(last + 1)] = array[(int) last] * (last + 1);
//             last++; //вычислила и закэшировала все пока не сохраненные значения
//         }
//         return array[Math.toIntExact(n)]; //вернула значение кэшированного факториала
//
//     }
// }



