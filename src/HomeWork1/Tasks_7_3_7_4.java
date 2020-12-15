package HomeWork1;

public class Tasks_7_3_7_4 {
    public static void main(String [] args) {
       System.out.print(toBinaryString ());
    }

        public static String toBinaryString() {
            byte b1 = -42;
            byte bmod = (byte) Math.abs(b1); //беру модуль отрицательного числа
            StringBuilder byteString = new StringBuilder();
            for (int i = 128; i > 0; i /= 2) {
                if ((bmod & i) != 0) {
                    byteString.append(0); //здесь с использованием кодировки "отрицаю" биты
                } else {
                    byteString.append(1);
                }
            }
            return "Двоичное представление числа " + b1 + ": " + byteString;

        }
    }
