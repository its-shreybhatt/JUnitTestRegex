import org.example.RegexJava;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitAssertionTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.firstName("Shrey");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.lastName("Bhatt");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenEmailId_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.emailId("abc.xyz@bl.co.in");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }
}