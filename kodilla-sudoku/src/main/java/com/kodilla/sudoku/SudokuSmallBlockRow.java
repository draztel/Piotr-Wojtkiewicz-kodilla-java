package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuSmallBlockRow {
    public ArrayList<SudokuElement> sudokuElementsAsSmallBlock = new ArrayList<>();
    {
        sudokuElementsAsSmallBlock.add(new SudokuElement());
        sudokuElementsAsSmallBlock.add(new SudokuElement());
        sudokuElementsAsSmallBlock.add(new SudokuElement());
    }

    @Override
    public String toString() {
        return "|" + sudokuElementsAsSmallBlock + "|";
    }
}
