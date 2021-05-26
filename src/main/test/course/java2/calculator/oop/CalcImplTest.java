package course.java2.calculator.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcImplTest {

    private final Calc calc = new CalcImpl();

    @Test
    void calculateSum() {
        assertEquals(10, calc.calculate(3, 7, '+'), 0.00);
    }

    @Test
    void calculateSub() {
        assertEquals(-7, calc.calculate(2, 9, '-'), 0.00);
    }

    @Test
    public void calculateMultiPly() {
        assertEquals(25, calc.calculate(5, 5, '*'), 0.00);
    }

    @Test
    public void calculateDiv() {
        assertEquals(4, calc.calculate(24, 6, '/'), 0.00);
    }

    @Test
    public void calculateDivThrow() {
        assertThrows(ArithmeticException.class, () -> calc.calculate(5, 0, '/'));
    }

    @Test
    public void calculateIncorrectOperationThrow() {
        assertThrows(IncorrectOperationException.class, () -> calc.calculate(4, 2, '#'));
    }
}