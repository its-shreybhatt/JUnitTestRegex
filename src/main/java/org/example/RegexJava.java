package org.example;

import java.util.regex.Pattern;

public class RegexJava {
    public boolean firstName(String firstName) throws UserRegistrationException {
        Pattern patternOne = Pattern.compile("[A-Z][a-z]{2,}");
        try {
            return patternOne.matcher(firstName).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter correct name");
        }
    }
    public boolean lastName(String lastName) throws UserRegistrationException {
        Pattern patternTwo = Pattern.compile("[A-z][A-za-z]{2,}");
        try{
            return patternTwo.matcher(lastName).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please Enter Correct Lastname");
        }
    }

    public boolean emailId(String emailId) throws UserRegistrationException {
        try {
            Pattern patternEmail = Pattern.compile("[a-z-+0-9]+[.]?[a-z0-9]+[@][a-z0-9]+[.][a-z]{2,4}[.]?[a-z]{0,3}");
            return patternEmail.matcher(emailId).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter proper Email Id");
        }
    }

    public boolean mobileNumber(String mobNum) throws UserRegistrationException {
        try {
            Pattern patternMobile = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
            return patternMobile.matcher(mobNum).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter proper Mobile Numb");
        }
    }

    public boolean password(String password) throws UserRegistrationException {
        try {
            Pattern patternPassword = Pattern.compile("[A-Za-z]{8,}");
            return patternPassword.matcher(password).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter Minimum 8 Character");
        }
    }

    public boolean upperCasePassword(String upperCase) throws UserRegistrationException {
        try {
            Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z]).+${8,}");
            return patternPassword.matcher(upperCase).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter Minimum 1 UpperCase");
        }
    }

    public boolean numericPassword(String numeric) throws UserRegistrationException {
        try {
            Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9]).+${8,}");
            return patternPassword.matcher(numeric).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter Minimum 1 UpperCase and Minimum 1 Numeric");
        }
    }

    public boolean characterPassword(String character) throws UserRegistrationException {
        try {
            Pattern patternPassword = Pattern.compile("^(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[-+_!@#$%^&*.,?]).+${8,}");
            return patternPassword.matcher(character).matches();
        }catch (Exception e){
            throw new UserRegistrationException("Please enter exactly 1 character");
        }
    }
    public String analyseMood(String mood) {
        if (mood.contains("sad"))
            return "sad";
        return "happy";
    }
}