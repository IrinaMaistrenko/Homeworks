package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = false;
        String day1 = Sleeplne(vacation);
        System.out.println(day1);
    }

    static String Sleeplne(boolean day) {
        boolean weekday = true;
        boolean vacation = false;
        if (day == weekday) {

            return "Иди работать";
        }
        return "Можно спать дальше";
    }
}
/* Работает в такой конструкции, но мне кажется, что можно проще. И не нравится, что пришлось weekday и vacation инициализировать 2 раза - наверное это говорит о том, что что-то не так. Подумаю об этом на выходных*/


