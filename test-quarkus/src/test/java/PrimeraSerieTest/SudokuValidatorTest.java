/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraSerieTest;

import PrimeraSerie.SudokuValidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SudokuValidatorTest {
    @Test
    public void testTableroValido() {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuValidator validator = new SudokuValidator();
        boolean esValido = validator.isValidSudoku(board);

        assertTrue(esValido, "El tablero debería ser válido.");
    }
    
    @Test
    public void testTableroInvalidoPorFila() {
        char[][] board = {
            {'5','3','.','.','7','.','.','3','.'}, // Repetido '3'
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuValidator validator = new SudokuValidator();
        boolean esValido = validator.isValidSudoku(board);

        assertFalse(esValido, "El tablero no debería ser válido (duplicado en fila).");
    }

    
}
