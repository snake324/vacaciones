package dev.cristian.ex2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ex2Test {
    @Test
    public void testex2() {
        assertTrue(ex2.esAñoBisiesto(2004));
        assertTrue(ex2.esAñoBisiesto(2000));
        assertFalse(ex2.esAñoBisiesto(1900));
        assertFalse(ex2.esAñoBisiesto(2001));
    }
}