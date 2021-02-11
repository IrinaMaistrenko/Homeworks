package Homework3;

public class WithOutCalculatorMain implements ICalculator {
    public static void main(String[] args) {
        double a = 4.1 + 15 * 7 + Math.pow((28 / 5), 2);
        System.out.println(a);
    }

    @Override
    public double div(double a, double b) {
        return 0;
    }

    @Override
    public double multiply(double a, double b) {
        return 0;
    }

    @Override
    public double sum(double a, double b) {
        return 0;
    }

    @Override
    public double sub(double a, double b) {
        return 0;
    }

    @Override
    public double pow(double a, int b) {
        return 0;
    }

    @Override
    public int abs(int a) {
        return 0;
    }

    @Override
    public double sqrt(double a) {
        return 0;
    }
}
