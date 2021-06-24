import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void ShouldAddTwoValues_11And17() {
        // given
        Calculator calculator = new Calculator();
        int a = 11;
        int b = 17;

        // when
        int result = calculator.sum(a, b);

        // then
        Assert.assertEquals(28, result);
    }

    @Test
    public void ShouldAddSubtractTwoValues_10And3() {
        // given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 3;

        // when
        int result = calculator.subtract(a, b);

        // then
        Assert.assertEquals(7, result);
    }

    @Test
    public void ShouldAddMultiplyTwoValues_2And66() {
        // given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 66;

        // when
        int result = calculator.multiply(a, b);

        // then
        Assert.assertEquals(132, result);
    }

    @Test
    public void ShouldAddDivideTwoValues_0And7() {
        // given
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 7;

        // when
        double result = calculator.divide(a, b);

        // then
        Assert.assertEquals(0, result, 0.0001);
    }

    @Test
    public void ShouldAddDivideTwoValues_11And3() {
        // given
        Calculator calculator = new Calculator();
        int a = 11;
        int b = 3;

        // when
        double result = calculator.divide(a, b);

        // then
        Assert.assertEquals(3.6666, result, 0.0001);
    }
}