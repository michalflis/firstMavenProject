import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldCalculateRectanglePerimeterKnowingSideAAndSideB_1_3() {
        //given
        int sideA = 1;
        int sideB = 3;
        Rectangle rectangle = new Rectangle(sideA, sideB);

        //when
        double result = rectangle.getPerimeter();

        //then
        Assert.assertEquals(8, result, 1);

    }
    @Test
    public void shouldCalculateRectangleAreaKnowingSideAAndSideB_1_3() {
        //given
        int sideA = 1;
        int sideB = 3;
        Rectangle rectangle = new Rectangle(sideA, sideB);

        //when
        double result = rectangle.getArea();

        //then
        Assert.assertEquals(3, result, 1);

    }


}

