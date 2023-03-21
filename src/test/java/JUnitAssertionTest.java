import org.example.RegexJava;
import org.example.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class JUnitAssertionTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        RegexJava object = new RegexJava();
        try {
            object.forFirstName.matchValue("Shrey");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Name", e.getMessage());
        }
    }


    @Test
    public void givenFirstName_WhenPassedNull_ShouldPass() {
        RegexJava object = new RegexJava();
        try {
            object.forFirstName.matchValue(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldPass() {
        RegexJava object = new RegexJava();
        try {
            object.forFirstName.matchValue("Sh");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Name", e.getMessage());
        }
    }


    @Test

    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            object.forLastName.matchValue("Bhatt");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forLastName.matchValue(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            object.forLastName.matchValue("Bt");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please Enter Correct Lastname", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.foremailId.matchValue("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.foremailId.matchValue(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            object.foremailId.matchValue("abc.a.a.@hi.c");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Email Id", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenProper_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.formobileNumber.matchValue("91 9557885533");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenPassedNull_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.formobileNumber.matchValue(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenMobileNum_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            object.formobileNumber.matchValue("9 933");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter proper Mobile Numb", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forpassword.matchValue("shreybhatt");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 8 Character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotEightChar_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forpassword.matchValue(null);
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 8 Character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinOneUpperCase_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forUpperCase.matchValue("shreYBhatt");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 1 UpperCase", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotMinUpperCase_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            object.forUpperCase.matchValue("Sgker");
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 1 UpperCase", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenMinOneUpperCaseAndNumeric_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forNumericPassword.matchValue("shReybhAtt22");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 1 UpperCase and Minimum 1 Numeric", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotMinOneUpperCaseAndNumeric_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forNumericPassword.matchValue("shReybhAtt22");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter Minimum 1 UpperCase and Minimum 1 Numeric", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenExactOneCharacter_ShouldReturnTrue() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forCharacterPassword.matchValue("shReybhAtt@22");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            Assert.assertEquals("Please enter exactly 1 character", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldPass() {
        try {
            RegexJava object = new RegexJava();
            boolean result = object.forCharacterPassword.matchValue("shReybhAtt@22");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
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
            boolean result = object.foremailId.matchValue(validEmails[i]);
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
            boolean result = object.foremailId.matchValue(inValidEmails[i]);
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