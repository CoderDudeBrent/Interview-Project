package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionTest {

    @Test
    public void testAddition() {
        // Test addition
        assertEquals(" + ", Main.MathFunction(1, 2, 3));
    }
    @Test void testAddyMulty() {
        assertEquals("+ *", Main.MathFunction(2, 2, 4));
    }
    @Test
    public void testSubtraction() {
        // Test subtraction
        assertEquals(" - ", Main.MathFunction(5, 2, 3));
    }
    @Test void testMulti() {
        // Test multiplication
        assertEquals(" * ", Main.MathFunction(2, 3, 6));
    }
    @Test void testDivi() {
        // Test division
        assertEquals(" / ", Main.MathFunction(6, 2, 3));
    }
    @Test void testNone() {
        // Test no solution
        assertEquals("None", Main.MathFunction(1, 2, 4));
    }
}