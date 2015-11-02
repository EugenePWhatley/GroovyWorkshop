package Calculator

import org.junit.Before
import org.junit.Test

class CalculatorTest {

    Calculator calculator

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator()
    }

    @Test
    void shouldBeZeroWhenIAddZeroPlusZero() {
        assert calculator.add(0, 0) == 0
    }

    @Test
    void shouldBeOneWhenIAddOnePlusZero() {
        assert calculator.add(1, 0) == 1
    }

    @Test
    void shouldBeThreeWhenIAddOnePlusTwo() {
        assert calculator.add(1, 2) == 3
    }

    @Test
    void shouldBeZeroWhenISubtractZeroFromZero() {
        assert calculator.subtract(0, 0) == 0
    }

    @Test
    void shouldBeOneWhenISubtractOneFromTwo() {
        assert calculator.subtract(1, 2) == 1
    }

    @Test
    void shouldBeNegativeOneWhenISubtractOneFromZero() {
        assert calculator.subtract(1, 0) == -1
    }

    @Test
    void shouldBeZeroWhenIMultiplyZeroTimesZero() {
        assert calculator.multiply(0, 0) == 0
    }

    @Test
    void shouldBeOneWhenIMultiplyOneTimesOne() {
        assert calculator.multiply(1, 1) == 1
    }

    @Test
    void shouldBeTwoWhenIMultiplyOneTimesTwo() {
        assert calculator.multiply(1, 2) == 2
    }

    @Test
    void shouldBeUndefinedWhenIDivideZeroByZero() {
        assert calculator.divide(0, 0) == 'undefined'
    }

    @Test
    void shouldBeZeroWhenIDivideZeroByOne() {
        assert calculator.divide(0, 1) == 0
    }

    @Test
    void shouldBeTwoWhenIDivideTwoByOne() {
        assert calculator.divide(2, 1) == 2
    }
}
