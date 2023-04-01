package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean isValid(Matcher matcher){
        if (matcher.matches()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateFirstName(String firstName){
        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        return isValid(firstNameMatcher);
    }

    public boolean validateLastName(String lastName){
        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher lastNameMatcher = namePattern.matcher(lastName);
        return isValid(lastNameMatcher);
    }

    public boolean validateEmail(String email){
        Pattern sampleEmailPattern = Pattern.compile("^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$");
        Matcher sampleEmailMatcher = sampleEmailPattern.matcher(email);
        return isValid(sampleEmailMatcher);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern phoneNoPattern = Pattern.compile("^[0-9]{2}[0-9]{10}$");
        Matcher phoneNoMatcher = phoneNoPattern.matcher(phoneNumber);
        return isValid(phoneNoMatcher);
    }

    public boolean validatePassword(String password){
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?])[!@#$%^&*?A-Z+a-z0-9]{8,}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        return isValid(passwordMatcher);
    }
}
