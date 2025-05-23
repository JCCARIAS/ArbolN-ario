package org.example;
import org.example.model.ArbolNario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArbolNarioTest {
    private ArbolNario arbol;

    @BeforeEach
    public void setUp() {
        arbol = new ArbolNario();
    }

    @Test
    public void testArbolVacio() {
        assertEquals(0, arbol.alturaMaxima());
        assertNull(arbol.getRaiz());
    }

    @Test
    public void testArbolConSoloRaiz() {
        arbol.agregarRaiz(1);
        assertEquals(1, arbol.alturaMaxima());
        assertNotNull(arbol.getRaiz());
        assertEquals(1, arbol.getRaiz().valor);
        assertTrue(arbol.getRaiz().hijos.isEmpty());
    }

    @Test
    public void testAlturaConMultiplesNiveles() {

        arbol.agregarRaiz(1);
        ArbolNario.Nodo raiz = arbol.getRaiz();

        arbol.agregarHijo(raiz, 2);
        arbol.agregarHijo(raiz, 3);
        arbol.agregarHijo(raiz, 4);

        ArbolNario.Nodo nodo2 = raiz.hijos.get(0);
        arbol.agregarHijo(nodo2, 5);
        arbol.agregarHijo(nodo2, 6);

        assertEquals(3, arbol.alturaMaxima());
    }

    @Test
    public void testAgregarHijoANodoNulo() {
        arbol.agregarRaiz(1);
        int hijosIniciales = arbol.getRaiz().hijos.size();


        arbol.agregarHijo(null, 2);

        assertEquals(hijosIniciales, arbol.getRaiz().hijos.size());
    }

    @Test
    public void testArbolDesbalanceado() {
        arbol.agregarRaiz(1);
        ArbolNario.Nodo nodo = arbol.getRaiz();
        arbol.agregarHijo(nodo, 2);
        nodo = nodo.hijos.get(0);
        arbol.agregarHijo(nodo, 3);

        assertEquals(3, arbol.alturaMaxima());
    }
}