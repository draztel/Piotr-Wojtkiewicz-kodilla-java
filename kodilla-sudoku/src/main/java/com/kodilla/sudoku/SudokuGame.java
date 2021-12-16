package com.kodilla.sudoku;


import java.util.Scanner;

public class SudokuGame {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String playerDecision = "";
        SudokuSystem processor = new SudokuSystem();
        SudokuBoard sudokuBoard = processor.createBoard();
        boolean gameFinished = false;

        while(!gameFinished) {
            System.out.println(sudokuBoard + "\nType FILL if you want to fill more elements with numbers\n" +
                    "Type SUDOKU to solve sudoku\n" +
                    "Type ENDGAME to finish the game");
            playerDecision = scan.nextLine();

            if(playerDecision.equals("FILL")) {
                processor.setSudokuValue(sudokuBoard);
            } else if(playerDecision.equals("SUDOKU")) {
                processor.eliminateNumbersInLine(sudokuBoard);
                processor.eliminateNumbersInGrid(sudokuBoard);
                try{
                    processor.putNumber(sudokuBoard);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("IOOBE");
                }
            } else if(playerDecision.equals("TESTBOARD")) {
                processor.testBoard(sudokuBoard);
            }
            else if(playerDecision.equals("ENDGAME")) {
                gameFinished = true;
            }
        }
    }
}
