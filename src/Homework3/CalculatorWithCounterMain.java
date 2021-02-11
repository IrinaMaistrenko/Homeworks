package Homework3;

public class CalculatorWithCounterMain extends CalculatorWithCounter implements ICalculator {
    public static void main(String[] args) {

        CalculatorWithCounter cc = new CalculatorWithCounter();
        CalculatorWithOperator cc2 = new CalculatorWithOperator();

        double result ;

        result = cc2.sum(cc2.sum(4.1,cc2.multiply(15,7)),cc2.pow((cc2.div(28,5)),2));

        System.out.println(result);
        System.out.println(cc.getCountOperation(cc2.count));
    }
}
