import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldCalculateSquarePerimeterKnowingSideA_3() {
        //given
        int sideA = 3;
        Square square = new Square(sideA);

        //when
        double result = square.getPerimeter();

        //then
        Assert.assertEquals(12, result, 1);

    }
    @Test
    public void shouldCalculateSquareAreaKnowingSideA_3() {
        //given
        int sideA = 3;
        Square square = new Square(sideA);

        //when
        double result = square.getArea();

        //then
        Assert.assertEquals(9, result, 1);

    }

}