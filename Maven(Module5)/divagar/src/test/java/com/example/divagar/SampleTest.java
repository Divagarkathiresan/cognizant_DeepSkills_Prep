package com.example.divagar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class SampleTest{

    @Test
    public void check(){
        assertEquals(4,2+2);
    }

    @Test
    public void check1(){
        assertNull(null);
    }
}