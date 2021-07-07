import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldCalculateSquarePerimeterKnowingSideA_2() {
        //given
        int sideA = 2;
        Square square = new Square(sideA);

        //when
        double result = square.getPerimeter();

        //then
        Assert.assertEquals(8, result, 1);

    }
    @Test
    public void shouldCalculateSquareAreaKnowingSideA_2() {
        //given
        int sideA = 2;
        Square square = new Square(sideA);

        //when
        double result = square.getArea();

        //then
        Assert.assertEquals(4, result, 1);

    }

}