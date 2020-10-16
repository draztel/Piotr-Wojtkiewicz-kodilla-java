package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class SudokuRow {

    public ArrayList<SudokuElement> sudokuElementsAsRow = new ArrayList<>();
    {
        for(int i = 0; i < 9; i++) {
            sudokuElementsAsRow.add(i, new SudokuElement());
        }
    }

    public ArrayList<SudokuElement> getSudokuElementsAsRow() {
        return sudokuElementsAsRow;
    }
}
