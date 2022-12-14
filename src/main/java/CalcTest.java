import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalcTest {
    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void testSub() {
        calculator = new Calculator();
        Assertions.assertEquals(3, calculator.sub(5, 2));
    }
    @Test
    public void testMul() {
        calculator = new Calculator();
        Assertions.assertEquals(9, calculator.mul(3, 3));
    }
    @Test
    public void testDiv() {
        calculator = new Calculator();
        Assertions.assertEquals(1, calculator.div(2, 2));
    }
}
