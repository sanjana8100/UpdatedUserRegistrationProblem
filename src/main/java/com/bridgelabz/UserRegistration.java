package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void isValid(Matcher matcher){
        if (matcher.matches()) {
            System.out.println("---Valid---");
        }
        else {
            System.out.println("--Invalid--");
        }

    }
    public static void main(String[] args) {
        System.out.println("----------User Registration----------");

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = in.next();

        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        isValid(firstNameMatcher);

        System.out.print("\nEnter Last Name: ");
        String lastName = in.next();

        Matcher lastNameMatcher = namePattern.matcher(lastName);
        isValid(lastNameMatcher);

        System.out.print("Enter Email Address: ");
        String email = in.next();

        Pattern emailPattern = Pattern.compile("^[0-9a-zA-Z]+([.]([a-z0-9A-Z]+))*[@][a-zA-Z]+[.][a-z]{2,4}([.][a-z]{2})?$");
        Matcher emailMatcher = emailPattern.matcher(email);
        isValid(emailMatcher);
    }
}
