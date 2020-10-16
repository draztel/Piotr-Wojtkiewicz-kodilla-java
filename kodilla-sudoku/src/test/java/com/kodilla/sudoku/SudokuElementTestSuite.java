package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuElementTestSuite {
    SudokuElement sudokuElement = new SudokuElement();

    @Test
    public void getNumbersTest() {
        int firstNumber = sudokuElement.getNumbers().get(0);
        int lastNumber = sudokuElement.getNumbers().get(8);
        int numbersSize = sudokuElement.getNumbers().size();

        Assert.assertEquals(1, firstNumber);
        Assert.assertEquals(9,lastNumber);
        Assert.assertEquals(9, numbersSize);
    }
}
