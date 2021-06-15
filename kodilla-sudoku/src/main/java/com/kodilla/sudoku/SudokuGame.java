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
            if(playerDecision.equals("")) {
                System.out.println(sudokuBoard);
            }
            System.out.println(sudokuBoard + "\nType FILL if you want to fill more elements with numbers\n" +
                    "Type SUDOKU to solve sudoku\n" +
                    "Type END to finish the game");
            playerDecision = scan.nextLine();

            if(playerDecision.equals("FILL")) {
                processor.setSudokuValue(sudokuBoard);
            } else if(playerDecision.equals("SUDOKU")) {
                try{
                    System.out.println(sudokuBoard.getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(2).getNumbers().size());
                    processor.eliminateNumbers(sudokuBoard);
                    processor.eliminateNumbersInGrid(sudokuBoard);
                    System.out.println(sudokuBoard.getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(2).getNumbers().size());
                    processor.putNumber(sudokuBoard);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("IOOBE");
                }
            } else if(playerDecision.equals("TESTBOARD")) {
                processor.testBoard(sudokuBoard);
                System.out.println(sudokuBoard);
            }
            else if(playerDecision.equals("END")) {
                gameFinished = true;
            }
        }
    }
}
