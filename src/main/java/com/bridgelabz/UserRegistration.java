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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher firstNameMatcher = namePattern.matcher(firstName);
        isValid(firstNameMatcher);

        System.out.print("\nEnter Last Name: ");
        String lastName = sc.next();

        Matcher lastNameMatcher = namePattern.matcher(lastName);
        isValid(lastNameMatcher);
    }
}
