import org.junit.Assert;
import org.junit.Test;

public class MinutesAndScondsTest {

    int timeInMinutes;
    MinutesAndSconds minutesAndSconds = new MinutesAndSconds(timeInMinutes);

    @Test
    public void ShouldConverMinutesToSeconds_5() {
        //given

        timeInMinutes = 5;

        //when

        int timeInSeconds = minutesAndSconds.convertMinutesToSeconds(timeInMinutes);

        //then

        Assert.assertEquals(timeInSeconds, 300);

    }

    @Test
    public void ShouldConverMinutesToSeconds_0() {
        //given

        timeInMinutes = 0;

        //when

        int timeInSeconds = minutesAndSconds.convertMinutesToSeconds(timeInMinutes);

        //then

        Assert.assertEquals(timeInSeconds, 0);

    }

}