package com.divagar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Exercise3 {
    @Test
    public void shouldPassAllAsserts(){
        assertEquals(4, 2+2);
        assertTrue(5>3);
        assertFalse(3<1);
        assertNull(null);
    }
}