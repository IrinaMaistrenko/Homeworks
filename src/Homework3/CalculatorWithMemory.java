package Homework3;

public class CalculatorWithMemory implements ICalculator {
    private double memory;
    private double lastCalculatedValue;
    private ICalculator calc;
    private long countOperation;

    public CalculatorWithMemory(ICalculator calc){
        this.calc = calc;
    }


    @Override
    public double div(double a, double b) {
        counting();
        return this.lastCalculatedValue = this.calc.div(a,b);
    }

    @Override
    public double multiply(double a, double b) {
        counting();
        return this.lastCalculatedValue = this.calc.multiply(a,b);
    }

    @Override
    public double sub(double a, double b) {
        counting();
        return this.lastCalculatedValue = this.calc.sub(a,b);
    }

    @Override
    public double sum(double a, double b) {
        counting();
        return this.lastCalculatedValue = this.calc.sum(a,b);
    }


    @Override
    public double pow(double number, int power) {
        counting();
        return this.lastCalculatedValue = this.calc.pow(number,power);
    }

    @Override
    public int abs(int a) {
        counting();
        return (int) (this.lastCalculatedValue = this.calc.abs(a));
    }

    @Override
    public double sqrt(double a) {
        counting();
        return this.lastCalculatedValue = this.calc.sqrt(a);
    }

    public void addToMemory(){
        this.memory = this.lastCalculatedValue;
    }


    public double getFromMemory(){
        double tmp = this.memory;
        this.memory = 0;
        this.lastCalculatedValue = 0;
        return tmp ;
    }

    public long getCountOperation() {
        return this.countOperation;
    }

    private void counting(){
        ++countOperation;
    }
}
