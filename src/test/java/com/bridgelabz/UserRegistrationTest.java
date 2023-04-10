package com.bridgelabz;

import org.junit.jupiter.api.*;

public class UserRegistrationTest {
    static UserRegistration userRegistration;

    @BeforeAll
    public static void init(){
        System.out.println("Before all");
        userRegistration = new UserRegistration();
    }
    @Test
    void givenFirstNameShouldReturnTrue() {
        boolean value = userRegistration.validateFirstName.isValid("Sanjana");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully Passed UC1");
    }
    @Test
    void givenLastNameShouldReturnTrue() {
        boolean LastName = userRegistration.validateLastName.isValid("Srinivas");
        Assertions.assertTrue(LastName);
        System.out.println("Last Name Checked :- Successfully Passed UC2");
    }

    @Test
    void givenEmailIdShouldReturnTrue() {
        boolean Email = userRegistration.validateEmail.isValid("sanjanams@gmail.com");
        Assertions.assertTrue(Email);
        System.out.println("Email ID Checked :- Successfully Passed UC3");
    }
    @Test
    void givenMobileNumberShouldReturnTrue() {
        boolean PhoneNumber = userRegistration.validatePhoneNumber.isValid("919535397690");
        Assertions.assertTrue(PhoneNumber);
        System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
    }

    @Test
    void checkPasswordShouldReturnTrue() {
        boolean Password = userRegistration.validatePassword.isValid("Sanjana@1");
        Assertions.assertTrue(Password);
        System.out.println("Password Checked(Rule1, Rule2, Rule3 & Rule4) :- Successfully Passed UC5,UC6,UC7,UC8");
    }
}