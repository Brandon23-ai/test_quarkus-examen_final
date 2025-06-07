/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraSerieTest;

import PrimeraSerie.FibonacciGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class FibonacciGeneratorTest {

    @Test
    public void testFibonacciClasico() {
        FibonacciGenerator gen = new FibonacciGenerator();
        List<Integer> esperado = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21);
        assertEquals(esperado, gen.fibonacci(new int[]{0, 1}, 9));
    }

    @Test
    public void testFibonacciPersonalizado() {
        FibonacciGenerator gen = new FibonacciGenerator();
        List<Integer> esperado = Arrays.asList(2, 3, 5, 8, 13);
        assertEquals(esperado, gen.fibonacci(new int[]{2, 3}, 5));
    }

    @Test
    public void testFibonacciCeroElementos() {
        FibonacciGenerator gen = new FibonacciGenerator();
        List<Integer> esperado = Arrays.asList();
        assertEquals(esperado, gen.fibonacci(new int[]{5, 7}, 0));
    }

    @Test
    public void testFibonacciUnElemento() {
        FibonacciGenerator gen = new FibonacciGenerator();
        List<Integer> esperado = Arrays.asList(5);
        assertEquals(esperado, gen.fibonacci(new int[]{5, 7}, 1));
    }

}
