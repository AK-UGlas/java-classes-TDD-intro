import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void addsNumber() {
        assertEquals(11, calc.add(5, 6));
    }

    @Test
    public void subtractTwoNums() {
        assertEquals( 25, calc.subtract(75, 50));
    }

    @Test
    public void multipliesTwoNums() {
        assertEquals(30, calc.multiply(5, 6));
    }

    @Test
    public void dividesTwoNums() {
        assertEquals(12.5, calc.divide(25.0, 2.0), 0.0);
    }

}
