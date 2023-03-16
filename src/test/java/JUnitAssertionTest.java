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
}