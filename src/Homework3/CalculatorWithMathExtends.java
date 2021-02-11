package Homework3;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator{
    public double Pow(double a, int b){
        double result = Math.pow(a,b);
        return result;
    }

    public int Abs(int a){
        int result = Math.abs(a);
        return result;
    }

    public double sqrt(double a){
        double result = Math.sqrt(a);
        return result;
    }

}
