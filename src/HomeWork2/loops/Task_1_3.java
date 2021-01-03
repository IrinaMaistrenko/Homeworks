package HomeWork2.loops;

/*Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
* Второе число это степень в которую возводят первое число. Степень - только положительная и целая. Возводимое число -
* может быть отрицательным и оно будет дробным.
* Math использовать нельзя.
* 1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
* 1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Введите число, которое необходимо возвести в степень. Внимание: в случае ввода дробного числа, в качестве разделителя между целой и дробной частью используйте точку!");
        double number1;

        while (!sc.hasNextDouble()){
           System.out.println("Это не число. Напрягитесь и введите число. Не забывайте про точку в качестве разделителя");
           sc.next();
       }
        number1 = sc.nextDouble();
        int number2;

       do {
            System.out.println("Введите степень, в которую необходимо возвести число. Внимание: должно быть введено положительное целое число!");
            while (!sc.hasNextInt()) {
                System.out.println("Это не целое положительное число!");
                sc.next();
            }
            number2 = sc.nextInt();
        } while (number2 <= 0);

        System.out.println("Число, которое необходимо возвести в степень: " + number1);
        System.out.println("Степень, в которое будет возведено число: " + number2);
        System.out.println(number1 + "  ^  " +  number2 + " = " + new DecimalFormat("###,###,###.00########").format(pow(number1, number2)));
    }
    public static double pow(double number1, int number2){
        double result = 1;
        for (int i = 0; i < number2 ; i++) {
            result *= number1;

        }
        return result;
    }
}
