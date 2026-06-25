package com.cognizant.JUnitExercises;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JUnitExercisesApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(JUnitExercisesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JUnitExercisesApplication.class, args);
    }

    @Override
    public void run(String... args) {

        String customerName = "Harsh Kumar";
        double balance = 15000.50;
        double withdrawAmount = 20000;

        logger.info("Bank application started");
        logger.info("Customer logged in: {}", customerName);
        logger.info("Current balance: {}", balance);

        if(withdrawAmount > balance) {
            logger.warn("Withdrawal amount {} is more than balance {}", withdrawAmount, balance);
        }

        try {
            if(withdrawAmount > balance) {
                throw new Exception("Insufficient balance");
            }
        } catch(Exception e) {
            logger.error("Transaction failed: {}", e.getMessage());
        }

        logger.info("Session ended for: {}", customerName);
    }
}