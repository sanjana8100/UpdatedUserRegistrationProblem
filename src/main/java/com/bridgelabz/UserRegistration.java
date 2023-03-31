package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("----------User Registration----------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.next();

        Pattern namePattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher firstNameMatcher = namePattern.matcher(firstName);

        if (firstNameMatcher.matches()) {
            System.out.print("Valid");
        }
        else {
            System.out.print("Invalid");
        }
    }
}
