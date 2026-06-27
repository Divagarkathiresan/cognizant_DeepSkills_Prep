package com.divagar.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void createObjectForCalculator(){
        calculator=new Calculator();
    }

    @Test
    void shouldAddPositiveNumbers() {
        int result = calculator.addNumbers(10, 20);
        assertEquals(30, result);
    }

    @Test
    void shouldAddNegativeNumbers() {
        int result = calculator.addNumbers(-5, -10);
        assertEquals(-15, result);
    }

    @Test
    void shouldAddZero() {
        int result = calculator.addNumbers(0, 0);
        assertEquals(0, result);
    }

    @AfterEach
    void setCalculatorObjectToNull(){
        calculator=null;
    }
}