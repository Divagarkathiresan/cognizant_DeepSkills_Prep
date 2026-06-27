package com.divagar.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void shouldAddPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addNumbers(10, 20);
        assertEquals(30, result);
    }

    @Test
    void shouldAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addNumbers(-5, -10);
        assertEquals(-15, result);
    }

    @Test
    void shouldAddZero() {
        Calculator calculator = new Calculator();
        int result = calculator.addNumbers(0, 0);
        assertEquals(0, result);
    }
}