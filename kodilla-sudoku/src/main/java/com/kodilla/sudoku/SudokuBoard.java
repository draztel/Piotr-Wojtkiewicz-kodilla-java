package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {
    ArrayList<SudokuRow> sudokuRowsAsBoard = new ArrayList();
    {
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
        sudokuRowsAsBoard.add(new SudokuRow());
    }

    @Override
    public String toString() {
        return " " + sudokuRowsAsBoard + "";
    }
}
