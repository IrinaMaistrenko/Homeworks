package HomeWork2.loops;

public class Task_1_4 {
    /*Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением
     *до переполнения и после переполнения. Умножать на:
     *1.4.1. 3
     *1.4.2. 188
     *1.4.3. -19
     *1.4.4. Да и вообще на любое целочисленное
     */
    public static void main(String[] args) {


        System.out.println("Значение произведения после переполнения: " + multAfter(1, 3));
        System.out.println("Значение произведения до переполнения: " + multBefore(1,3));
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(Long.MIN_VALUE);
    }
    public static long multAfter(long a, long b) {
        long rafter;


        /*long maximum = Long.signum(a) == Long.signum(b) ? Long.MAX_VALUE : Long.MIN_VALUE;
        (a != 0 && (b > 0 && b > Long.MAX_VALUE / a ||
                b < 0 && b < Long.MIN_VALUE / a))*/

    if (b > 0){

        do {

            rafter = a * b;
            a = rafter;

            System.out.println("a: " + a + " b: " + b + " rafter: " + rafter);

        }
        while (Long.MAX_VALUE - a  > 0);}
    if(b < 0) {
        do {

            rafter = a * b;
            a = rafter;

            System.out.println("a: " + a + " b: " + b + " rafter: " + rafter);

        }
        while (Long.MAX_VALUE - a  > 0);
        }
        return a;
    }
    public static long multBefore(long a, long b) {
        long c = a;
        long rbefor;

        while (Long.MAX_VALUE - a > 0){
            c = a;
            rbefor = a * b;
            a = rbefor;
            System.out.println("a: " + a + "  b: " + b + "  c: " + c + "  rbefor: " + rbefor);
        }

        return c;
    }
}


