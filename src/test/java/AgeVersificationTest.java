import org.junit.Assert;
import org.junit.Test;

public class AgeVersificationTest {

    @Test
    public void shouldCheckIfValueIsEqualToOrGreaterThen18_19(){
        // given
        AgeVersification ageVerification = new AgeVersification();
        int a = 19;

        //when
        boolean result = AgeVersification.isAdult(a);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldCheckIfValueIsLowerThen18_12(){
        // given
        AgeVersification ageVerification = new AgeVersification();
        int a = 12;

        //when
        boolean result = AgeVersification.isAdult(a);

        //then
        Assert.assertFalse(result);
    }

}
