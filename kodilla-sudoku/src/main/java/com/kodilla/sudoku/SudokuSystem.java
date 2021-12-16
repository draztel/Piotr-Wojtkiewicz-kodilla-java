package com.kodilla.sudoku;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SudokuSystem {
    private Scanner scan = new Scanner(System.in);
    private static final int MAX_SIZE = 9;
    private int row;
    private int column;
    private int value;
    private int count = 0;


    public boolean setSudokuValue(SudokuBoard board) {
        boolean fillFinished = false;
        while (!fillFinished) {
            System.out.println("Type numbers after space: row column value\n" +
                    "Type 999 if you are done");
            row = scan.nextInt();
            column = scan.nextInt();
            value = scan.nextInt();
            if (row == 0 | row > MAX_SIZE | column == 0 | column > MAX_SIZE | value == 0 | value > MAX_SIZE | board.getSudokuRowsAsBoard().get(row - 1).getSudokuElementsAsRow().get(column - 1).getValue() != 0) {
                throw new ValueException("Row was: " + getRow() + " has to be 1 - 9\n" +
                        "Column was: " + getColumn() + " has to be 1 - 9\n" +
                        "Entered value was: " + getValue() + " has to be 1-9\n" +
                        "Existed value was: " + board.getSudokuRowsAsBoard().get(row).getSudokuElementsAsRow().get(column).getValue() + " has to be 0");
            } else if (row == 999) {
                fillFinished = true;
            } else {
                row -= 1;
                column -= 1;
                board.getSudokuRowsAsBoard().get(row).getSudokuElementsAsRow().get(column).setValue(value);
                System.out.println("Sudoku value has been filled");
                System.out.println(board);
            }
        }
        return true;
    }

    public boolean putNumber(SudokuBoard board) {
       int number;
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                    if(board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getNumbers().size() == 1 &&
                            board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getValue() == 0) {
                        int temporaryValue = board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getNumbers().get(0);
                        board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).setValue(temporaryValue);
                        eliminateNumbersInLine(board);
                        eliminateNumbersInGrid(board);
                        count++;
                    } else if (i == 8 && j == 8 && count > 0) {
                        System.out.println("ERROR: TOO MUCH NUMBERS IN LIST TO PUT NUMBER");
                        i = 0;
                        j = 0;
                        count = 0;
                        continue;
                    } else if (i == 8 && j == 8 && count == 0) {
                        for(int k = 0; k < MAX_SIZE; k++) {
                            for(int l = 0; l < MAX_SIZE; l++) {
                                if(board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().size() > 1 &&
                                        board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getValue() == 0) {
                                    number = board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().get(0);
                                    board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(number));
                                    try {
                                        board.getBoardCopies().add(board.deepCopy());
                                    } catch(CloneNotSupportedException e) {
                                        System.out.println("ERROR: COULD NOT ADD BOARD COPY TO LIST OF COPIES");
                                    }
                                    board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).setValue(number);
                                    eliminateNumbersInGrid(board);
                                    eliminateNumbersInLine(board);
                                    i = 0;
                                    j = 0;
                                    k = 0;
                                    l = 0;
                                    count = 0;
                                    continue;
                                } else if (board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().size() == 0 &&
                                        board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getValue() == 0 &&
                                        board.getBoardCopies().size() > 0) {
                                    board = board.getBoardCopies().get(0);
                                    System.out.println("0 = \n" + board.getBoardCopies().get(0));
                                    System.out.println("10 = \n" + board);
                                    board.getBoardCopies().get(0).getSudokuRowsAsBoard().get(0).getSudokuElementsAsRow().get(0).setValue(9);
                                    System.out.println("0 = \n" + board.getBoardCopies().get(0));
                                    System.out.println("10 = \n" + board);
                                    board.getBoardCopies().removeAll(board.getBoardCopies());
                                    i = 0;
                                    j = 0;
                                    k = 0;
                                    l = 0;
                                    count = 0;
                                    continue;
                                }
                            }
                        }
                    }
            }
        }
        return true;
    }

    public boolean eliminateNumbersInLine(SudokuBoard board) {
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                int temporaryValue = board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getValue();
                for(int k = 0; k < MAX_SIZE; k++) {
                    if(temporaryValue > 0) {
                        board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(k).getNumbers().remove(new Integer(temporaryValue));
                        board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(j).getNumbers().remove(new Integer(temporaryValue));
                    }
                }
            }
        }
        return true;
    }

    public boolean eliminateNumbersInGrid(SudokuBoard board) {
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                int temporaryValue = board.getSudokuRowsAsBoard().get(i).getSudokuElementsAsRow().get(j).getValue();
                if(i < 3) {
                    if(j < 3) {
                        for(int k = 0; k < 3; k++) {
                            for(int l = 0; l < 3; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    } else if(j > 2 && j < 6) {
                        for(int k = 0; k < 3; k++) {
                            for(int l = 3; l < 6; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }  else if(j > 5 && j < 9) {
                        for(int k = 0; k < 3; k++) {
                            for(int l = 6; l < 9; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }
                } else if(i > 2 && i < 6) {
                    if(j < 3) {
                        for(int k = 3; k < 6; k++) {
                            for(int l = 0; l < 3; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    } else if(j > 2 && j < 6) {
                        for(int k = 3; k < 6; k++) {
                            for(int l = 3; l < 6; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }  else if(j > 5 && j < 9) {
                        for(int k = 3; k < 6; k++) {
                            for(int l = 6; l < 9; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }
                } else if(i > 5 && i < 9) {
                    if(j < 3) {
                        for(int k = 6; k < 9; k++) {
                            for(int l = 0; l < 3; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    } else if(j > 2 && j < 6) {
                        for(int k = 6; k < 9; k++) {
                            for(int l = 3; l < 6; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }  else if(j > 5 && j < 9) {
                        for(int k = 6; k < 9; k++) {
                            for(int l = 6; l < 9; l++) {
                                board.getSudokuRowsAsBoard().get(k).getSudokuElementsAsRow().get(l).getNumbers().remove(new Integer(temporaryValue));
                            }
                        }
                    }
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

    public int getCount() {
        return count;
    }
}
