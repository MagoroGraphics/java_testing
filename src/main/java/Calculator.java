public class Calculator {
    private int numberOne;
    private int numberTwo;

    public Calculator(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int addNumbers(){
        int addResult = numberOne + numberTwo;
        return addResult;
    }

    public int substractNumbers(){
        int substractResult = numberOne - numberTwo;
        return substractResult;
    }

    public int multiplyNumbers(){
        int multiplyResult = numberOne * numberTwo;
        return multiplyResult;
    }

    public double divideNumbers(double doubleNumOne, double doubleNumTwo){
        double divideResult = doubleNumOne / doubleNumTwo;
        return divideResult;
    }
}
