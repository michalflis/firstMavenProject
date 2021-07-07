import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void shouldCalculateTrianglePerimeterKnowingSideAAndSideBAndSideC_2_3_4() {
        //given
        int sideA = 2;
        int sideB = 3;
        int sideC = 4;
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        //when
        double result = triangle.getPerimeter();

        //then
        Assert.assertEquals(9, result, 1);

    }
    @Test
    public void shouldCalculateRectangleAreaKnowingSideAAndSideB_1_3() {
        //given
        int sideA = 2;
        int sideB = 3;
        int sideC = 4;
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        //when
        double result = triangle.getArea();

        //then
        Assert.assertEquals(2.90, result, 0.01);

    }

}