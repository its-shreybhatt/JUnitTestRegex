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
        Pattern patternEmail = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}");
        return patternEmail.matcher(emailId).matches();
    }

    public boolean mobileNumber(String mobNum) {
        Pattern patternMobile = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
        return patternMobile.matcher(mobNum).matches();
    }

    public boolean password(String password) {
        Pattern patternPassword = Pattern.compile("[A-Za-z]{8,}");
        return patternPassword.matcher(password).matches();
    }

    public boolean upperCasePassword(String upperCase) {
        Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z]).+${8,}");
        return patternPassword.matcher(upperCase).matches();
    }

    public boolean numericPassword(String numeric) {
        Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}");
        return patternPassword.matcher(numeric).matches();
    }

    public boolean characterPassword(String character) {
        Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}");
        return patternPassword.matcher(character).matches();
    }
}