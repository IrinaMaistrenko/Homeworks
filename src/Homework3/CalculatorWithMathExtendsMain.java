package Homework3;

public class CalculatorWithMathExtendsMain implements ICalculator {
    public static void main(String[] args) {
        CalculatorWithMathExtends ff = new CalculatorWithMathExtends();
        double result;
        result = ff.sum(ff.sum(4.1,ff.multiply(15,7)),ff.Pow((ff.div(28,5)),2));
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
