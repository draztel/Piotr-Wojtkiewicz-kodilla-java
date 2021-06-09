package com.kodilla.sudoku;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuSystem {
    private Scanner scan = new Scanner(System.in);
    private static final int MAX_SIZE = 9;
    private int row;
    private int column;
    private int value;


    public boolean setSudokuValue(SudokuBoard board) {
        System.out.println("row");
        row = scan.nextInt();
        System.out.println("column");
        column = scan.nextInt();
        System.out.println("value");
        value = scan.nextInt();
        if(row == 0 | row > MAX_SIZE | column == 0 | column > MAX_SIZE | value == 0 | value > MAX_SIZE) {
            throw new ValueException("Error: row was: " + getRow() + " has to be 1 - 9\n" +
                    "column was: " + getColumn() + " has to be 1 - 9\n" +
                    "value was: " + getValue() + " has to be 1-9");
        } else {
            row -= 1;
            column -= 1;
            board.getSudokuRowsAsBoard().get(row).getSudokuElementsAsRow().get(column).setValue(value);
            System.out.println("DEVELOPER: sudoku value has been filled");
            System.out.println(board.toString());
            return true;
        }
    }

    public boolean putNumber(SudokuBoard board) {
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                    if(board.getSudokuRowsAsBoard().get(j).getSudokuElementsAsRow().get(i).getNumbers().size() == 1) {
                        int temporaryValue = board.getSudokuRowsAsBoard().get(j).getSudokuElementsAsRow().get(i).getNumbers().get(0);
                        board.getSudokuRowsAsBoard().get(j).getSudokuElementsAsRow().get(i).setValue(temporaryValue);
                    } else {
                        System.out.println("TOO MUCH NUMBERS IN LIST");
                    }
            }
        }
        return true;
    }

    public boolean eliminateNumbers(SudokuBoard board) {
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                int temporaryValue = board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getValue();
                for(int k = 0; k < MAX_SIZE; k++) {
                    board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(k).getNumbers().remove(temporaryValue);
                    board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(j).getNumbers().remove(temporaryValue);
                }
            }
        }
        return true;
    }

    public SudokuBoard createBoard() {
        SudokuBoard board = new SudokuBoard();
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                board.getSudokuRowsAsBoard().add(new SudokuRow(i));
                board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().add(new SudokuElement());
            }
        }
        return board;
    }

    public SudokuBoard testBoard(SudokuBoard board) {

        board.getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(0).setValue(5);
        board.getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(1).setValue(3);
        board.getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(4).setValue(7);

        board.getSudokuRowsAsBoard().get(1).getSudokuElementsAsRow().get(0).setValue(6);
        board.getSudokuRowsAsBoard().get(1).getSudokuElementsAsRow().get(3).setValue(1);
        board.getSudokuRowsAsBoard().get(1).getSudokuElementsAsRow().get(4).setValue(9);
        board.getSudokuRowsAsBoard().get(1).getSudokuElementsAsRow().get(5).setValue(5);

        board.getSudokuRowsAsBoard().get(2).getSudokuElementsAsRow().get(1).setValue(9);
        board.getSudokuRowsAsBoard().get(2).getSudokuElementsAsRow().get(2).setValue(8);
        board.getSudokuRowsAsBoard().get(2).getSudokuElementsAsRow().get(7).setValue(6);

        board.getSudokuRowsAsBoard().get(3).getSudokuElementsAsRow().get(0).setValue(8);
        board.getSudokuRowsAsBoard().get(3).getSudokuElementsAsRow().get(4).setValue(6);
        board.getSudokuRowsAsBoard().get(3).getSudokuElementsAsRow().get(8).setValue(3);

        board.getSudokuRowsAsBoard().get(4).getSudokuElementsAsRow().get(0).setValue(4);
        board.getSudokuRowsAsBoard().get(4).getSudokuElementsAsRow().get(3).setValue(8);
        board.getSudokuRowsAsBoard().get(4).getSudokuElementsAsRow().get(5).setValue(3);
        board.getSudokuRowsAsBoard().get(4).getSudokuElementsAsRow().get(8).setValue(1);

        board.getSudokuRowsAsBoard().get(5).getSudokuElementsAsRow().get(0).setValue(7);
        board.getSudokuRowsAsBoard().get(5).getSudokuElementsAsRow().get(4).setValue(2);
        board.getSudokuRowsAsBoard().get(5).getSudokuElementsAsRow().get(8).setValue(6);

        board.getSudokuRowsAsBoard().get(6).getSudokuElementsAsRow().get(1).setValue(6);
        board.getSudokuRowsAsBoard().get(6).getSudokuElementsAsRow().get(6).setValue(2);
        board.getSudokuRowsAsBoard().get(6).getSudokuElementsAsRow().get(7).setValue(8);

        board.getSudokuRowsAsBoard().get(7).getSudokuElementsAsRow().get(3).setValue(4);
        board.getSudokuRowsAsBoard().get(7).getSudokuElementsAsRow().get(4).setValue(1);
        board.getSudokuRowsAsBoard().get(7).getSudokuElementsAsRow().get(5).setValue(9);
        board.getSudokuRowsAsBoard().get(7).getSudokuElementsAsRow().get(8).setValue(5);

        board.getSudokuRowsAsBoard().get(8).getSudokuElementsAsRow().get(4).setValue(8);
        board.getSudokuRowsAsBoard().get(8).getSudokuElementsAsRow().get(7).setValue(7);
        board.getSudokuRowsAsBoard().get(8).getSudokuElementsAsRow().get(8).setValue(9);

        return board;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }
}
