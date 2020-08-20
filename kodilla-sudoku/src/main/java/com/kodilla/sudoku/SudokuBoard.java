package com.kodilla.sudoku;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.Scanner;

public class SudokuBoard {
    Scanner scan = new Scanner(System.in);
    private static final int MAX_SIZE = 9;
    private int row;
    private int column;
    private int value;

    private ArrayList<SudokuRow> sudokuRowsAsBoard = new ArrayList<>();
    {
        for(int i = 0; i < 9; i++) {
            sudokuRowsAsBoard.add(i, new SudokuRow());
        }
    }

    public ArrayList<SudokuRow> getSudokuRowsAsBoard() {
        return sudokuRowsAsBoard;
    }

    public int getValue() {
        return value;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean setSudokuValue() {
        System.out.println("row");
        row = scan.nextInt();
        System.out.println("column");
        column = scan.nextInt();
        System.out.println("value");
        value = scan.nextInt();
        if(row == 0 | row > 9 | column == 0 | column > 9 | value == 0 | value > 9) {
            throw new ValueException("Error: row was: " + getRow() + " has to be 1 - 9\n" +
                    "column was: " + getColumn() + " has to be 1 - 9\n" +
                    "value was: " + getValue() + " has to be 1-9");
        } else {
            row -= 1;
            column -= 1;
            getSudokuRowsAsBoard().get(row).getSudokuElementsAsRow().get(column).setValue(value);
            System.out.println(toString());
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder boardBuilder = new StringBuilder("");
        boardBuilder.append("___________________\n");
        boardBuilder.append("|");
        for(int j = 0; j < MAX_SIZE; j++) {
                for (int i = 0; i < MAX_SIZE; i++) {
                    boardBuilder.append(getSudokuRowsAsBoard().get(j).getSudokuElementsAsRow().get(i).getValue());
                    if (i == 2 | i == 5) {
                        boardBuilder.append("|");
                    } else if (i == 8) {
                        boardBuilder.append("|\n|");
                    } else if(i != 2 && i != 5 && i != 8) {
                        boardBuilder.append(" ");
                    }
                }
        }
        boardBuilder.insert(79, "\n-------------------");
        boardBuilder.insert(159, "\n-------------------");
        boardBuilder.append("-------------------");
        boardBuilder.deleteCharAt(240);
        return boardBuilder.toString();
    }
}
