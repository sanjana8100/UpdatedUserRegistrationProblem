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
    void givenFirstNameShouldReturnTrue(){
        boolean value = userRegistration.validateFirstName("Sanjana");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully Passed UC1");
    }
    @Test
    void givenLastNameShouldReturnTrue(){
        boolean LastName = userRegistration.validateLastName("Srinivas");
        Assertions.assertTrue(LastName);
        System.out.println("Last Name Checked :- Successfully Passed UC2");
    }

    @Test
    void givenEmailIdShouldReturnTrue(){
        boolean Email = userRegistration.validateEmail("sanjanams@gmail.com");
        Assertions.assertTrue(Email);
        System.out.println("Email ID Checked :- Successfully Passed UC3");
    }
    @Test
    void givenMobileNumberShouldReturnTrue(){
        boolean PhoneNumber = userRegistration.validatePhoneNumber("919535397690");
        Assertions.assertTrue(PhoneNumber);
        System.out.println("PhoneNumber Checked :- Successfully Passed UC4");
    }

    @Test
    void checkPasswordShouldReturnTrue(){
        boolean Password = userRegistration.validatePassword("Sanjana@1");
        Assertions.assertTrue(Password);
        System.out.println("Password Checked(Rule1, Rule2, Rule3 & Rule4) :- Successfully Passed UC5,UC6,UC7,UC8");
    }

    @Test
    void checkEmailShouldReturnTrue(){
        String[] array = {"abc@yahoo.com","abc@yahoo.com","abc-100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com","abc@yahoo.com"};
        for(int i=0 ; i<array.length ; i++)
        {
            boolean email = userRegistration.validateEmail(array[i]);
            Assertions.assertTrue(email);
            System.out.println(i+1+") Email sample Checked");
        }
        System.out.println("All test case successfully Passed!!!!");
    }
}
