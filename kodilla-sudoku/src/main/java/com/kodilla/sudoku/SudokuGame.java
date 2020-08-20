package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[]args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = true;
        }

        sudokuBoard.setSudokuValue();
        System.out.println(sudokuBoard);

    }
}
