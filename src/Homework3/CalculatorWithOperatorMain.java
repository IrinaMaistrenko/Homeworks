package Homework3;

public class CalculatorWithOperatorMain implements ICalculator {
    public static void main(String[] args) {
        CalculatorWithOperator sc = new CalculatorWithOperator();        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        result = sc.sum(sc.sum(4.1,sc.multiply(15,7)),sc.pow((sc.div(28,5)),2));
        System.out.println(result);

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
