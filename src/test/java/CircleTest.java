import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void shouldCalculateCirclePerimeterKnowingRadius_3() {
        //given
        int radius = 3;
        Circle circle = new Circle(radius);

        //when
        double result = circle.getPerimeter();

        //then
        Assert.assertEquals(18.84, result, 0.01);

    }
    @Test
    public void shouldCalculateCircleAreaKnowingRadius_3() {
        //given
        int radius = 3;
        Circle circle = new Circle(radius);

        //when
        double result = circle.getArea();

        //then
        Assert.assertEquals(28.27, result, 0.01);

    }


}