package com.cognizant.JUnitExercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class JUnitSetupTest {

    @BeforeEach
    void setUp() {
        System.out.println("Setting up before each test...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after each test.");
    }

    @Test
    void checkAppStarts() {
        System.out.println("Test 1: App started successfully");
    }

    @Test
    void checkBasicFlow() {
        System.out.println("Test 2: Basic flow working fine");
    }
}