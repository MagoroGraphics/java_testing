import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void hasPaperLeft(){
        assertEquals(50, printer.getPaperSheetsLeft());
    }

    @Test
    public void canPrint(){
        assertEquals(10, printer.print(40));
    }

//    @Test
//    public void reducesToner(){
//        assertEquals(75, printer.print(25));
//    }

}
