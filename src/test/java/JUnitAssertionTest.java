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

    @Test
    void givenMobileNum_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.mobileNumber("91 9557885533");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.password("shreybhatt");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenMinOneUpperCase_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.upperCasePassword("shreYBhatt");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenMinOneUpperCaseAndNumeric_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.numericPassword("shReybhAtt22");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }

    @Test
    void givenPassword_WhenExactOneCharacter_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.characterPassword("shReybhAtt@22");
        Assertions Assert = null;
        Assert.assertTrue(result);
    }
}