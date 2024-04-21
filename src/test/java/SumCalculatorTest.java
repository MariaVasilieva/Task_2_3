import org.example.SumCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    private static SumCalculator calc;
    @BeforeAll
    static void beforeAll() {
        calc = new SumCalculator();
    }
    @Test
    void sumOneReturnOne(){
        //When
        int actual = calc.sum(1);
        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void sumThreeReturnSix(){
        //When
        int actual = calc.sum(3);
        //Then
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    void sumZeroThrowExeption(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
