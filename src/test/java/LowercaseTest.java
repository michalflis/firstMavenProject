import org.junit.Assert;
import org.junit.Test;

public class LowercaseTest {

    @Test
    public void shouldReturnStingConvertedToLowercase_Hell_World() {
        //given
        String text = "Hello World";
        Lowercase lowercase = new Lowercase(text);

        //when
        String result;
        result = lowercase.formatText(text);

        //then
        Assert.assertEquals(result, "hello world");

    }


}