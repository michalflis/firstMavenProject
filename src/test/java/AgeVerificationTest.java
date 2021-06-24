import org.junit.Assert;
import org.junit.Test;

public class AgeVerificationTest {

    @Test
    public void shouldCheckIfValueIsEqualToOrGreaterThen18_19(){
        // given
        AgeVerification ageVerification = new AgeVerification();
        int a = 19;

        //when
        boolean result = AgeVerification.isAdult(a);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldCheckIfValueIsLowerThen18_12(){
        // given
        AgeVerification ageVerification = new AgeVerification();
        int a = 12;

        //when
        boolean result = AgeVerification.isAdult(a);

        //then
        Assert.assertFalse(result);
    }

}
