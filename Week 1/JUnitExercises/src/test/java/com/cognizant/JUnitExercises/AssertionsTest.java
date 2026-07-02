package com.cognizant.JUnitExercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void checkAddition() {
        int result = 10 + 20;
        assertEquals(30, result);
        System.out.println("Addition check passed: " + result);
    }

    @Test
    void checkName() {
        String name = "Harsh";
        assertNotNull(name);
        System.out.println("Name is not null: " + name);
    }

    @Test
    void checkLogin() {
        boolean isLoggedIn = true;
        assertTrue(isLoggedIn);
        System.out.println("Login check passed: " + isLoggedIn);
    }

    @Test
    void checkAge() {
        int age = 20;
        assertNotEquals(18, age);
        System.out.println("Age check passed: " + age);
    }
}
