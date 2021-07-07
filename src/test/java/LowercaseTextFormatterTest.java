import org.junit.Assert;
import org.junit.Test;

public class LowercaseTextFormatterTest {

    @Test
    public void shouldReturnStingConvertedToLowercase_Hell_World() {
        //given
        String text = "Hello World";
        LowercaseTextFormatter lowercaseTextFormatter = new LowercaseTextFormatter();

        //when
        String result;
        result = lowercaseTextFormatter.formatText(text);

        //then
        Assert.assertEquals(result, "hello world");

    }


}