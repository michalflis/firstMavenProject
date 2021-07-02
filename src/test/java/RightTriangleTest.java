import org.junit.Assert;
import org.junit.Test;

public class RightTriangleTest {

    int a;
    int b;
    int c;

    @Test
    public void shouldCheckIfTriangleWithSidesABCIsRight_3_4_5() {
        //given
        a = 3;
        b = 4;
        c = 5;

        //when
        boolean result = RightTriangle.isTriangleRight(a, b, c);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void shouldCheckIfTriangleWithSidesABCIsNotRight_2_4_6() {
        //given
        a = 2;
        b = 4;
        c = 6;

        //when
        boolean result = RightTriangle.isTriangleRight(a, b, c);

        //then
        Assert.assertFalse(result);

    }


}