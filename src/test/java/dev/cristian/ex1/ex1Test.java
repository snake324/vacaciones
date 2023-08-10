package dev.cristian.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ex1Test {
    @Test
    public void testObtenerNombreMes() {
        assertEquals("Enero", ex1.obtenerNombreMes(1));
        assertEquals("Febrero", ex1.obtenerNombreMes(2));
        assertEquals("Diciembre", ex1.obtenerNombreMes(12));
        assertEquals("Mes inválido", ex1.obtenerNombreMes(0));
        assertEquals("Mes inválido", ex1.obtenerNombreMes(13));
    }

    @Test
    public void testObtenerCantidadDias() {
        assertEquals(31, ex1.obtenerCantidadDias(1));
        assertEquals(28, ex1.obtenerCantidadDias(2));
        assertEquals(31, ex1.obtenerCantidadDias(12));
        assertEquals(-1, ex1.obtenerCantidadDias(0));
        assertEquals(-1, ex1.obtenerCantidadDias(13));
    }
}
