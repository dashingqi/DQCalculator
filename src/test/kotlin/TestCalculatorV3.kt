import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestCalculatorV3 {
    @Test
    fun testCalculator() {
        val calculatorV2 = CalculatorV2()
        val result = calculatorV2.calculate("1+2")
        assertEquals("3.0", result)
    }
}