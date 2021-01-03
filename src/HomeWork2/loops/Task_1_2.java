package HomeWork2.loops;

import java.text.DecimalFormat;

public class Task_1_2 {
    public static void main(String[] args) {

        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Введите аргумент к исполняемой программе!");
            }
            for (String arg : args) {
                Double n = Double.parseDouble(arg);
                if (n % 1 != 0){
                    System.out.println("Введено не целое число!");
                }
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введено не число!");
        }

            for (String arg : args) {
                long n = Long.parseLong(arg);
                long last = n % 10;
                long result = reverse(n / 10) * last;
                System.out.print(last + " = " + new DecimalFormat("#,###,###,###,###,###,###").format(result));

            }
        }

                public static long reverse(long n){
                if (n > 0) {
                    long l = n % 10 * reverse(n / 10);
                    System.out.print(n % 10 + " * ");
                    return l;
                } else if (n<0) {
                    long l = n % 10 * reverse(n / 10);
                    System.out.print(n % 10 + " * ");
                    return l;
                }
                return 1;
        }
    }


