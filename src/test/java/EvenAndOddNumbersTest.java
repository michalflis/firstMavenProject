import org.junit.Assert;
import org.junit.Test;

public class EvenAndOddNumbersTest {

    @Test
    public void shouldCheckIfNumberIsEven_15(){
        //given
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        int a = 15;

        //when
        boolean result = EvenAndOddNumbers.isEven(a);

        //then
        Assert.assertFalse(result);

    }

    @Test
    public void shouldCheckIfNumberIsEven_200(){
        //given
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        int a = 200;

        //when
        boolean result = EvenAndOddNumbers.isEven(a);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void shouldCheckIfNumberIsOdd_6(){
        //given
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        int a = 6;

        //when
        boolean result = EvenAndOddNumbers.isOdd(a);

        //then
        Assert.assertFalse(result);

    }

    @Test
    public void shouldCheckIfNumberIsOdd_77(){
        //given
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        int a = 77;

        //when
        boolean result = EvenAndOddNumbers.isOdd(a);

        //then
        Assert.assertTrue(result);

    }

}