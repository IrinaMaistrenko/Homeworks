package HomeWork1;

public class Task4 {
    public static void main(String[] arg) {
        String day = SleepLn(vacation);
        System.out.println(day);

    }

        public static boolean SleepLn(boolean weekday, boolean vacation) {
            /*boolean weekday = true;
            boolean vacation = false;*/
            if (!weekday || vacation) {
                return "Спать дальше";
            }
            else return "Идти работать";
        }
    }
