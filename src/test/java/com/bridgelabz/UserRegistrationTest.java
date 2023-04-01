package com.bridgelabz;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    private String email;
    private boolean expectedResult;
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

    public UserRegistrationTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection sampleEmails(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc", false},
                {"abc-100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc()*@gmail.com", false},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.aa.au", false},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc@yahoo.com", true}
        });
    }


    @Test
    void checkEmailShouldReturnTrue(){
        System.out.println("Parameterized Sample Email is: "+email);
        Assertions.assertEquals(expectedResult,userRegistration.validateEmail(email));
        System.out.println("Email Sample Passed");
    }
}
