package HomeWork1;

public class Task_6 {
    public static void main(String[] args) {
       //String n1 = createPhoneNumber();
       System.out.print(createPhoneNumber());
    }

    private static String createPhoneNumber() {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < ints.length; i++);
        return "(" + ints [1] + ints[2] + ints[3] + ")"+ " " + ints[4] + ints[5] + ints[6] + "-" + ints[7] + ints[8] + ints[9] + ints[0];
    }
}


