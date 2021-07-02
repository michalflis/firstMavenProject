import org.junit.Assert;
import org.junit.Test;

public class MinutesAndScondsTest {

    int timeInMinutes;

    @Test
    public void shouldConverMinutesToSeconds_5() {
        //given

        timeInMinutes = 5;

        //when

        int timeInSeconds = MinutesAndSconds.convertMinutesToSeconds(timeInMinutes);

        //then

        Assert.assertEquals(timeInSeconds, 300);

    }

    @Test
    public void shouldConverMinutesToSeconds_0() {
        //given

        timeInMinutes = 0;

        //when

        int timeInSeconds = MinutesAndSconds.convertMinutesToSeconds(timeInMinutes);

        //then

        Assert.assertEquals(timeInSeconds, 0);

    }

}