package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexJava {
    public boolean firstName(String firstName) {
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        return patternOne.matcher(firstName).matches();
    }
    public boolean lastName(String lastName) {
        Pattern patternTwo = Pattern.compile("[A-z][A-za-z]{2,}");
       return patternTwo.matcher(lastName).matches();
    }

    public boolean emailId(String emailId) {
        Pattern patternEmail = Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}");
        return patternEmail.matcher(emailId).matches();
    }

    public boolean mobileNumber(String mobNum) {
        Pattern patternEmail = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
        return patternEmail.matcher(mobNum).matches();
    }

    public boolean password(String password) {
        Pattern patternEmail = Pattern.compile("[A-Za-z]{8,}");
        return patternEmail.matcher(password).matches();
    }
}
