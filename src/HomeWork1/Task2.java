package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 5 + 2 / 8;
        double b1 = 5 + (double) 2 / 8;
        System.out.println("Ответ на №1 без приведения типов странный: " + " " + b + " " + "потому что при делении целых чисел дробная часть отбрасывается");
        System.out.println("Ответ Ответ на №1 c приведением типов: " + " " + b1+ " "  + "тут уже похоже на то, чему учили в школе, т.к. мы привели тип результата к дробному");
        /*int с = (5 + 2++) / 8; - тут ерунда получится, потому что постфиксный инкремент можно делать с переменной, а не с литералом
        */

        int c = 2;
        int c1 = c++;
        int d = 5;
        int e = 8;
        int e1 = --e;
        int b2 = (d + c) / e;
        System.out.println("Ответ на №2 без приведения типов тоже странный, но объяснимый: " + " " + b2);
        double b3 = (double)(d + c) / e;
        System.out.println("Ответ на №2 c приведением типов норм: " + " " + b3);
        int f = (d + c++) / 8;
        System.out.println("Ответ на №3: " + " " + f);
        int g = (d + c1) / e1;
        System.out.println("Ответ на №4: " + " " + g);






        /*

        2.4 (5 + 2++) / --8
        2.5 (5 * 2 >> 2++) / --8
        2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        2.8 6 - 2 > 3 && 12 * 12 <= 119
        2.9 true && false*/
    }


}