package org.example.JUnit_Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void testTwoNumber(){
        var cal = new SimpleCalculator();
        assertEquals(4, cal.add(2, 2)); // Using assertEqual
        //assertTrue(cal.add(2, 2) == 4); // Using assertTrue
    }

    @Test
    void twoDiffNum(){
        var cal2 = new SimpleCalculator();
        assertEquals(17, cal2.add(10, 7));
    }
}