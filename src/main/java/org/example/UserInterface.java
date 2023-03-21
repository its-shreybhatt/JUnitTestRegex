package org.example;

@FunctionalInterface
public interface UserInterface {
    boolean matchValue(String input) throws UserRegistrationException;
}
