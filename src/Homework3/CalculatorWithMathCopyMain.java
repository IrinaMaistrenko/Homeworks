package Homework3;

public class CalculatorWithMathCopyMain implements ICalculator {
    public static void main(String[] args) {
        CalculatorWithMathCopy jj  = new CalculatorWithMathCopy();
        double result;
        result = jj.sum(jj.sum(4.1,jj.multiply(15,7)),jj.pow((jj.div(28,5)),2));
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
