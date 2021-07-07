import org.junit.Assert;
import org.junit.Test;

public class UppercaseTextFormatterTest {

    @Test
    public void shouldReturnStingConvertedToUppercase_Hell_World() {
        //given
        String text = "Hello World";
        UppercaseTextFormatter uppercaseTextFormatter = new UppercaseTextFormatter();

        //when
        String result;
        result = uppercaseTextFormatter.formatText(text);

        //then
        Assert.assertEquals(result, "HELLO WORLD");

    }

}