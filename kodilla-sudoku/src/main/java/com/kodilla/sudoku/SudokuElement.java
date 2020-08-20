package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuElement {
    private int value = 0;
    public static int EMPTY = -1;

    ArrayList<Integer> numbers = new ArrayList<>();
    {
        for(int i = 1; i < 10; i++) {
            numbers.add(i);
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

}
