/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraSerie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author btmor
 */
public class FibonacciGenerator {

    public List<Integer> fibonacci(int[] inicio, int n) {
        List<Integer> resultado = new ArrayList<>();

        if (n == 0) {
            return resultado;
        }

        // Agrega los primeros elementos según n
        if (n >= 1) {
            resultado.add(inicio[0]);
        }
        if (n >= 2) {
            resultado.add(inicio[1]);
        }

        // Genera la secuencia
        for (int i = 2; i < n; i++) {
            int siguiente = resultado.get(i - 1) + resultado.get(i - 2);
            resultado.add(siguiente);
        }

        return resultado;
    }

}
