package Homework3;

public class CalculatorWithOperator implements ICalculator {

    public long count = 0;

    public double div(double a, double b){
        double result;
        result = a / b;
        count++;
        return result;
    }
    public double multiply(double a, double b){
        double result ;
        result = a * b;
        count++;
        return result;
    }
    public double sum(double a, double b){
        double result;
        result = a + b;
        count++;
        return result;
    }
    public double sub(double a , double b){
        double result ;
        result = a - b;
        count++;
        return result;
    }

    public double pow(double a, int b){
        double result = 1;
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }
        count++;
        return result;
    }

    public int abs(int a){
        int result = (a < 0) ? -a : a;
        count++;
        return result;
    }

    public double sqrt(double a){
        double result = Math.sqrt(a);
        count++;
        return result;
    }

}
