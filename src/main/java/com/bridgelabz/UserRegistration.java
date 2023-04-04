package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validateFirstName(String firstName) throws InvalidDetailsException{
        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        if(firstNameMatcher.matches())
            return true;
        else
            throw new InvalidDetailsException("Invalid First Name!!!");
    }

    public boolean validateLastName(String lastName) throws InvalidDetailsException{
        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher lastNameMatcher = namePattern.matcher(lastName);
        if(lastNameMatcher.matches())
            return true;
        else
            throw new InvalidDetailsException("Invalid Last Name!!!");
    }

    public boolean validateEmail(String email) throws InvalidDetailsException{
        Pattern sampleEmailPattern = Pattern.compile("^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$");
        Matcher sampleEmailMatcher = sampleEmailPattern.matcher(email);
        if(sampleEmailMatcher.matches())
            return true;
        else
            throw new InvalidDetailsException("Invalid Email ID!!!");
    }

    public boolean validatePhoneNumber(String phoneNumber) throws InvalidDetailsException{
        Pattern phoneNoPattern = Pattern.compile("^[0-9]{2}[0-9]{10}$");
        Matcher phoneNoMatcher = phoneNoPattern.matcher(phoneNumber);
        if(phoneNoMatcher.matches())
            return true;
        else
            throw new InvalidDetailsException("Invalid Phone Number!!!");
    }

    public boolean validatePassword(String password) throws InvalidDetailsException{
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?])[!@#$%^&*?A-Z+a-z0-9]{8,}$");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        if(passwordMatcher.matches())
            return true;
        else
            throw new InvalidDetailsException("Invalid Password!!!");
    }
}
