/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraSerie;

import java.util.HashSet;
public class SudokuValidator {

    public boolean isValidSudoku(char[][] board) {
        // Validar filas
        for (int i = 0; i < 9; i++) {
            HashSet<Character> filaSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char celda = board[i][j];
                if (celda != '.') {
                    if (filaSet.contains(celda)) {
                        return false;
                    }
                    filaSet.add(celda);
                }
            }
        }
    
    
    // Validar columnas
        for (int j = 0; j < 9; j++) {
            HashSet<Character> columnaSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char celda = board[i][j];
                if (celda != '.') {
                    if (columnaSet.contains(celda)) return false;
                    columnaSet.add(celda);
                }
            }
        }
        
        // Validar subcuadros 3x3
        for (int fila = 0; fila < 9; fila += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> subcuadroSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char celda = board[fila + i][col + j];
                        if (celda != '.') {
                            if (subcuadroSet.contains(celda)) return false;
                            subcuadroSet.add(celda);
                        }
                    }
                }
            }
        }
        
        // Si pasa todas las validaciones
        return true;
    }
    
}
