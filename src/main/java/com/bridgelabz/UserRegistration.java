package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String userFirstName = "^[A-Z]{1}[a-z]{3,}$";
    static String userLastName = "^[A-Z]{1}[a-z]{3,}$";
    static String userEmail = "^[0-9a-zA-Z]+([+.-]([a-z0-9A-Z]+))*[@][a-zA-Z0-9]+[.][a-z]{2,4}[,]?([.][a-z]{2,4})?$";
    static String userPhoneNumber = "^[0-9]{2}[0-9]{10}$";
    static String userPassword = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?])[!@#$%^&*?A-Z+a-z0-9]{8,}$";

    public ValidateDetails validateFirstName = (String firstName) -> {
        Pattern pattern = Pattern.compile(userFirstName);
        Matcher matcher= pattern.matcher(firstName);
        try {
            if (matcher.matches()){
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid First Name",UserRegistrationException.ExpectedType.FIRSTNAME);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public ValidateDetails validateLastName = (String lastName) -> {
        Pattern pattern = Pattern.compile(userLastName);
        Matcher matcher= pattern.matcher(lastName);
        try {
            if (matcher.matches()){
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Last Name",UserRegistrationException.ExpectedType.LASTNAME);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public ValidateDetails validateEmail = (String email) -> {
        Pattern pattern = Pattern.compile(userEmail);
        Matcher matcher= pattern.matcher(email);
        try {
            if (matcher.matches()){
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Email ID",UserRegistrationException.ExpectedType.EMAIL);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public ValidateDetails validatePhoneNumber = (String phoneNumber) -> {
        Pattern pattern = Pattern.compile(userPhoneNumber);
        Matcher matcher= pattern.matcher(phoneNumber);
        try {
            if (matcher.matches()){
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Phone Number",UserRegistrationException.ExpectedType.PHONENUMBER);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public ValidateDetails validatePassword = (String password) -> {
        Pattern pattern = Pattern.compile(userPassword);
        Matcher matcher= pattern.matcher(password);
        try {
            if (matcher.matches()){
                return true;
            } else {
                throw new UserRegistrationException("Enter Valid Password",UserRegistrationException.ExpectedType.PASSWORD);
            }
        } catch (UserRegistrationException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        userRegistration.validateFirstName.isValid(in.next());

        System.out.print("Enter Last Name: ");
        userRegistration.validateLastName.isValid(in.next());

        System.out.print("Enter Email Address: ");
        userRegistration.validateEmail.isValid(in.next());

        System.out.print("Enter Phone Number: ");
        userRegistration.validatePhoneNumber.isValid(in.next());

        System.out.print("Enter Password: ");
        userRegistration.validatePassword.isValid(in.next());
    }
}
