package com.cognizant.JUnitExercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class AAAPatternTest {

    private int salary;
    private int bonus;

    @BeforeEach
    void setUp() {
        salary = 30000;
        bonus = 5000;
        System.out.println("Setting up salary and bonus values...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test done, resetting values.");
    }

    @Test
    void checkTotalIncome() {
        int expectedTotal = 35000;
        int actualTotal = salary + bonus;
        assertEquals(expectedTotal, actualTotal);
        System.out.println("Total income check passed: " + actualTotal);
    }

    @Test
    void checkSalaryAfterDeduction() {
        int deduction = 3000;
        int expectedSalary = 27000;
        int actualSalary = salary - deduction;
        assertEquals(expectedSalary, actualSalary);
        System.out.println("Salary after deduction: " + actualSalary);
    }

    @Test
    void checkBonusIsPositive() {
        boolean isPositive = bonus > 0;
        assertTrue(isPositive);
        System.out.println("Bonus is positive: " + bonus);
    }
}