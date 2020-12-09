package HomeWork1;
public class Task1 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;
        double e = 42.5;
        String bin_a = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.println("Двоичный формат числа" + " " + a + ":");
        System.out.println(bin_a);
        String bin_b = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.println("Двоичный формат числа" + " " + b + ":");
        System.out.println(bin_b);
        String bin_c = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.println("Двоичный формат числа" + " " + c + ":");
        System.out.println(bin_c);
        System.out.println("Как представить полученное двоичное 32-х битное" + " " + bin_c + " " + "в виде 8-и битного - поищу-подумаю на выходных, пока ничего умнее,чем просто обрезать слева в голову не пришло :(");
        String bin_d = String.format("%8s", Integer.toBinaryString(d)).replace(' ', '0');
        System.out.println("Двоичный формат числа" + " " + d + ":");
        System.out.println(bin_d);
        System.out.println("Тут история насчет представления в виде 8-и бит аналогичная предыдущей...");
        String Bin_e = "";
        long numberBits = Double.doubleToLongBits(e);
        Bin_e = Long.toBinaryString(numberBits);
        System.out.println("Двоичный формат числа" + " " + e + ":");
        System.out.println(e > 0 ? "0" + Bin_e : Bin_e);
        System.out.println("И тут тоже насчет представления в виде 8-и бит аналогично...");
        System.out.println();
        System.out.println("Теперь побитовые операции с указанными выше числами:");

        int a1 = ~a;
        System.out.println("Побитовое унарное отрицание (NOT) числа 42 дает: " + Integer.toBinaryString(a1) + " ");
        int b1 = ~b;
        System.out.println("Побитовое унарное отрицание (NOT) числа 15 дает: " + Integer.toBinaryString(b1) + " ");
        int c1 = ~c;
        System.out.println("Побитовое унарное отрицание (NOT) числа -42 дает: " + Integer.toBinaryString(b1) + " ");
        int d1 = ~d;
        System.out.println("Побитовое унарное отрицание (NOT) числа -15 дает: " + Integer.toBinaryString(b1) + " ");
        int ab = a & b;
        String bin_ab = String.format("%8s", Integer.toBinaryString(ab)).replace(' ', '0');
        System.out.println("Побитовое сложение (AND) чисел 42 и 15 дает: ");
        System.out.println(bin_ab);
        int cd = c & d;
        String bin_cd = String.format("%8s", Integer.toBinaryString(cd)).replace(' ', '0');
        System.out.println("Побитовое сложение (AND) чисел -42 и -15 дает: ");
        System.out.println(bin_cd);
        int ac = a & c;
        String bin_ac = String.format("%8s", Integer.toBinaryString(ac)).replace(' ', '0');
        System.out.println("Побитовое сложение (AND) чисел 42 и -42 дает: ");
        System.out.println(bin_ac);
        int bd = b & d;
        String bin_bd = String.format("%8s", Integer.toBinaryString(bd)).replace(' ', '0');
        System.out.println("Побитовое сложение (AND) чисел 15 и -15 дает: ");
        System.out.println(bin_bd);
        int ad = a & d;
        String bin_ad = String.format("%8s", Integer.toBinaryString(ad)).replace(' ', '0');
        System.out.println("Побитовое сложение (AND) чисел 42 и -15 дает: ");
        System.out.println(bin_ad);






    }
}




