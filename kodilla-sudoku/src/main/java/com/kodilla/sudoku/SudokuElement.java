package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;

    ArrayList<Integer> numbers = new ArrayList<>();
    {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value + "";
    }
}
