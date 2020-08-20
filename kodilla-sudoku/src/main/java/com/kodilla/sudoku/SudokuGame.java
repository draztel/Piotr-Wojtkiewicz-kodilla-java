package com.kodilla.sudoku;


import java.util.Scanner;

public class SudokuGame {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        String playerDecision = "";
        SudokuBoard sudokuBoard = new SudokuBoard();
        boolean gameFinished = false;

        while(!gameFinished) {
            if(playerDecision.equals("")) {
                System.out.println(sudokuBoard);
            }
            System.out.println("Type FILL if you want to fill more elements with numbers\n" +
                    "Type SUDOKU to solve sudoku\n" +
                    "TYPE END to finish the game");
            playerDecision = scan.nextLine();

            if(playerDecision.equals("FILL")) {
                sudokuBoard.setSudokuValue();
            } else if(playerDecision.equals("SUDOKU")) {
                System.out.println("SECTION UNDER CONSTRUCTION");
            } else if(playerDecision.equals("END")) {
                gameFinished = true;
            }
        }
    }
}
