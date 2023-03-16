import org.example.RegexJava;
import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.firstName("Shrey");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.lastName("Bhatt");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.emailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.mobileNumber("91 9557885533");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.password("shreybhatt");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenMinOneUpperCase_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.upperCasePassword("shreYBhatt");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenMinOneUpperCaseAndNumeric_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.numericPassword("shReybhAtt22");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenExactOneCharacter_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        boolean result = object.characterPassword("shReybhAtt@22");
        Assert.assertTrue(result);
    }

    @Test
    public void givenValidEmailSamples_WhenTested_ShouldReturnTrue() {
        String[] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        RegexJava object = new RegexJava();
        for (int i = 0; i < validEmails.length; i++) {
            boolean result = object.emailId(validEmails[i]);
            Assert.assertTrue(result);
        }
    }

    @Test
    public void givenInvalidEmailSamples_WhenTested_ShouldReturnFalse() {
        String[] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
                "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        RegexJava object = new RegexJava();
        for (int i = 0; i < inValidEmails.length; i++) {
            boolean result = object.emailId(inValidEmails[i]);
            Assert.assertFalse(result);
        }
    }

    @Test
    public void givenSentence_WhenContainsSad_ShouldPassTest() {
        RegexJava object = new RegexJava();
        String mood = object.analyseMood("this is a sad message");
        Assert.assertEquals("sad", mood);
    }
}