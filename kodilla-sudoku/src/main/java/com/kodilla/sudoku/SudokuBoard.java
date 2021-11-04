package com.kodilla.sudoku;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.*;

public class SudokuBoard extends Prototype {
    private Scanner scan = new Scanner(System.in);
    private static final int MAX_SIZE = 9;
    public ArrayList<SudokuRow> sudokuRowsAsBoard = new ArrayList<>();
    public ArrayList<SudokuBoard> boardCopies = new ArrayList<>();
    public ArrayList<SudokuRow> getSudokuRowsAsBoard() {
        return sudokuRowsAsBoard;
    }
    public ArrayList<SudokuBoard> getBoardCopies() {
        return boardCopies;
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

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.sudokuRowsAsBoard = new ArrayList<>();

        for(SudokuRow sudokuRow: sudokuRowsAsBoard) {
            SudokuRow clonedSudokuRowsAsBoard = new SudokuRow(sudokuRow.getRow());

            for(SudokuElement sudokuElement: sudokuRow.getSudokuElementsAsRow()) {
                clonedSudokuRowsAsBoard.getSudokuElementsAsRow().add(sudokuElement);
            }
            clonedBoard.getSudokuRowsAsBoard().add(clonedSudokuRowsAsBoard);
        }
        return clonedBoard;
    }
}
