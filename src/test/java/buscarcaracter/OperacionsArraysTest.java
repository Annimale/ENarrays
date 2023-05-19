/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package buscarcaracter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skril
 */
public class OperacionsArraysTest {

    public OperacionsArraysTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Iniciando test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Test finalizado");
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of busca method, of class OperacionsArrays.
     */
    /*@Test
    public void testBuscaArrayVacio() {
        System.out.println("testBuscaArrayVacio");
        char c = 'A';
        char[] v = {};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);

    }

    @Test
    public void testBuscaHappyPathtTRUE() {
        System.out.println("testBuscaHappyPathTRUE");
        char c = 'K';
        char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = true;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);

    }

    @Test
    public void testBuscaHappyPathtFALSE() {
        System.out.println("testBuscaHappyPathFALSE");
        char c = 'X';
        char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);

    }

    public void testBuscaCaracterMinus() {
        System.out.println("testBuscaHappyPathTRUE");
        char c = 'k';
        char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
        OperacionsArrays instance = new OperacionsArrays();
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        assertEquals(expResult, result);

    }

    @Test
    public void testBuscaHappyPathFALSE() {
        System.out.println("testBuscaHappyPathFALSE");
        
        char c = 'X';
        char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
        
        OperacionsArrays instance = new OperacionsArrays();
        
        boolean expResult = false;
        boolean result = instance.busca(c, v);
        
        assertEquals(expResult, result);
    }*/
    @Test
public void testBuscaCaracterExistente() {
    System.out.println("testBuscaCaracterExistente");
    
    char c = 'C';
    char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
    
    OperacionsArrays instance = new OperacionsArrays();
    
    boolean expResult = true;
    boolean result = instance.busca(c, v);
    
    assertEquals(expResult, result);
}

@Test
public void testBuscaCaracterNoExistente() {
    System.out.println("testBuscaCaracterNoExistente");
    
    char c = 'Z';
    char[] v = {'A', 'B', 'C', 'D', 'E', 'F', 'K'};
    
    OperacionsArrays instance = new OperacionsArrays();
    
    boolean expResult = false;
    boolean result = instance.busca(c, v);
    
    assertEquals(expResult, result);
}

@Test
public void testBuscaArrayVacio() {
    System.out.println("testBuscaArrayVacio");
    
    char c = 'X';
    char[] v = {};
    
    OperacionsArrays instance = new OperacionsArrays();
    
    boolean expResult = false;
    boolean result = instance.busca(c, v);
    
    assertEquals(expResult, result);
}

}
