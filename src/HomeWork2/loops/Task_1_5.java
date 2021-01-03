package HomeWork2.loops;

public class Task_1_5 {
    /*Вывести таблицу умножения в консоль, как на картинке (без динозаврика).*/
    public static void main(String[] args) {

        int number = 10;

        for(int i = 1 ;i<=10;i++) {

            for(int j=1;j<=number && j <= 5;j++) {
                System.out.print("||" + j + " x " + i + " = " + (i*j) + "||" + "\t");
            }

            System.out.println();
        }

        System.out.println("==================================================================================");



        for(int i = 1 ;i<=10;i++) {

            for(int j=6;j<=number && j <= 10;j++) {
                System.out.print("||" + j + " x " + i + " = "  + (i*j) + "||" + "\t");
            }

            System.out.println();
        }
    }
}

