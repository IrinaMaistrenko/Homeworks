package Homework3;

public class CalculatorWithMathCopy implements ICalculator {
    public double div(double a, double b){
        double result;
        result = a / b;
        return result;
    }
    public double multiply(double a, double b){
        double result ;
        result = a * b;
        return result;
    }
    public double sum(double a, double b){
        double result;
        result = a + b;
        return result;
    }
    public double sub(double a , double b){
        double result ;
        result = a - b;
        return result;
    }


    public double pow(double a, int b){
        double result = Math.pow(a,b);
        return result;
    }

    public int abs(int a){
        int result = Math.abs(a);
        return result;
    }

    public double sqrt(double a){
        double result = Math.sqrt(a);
        return result;
    }
}
