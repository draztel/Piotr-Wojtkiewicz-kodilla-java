package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[]args) {
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = true;
        }
        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);
    }
}
