package com.divagar.junit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class LearnTest {
    private Calculator calculator;
    @BeforeEach
    void createObjectForCalculator(){
        calculator=new Calculator();
    }
    @Test
    void allCheck(){
        //assert All
        assertAll(
            ()->assertEquals(3,calculator.addNumbers(1,2)),
            ()->assertTrue(calculator.isPositive(1))
        );
    }
    //nested
    @Nested
    class checkAllAddition{
        @Test
        void checkPositiveAddtion(){
            assertEquals(3,calculator.addNumbers(1, 2));
        }
        @Test
        void checkNegativeAddtion(){
            assertEquals(-2,calculator.addNumbers(-1, -1));
        }
    }
    //assumptions
    @Test
    void assumptions(){
        assumingThat(calculator.addNumbers(1, 2)==3, ()->{System.out.println("Satisfied");});
    }
}
