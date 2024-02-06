package Tema5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiendaMascotasTest {

    @Test
    public void agregarMascota() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Alex", 9, "perro");
            assertEquals(1, tienda.numeroMascotas);
    }

    @Test
    public void venderMascota() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Max", 2, "gato");
        tienda.venderMascota("Max");
        assertEquals(0, tienda.numeroMascotas);
    }

    @Test
    public void testVenderMascotaInexistente() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Alex", 9, "perro");
        tienda.venderMascota("Max");
        assertEquals(1, tienda.numeroMascotas);
    }

    @Test
    public void testMostrarInventarioConMascotas() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Alex", 9, "perro");
        tienda.agregarMascota("Max", 2, "gato");
        tienda.agregarMascota("Perry", 8, "ornitorrinco");
        assertDoesNotThrow(() -> tienda.mostrarInventario());
    }

    @Test
    public void testMostrarInventarioSinMascotas() {
        TiendaMascotas tienda = new TiendaMascotas();
        assertDoesNotThrow(() -> tienda.mostrarInventario());
    }

}
