import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void canAdd(){
        calculator = new Calculator(4,2);
        assertEquals(6, calculator.addNumbers());
    }

    @Test
    public void canSubstract(){
        calculator = new Calculator(8,3);
        assertEquals(5, calculator.substractNumbers());
    }

    @Test
    public void canMultiply(){
        calculator = new Calculator(5,2);
        assertEquals(10, calculator.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        calculator = new Calculator(7,2);
        assertEquals(4.3, calculator.divideNumbers(8.6,2.0), 0.0);
    }
}
