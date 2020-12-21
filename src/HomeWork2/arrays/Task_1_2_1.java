package HomeWork2.arrays;

public class Task_1_2_1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            throw new IllegalArgumentException("Введите аргумент к исполняемой программе!");
        }


        try {
            for (String arg : args) {

                long n = Long.parseLong(arg);
                boolean b = (n % 1 == 0) == true;
            }

       } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введено не число!");

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Введено не целое число!");
       }

            for (String arg : args) {
            long n = Long.parseLong(arg);
            long last = n % 10;
            long result = reverse(n / 10) * last;
            System.out.print(last + " = " + result);
        }
    }

        public static long reverse ( long n){
            if (n > 0) {
                long l = n % 10 * reverse(n / 10);
                System.out.print(n % 10 + " * ");
                return l;
            }
            return 1;
        }
    }


        /*if ((n % 1 != 0)) {
            throw new NumberFormatException("Введите целое число!");
        }
        System.out.println(n);*/

       /* try {
            long n = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число!");
        }*/


       // }


       /* long m = Long.parseLong(String.valueOf(args));
        try{
            if ((m % 1 != 0)) {
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Введено не целое число");

     }

    }
        /*for (String arg : args) {
          long n = Long.parseLong(arg);


                //if ((n % 1 != 0)) {
                  //  throw new IllegalArgumentException("Введено не целое число");
                //}
                /*while (n != 0) {
                    long p = (n % 10);
                    n = n / 10;
                }*/
                //System.out.println(n);
               // {
                   // throw new IllegalArgumentException("Введено не число");
                //}

   // }
//}

/* Scanner sc = new Scanner(System.in);
        long number;
        do {
            System.out.println("Введите целое положительное число");
            while (!sc.hasNextLong()) {
                System.out.println("Это не целое положительное число!");
                sc.next();
            }
            number = sc.nextLong();
        } while (number <= 0);
        System.out.println("Введено число " + number);*/
