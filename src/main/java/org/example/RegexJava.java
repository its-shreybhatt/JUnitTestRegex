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
}
