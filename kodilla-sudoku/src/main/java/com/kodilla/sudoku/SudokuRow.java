package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuRow {
    private int row;
    public ArrayList<SudokuElement> sudokuElementsAsRow = new ArrayList<>();

    public SudokuRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public ArrayList<SudokuElement> getSudokuElementsAsRow() {
        return sudokuElementsAsRow;
    }
}
