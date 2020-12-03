package HomeWork1;

public class Task4 {
    public static void main(String[] arg) {
        String day = SleepLn(true);
        System.out.println(day);
           }

    private static String SleepLn(boolean b) {
    }

    public static boolean SleepLn(boolean weekday,boolean vacation){
            if (!weekday || vacation) {
                return true;
            }
            else return false;
        }
    }

/*public class OperatorsMain16 {
    public static void main(String[] arg) {
        String day1 = getDayName(1);
        System.out.println(day1);
        String day2 = getDayName(99);
        System.out.println(day2);
    }

    public static String getDayName(int day) {
        if (day == 1) {
            return "Понедельник";
        } else if (day == 2) {
            return "Вторник";
        } else if (day == 3) {
            return "Среда";
        } else if (day == 4) {
            return "Четверг";
        } else if (day == 5) {
            return "Пятница";
        } else if (day == 6) {
            return "Суббота";
        } else if (day == 7) {
            return "Воскресенье";
        }
        else return "Нет такого дня";


    }
}
*/