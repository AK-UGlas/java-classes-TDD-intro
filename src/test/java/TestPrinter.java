import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 25);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void hasToner() {
        assertEquals(25, printer.getTonerVol());
    }

    @Test
    public void hasEnoughPaperAndToner() {
        printer.print(10, 2);
        assertEquals(80, printer.getPaperLeft());
        assertEquals(5, printer.getTonerVol());
    }

    @Test
    public void outOfPaper() {
        printer.print(50, 3);
        assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void outOfToner() {
        printer.print(50, 1);
        assertEquals(75, printer.getPaperLeft());
        assertEquals(0, printer.getTonerVol());
    }
}
