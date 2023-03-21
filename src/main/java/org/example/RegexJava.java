package org.example;

import java.util.regex.Pattern;

public class RegexJava {

    public UserInterface forFirstName = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("[A-Z][a-z]{2,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please Enter Correct Name");
        }
        return result;
    };

    public UserInterface forLastName = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("[A-z][A-za-z]{2,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please Enter Correct Lastname");
        }
        return result;
    };

    public UserInterface foremailId = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter proper Email Id");
        }
        return result;
    };

    public UserInterface formobileNumber = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter proper Mobile Numb");
        }
        return result;
    };

    public UserInterface forpassword = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("[A-Za-z]{8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter Minimum 8 Character");
        }
        return result;
    };

    public UserInterface forUpperCase = (input) -> {
        boolean result;
        try {
            result = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter Minimum 1 UpperCase");
        }
        return result;
    };

    public UserInterface forNumericPassword = input -> {
        boolean result;
        try {
            result = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter Minimum 1 UpperCase and Minimum 1 Numeric");
        }
        return result;
    };

    public UserInterface forCharacterPassword = input -> {
        boolean result;
        try {
            result = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}").matcher(input).matches();
        } catch (Exception e) {
            throw new UserRegistrationException("Please enter exactly 1 character");
        }
        return result;
    };

    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}