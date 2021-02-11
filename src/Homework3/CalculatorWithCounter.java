package Homework3;

public class CalculatorWithCounter  extends CalculatorWithOperator {
    private Object calculator;

    protected CalculatorWithCounter(){

    }
    public CalculatorWithCounter(CalculatorWithOperator calculator){
        this.calculator = calculator;
    }
    public CalculatorWithCounter(CalculatorWithMathCopy calculator){
        this.calculator = calculator;
    }
    public CalculatorWithCounter(CalculatorWithMathExtends calculator){
        this.calculator = calculator;
    }

    public long getCountOperation(long a){

        return a;
    }
}
