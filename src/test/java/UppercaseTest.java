import org.junit.Assert;
import org.junit.Test;

public class UppercaseTest {

    @Test
    public void shouldReturnStingConvertedToUppercase_Hell_World() {
        //given
        String text = "Hello World";
        Uppercase uppercase = new Uppercase(text);

        //when
        String result;
        result = uppercase.formatText(text);

        //then
        Assert.assertEquals(result, "HELLO WORLD");

    }

}