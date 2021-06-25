import org.junit.Assert;
import org.junit.Test;

public class WeekdaysTest {

    @Test
    public void shouldCheckWeekDayNameForDayNumber_1(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 1;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Monday", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_2(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 2;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Tuesday", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_3(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 3;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Wednesday", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_4(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 4;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Thursday", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_5(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 5;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Friday", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_6(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 6;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Weekend", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_7(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 7;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("Weekend", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_8(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 8;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("There is no such a day!", dayName);

    }

    @Test
    public void shouldCheckWeekDayNameForDayNumber_13(){
        //given
        Weekdays weekdays = new Weekdays();
        int numberOfDay = 13;

        //when
        String dayName = Weekdays.getWeekDayName(numberOfDay);

        //then
        Assert.assertEquals("There is no such a day!", dayName);

    }

}