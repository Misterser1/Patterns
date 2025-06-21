
import org.junit.jupiter.api.Test;
import org.rustem.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstJUnitJupiterTest {
    private final Calculator calculator = new Calculator();


    @Test
    void addition() {
        assertEquals(2, calculator.calculate(1 ,"+", 1));
    }
}
