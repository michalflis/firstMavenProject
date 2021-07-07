import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void shouldCalculateCirclePerimeterKnowingRadius_2() {
        //given
        int radius = 2;
        Circle circle = new Circle(radius);

        //when
        double result = circle.getPerimeter();

        //then
        Assert.assertEquals(12.57, result, 0.01);

    }
    @Test
    public void shouldCalculateCircleAreaKnowingRadius_2() {
        //given
        int radius = 2;
        Circle circle = new Circle(radius);

        //when
        double result = circle.getArea();

        //then
        Assert.assertEquals(12.57, result, 0.01);

    }


} 