package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuRow {

    public ArrayList<SudokuElement> sudokuElementsAsRow = new ArrayList<>();
    {
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
        sudokuElementsAsRow.add(new SudokuElement());
    }

    @Override
    public String toString() {
        return "" + sudokuElementsAsRow + "\n";
    }
}
