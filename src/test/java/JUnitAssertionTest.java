import org.example.RegexJava;
import org.example.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        try {
            boolean result = object.firstName("Shrey");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter correct name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenPassedNull_ShouldPass() {
        RegexJava object = new RegexJava();
        try {
            boolean result = object.firstName(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter correct name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldPass() {
        RegexJava object = new RegexJava();
        try {
            boolean result = object.firstName("sh");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter correct name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.lastName("Bhatt");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.lastName(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.lastName("Bt");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.emailId("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.emailId(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.emailId("abc.@hi.c");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.mobileNumber("91 9557885533");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.mobileNumber(null);
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.mobileNumber("9 933");
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.password("shreybhatt");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter Minimum 8 Character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotEightChar_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.password(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 8 Character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinOneUpperCase_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.upperCasePassword("shreYBhatt");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter Minimum 1 UpperCase", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotMinUpperCase_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.upperCasePassword("Sgker");
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter Minimum 1 UpperCase", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinOneUpperCaseAndNumeric_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.numericPassword("shReybhAtt22");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter Minimum 1 UpperCase and Minimum 1 Numeric", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotMinOneUpperCaseAndNumeric_ShouldPass() {
        try{
        RegexJava object = new RegexJava();
        boolean result = object.numericPassword("shReybhAtt22");
        Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter Minimum 1 UpperCase and Minimum 1 Numeric", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenExactOneCharacter_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.characterPassword("shReybhAtt@22");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter exactly 1 character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.characterPassword("shReybhAtt@22");
            Assert.assertTrue(result);
        }catch (UserRegistrationException e){
            Assert.assertEquals("Please enter exactly 1 character", e.getMessage());
        }
    }

    @Test
    public void givenValidEmailSamples_WhenTested_ShouldReturnTrue() throws UserRegistrationException {
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
    public void givenInvalidEmailSamples_WhenTested_ShouldReturnFalse() throws UserRegistrationException {
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