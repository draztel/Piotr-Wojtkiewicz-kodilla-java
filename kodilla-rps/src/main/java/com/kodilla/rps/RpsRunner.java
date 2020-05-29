package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String args[]) {
        char playerChoiceXOrN;
        int playerPoints = 0;
        int playerChoice = 0;
        int computerPoints = 0;
        int computerChoice;
        int roundNumber = 0;
        boolean isNumber;
        String playerNickname;
        boolean end = false;
        final String rock = "ROCK";
        final String paper = "PAPER";
        final String scissors = "SCISSORS";

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your nickname to start a game");
        playerNickname = scan.nextLine();

        while (!end) {

            if (roundNumber == 0) {
                System.out.println("Please enter number of points required for win");
                do {
                    if (scan.hasNextInt()) {
                        roundNumber = scan.nextInt();
                        isNumber = true;
                    } else {
                        System.out.println("Please enter a correct number of rounds");
                        isNumber = false;
                        scan.next();
                    }
                } while (!isNumber);
            }

            System.out.println("Please enter a number \n1 = ROCK\n2 = PAPER\n3 = SCISSORS");

            if (playerPoints == roundNumber && roundNumber != 0) {
                System.out.println(playerNickname + " wins this game with the score of = " + playerPoints + " : " + computerPoints);

                do {
                    System.out.println("Please press \nx = END GAME\nn = NEW GAME");
                    playerChoiceXOrN = scan.next().charAt(0);
                } while (playerChoiceXOrN != 'n' && playerChoiceXOrN != 'x');

                if (playerChoiceXOrN == 'x') {
                    System.out.println(playerNickname + " choosed to end game");
                    end = true;
                    break;
                } else if (playerChoiceXOrN == 'n') {
                    System.out.println(playerNickname + " choosed to start a new game");
                    System.out.println("Please enter number of points required for win");
                    do {
                        if (scan.hasNextInt()) {
                            roundNumber = scan.nextInt();
                            isNumber = true;
                        } else {
                            System.out.println("Please enter a correct number of rounds");
                            isNumber = false;
                            scan.next();
                        }
                    } while (!isNumber);
                    System.out.println("Please enter a number \n1 = ROCK\n2 = PAPER\n3 = SCISSORS");
                    playerPoints = 0;
                    computerPoints = 0;
                }
            } else if (computerPoints == roundNumber && roundNumber != 0) {
                System.out.println("Computer wins this game with the score of = " + computerPoints + " : " + playerPoints);

                do {
                    System.out.println("Please press \nx = END GAME\nn = NEW GAME");
                    playerChoiceXOrN = scan.next().charAt(0);
                } while (playerChoiceXOrN != 'n' && playerChoiceXOrN != 'x');

                if (playerChoiceXOrN == 'x') {
                    System.out.println(playerNickname + " choosed to end game");
                    end = true;
                    break;
                } else if (playerChoiceXOrN == 'n') {
                    System.out.println(playerNickname + " choosed to start a new game");
                    System.out.println("Please enter number of points required for win");
                    do {
                        if (scan.hasNextInt()) {
                            roundNumber = scan.nextInt();
                            isNumber = true;
                        } else {
                            System.out.println("Please enter a correct number of rounds");
                            isNumber = false;
                            scan.next();
                        }
                    } while (!isNumber);
                    System.out.println("Please enter a number \n1 = ROCK\n2 = PAPER\n3 = SCISSORS");
                    playerPoints = 0;
                    computerPoints = 0;
                }
            }

            do {
                if (scan.hasNextInt()) {
                    playerChoice = scan.nextInt();
                    isNumber = true;
                } else {
                    System.out.println("Please enter a correct number of player choice!");
                    isNumber = false;
                    scan.next();
                }
            } while (!isNumber);

            computerChoice = (int) (Math.random() * (3 - 1 + 1) + 1);

            if (playerChoice == computerChoice) {
                System.out.println("its draw, none of u gets points. Try again!");
            } else if (playerChoice > 3) {
                System.out.println("Please enter a correct number of player choice!");
            } else if (playerChoice == 1) {
                if (computerChoice == 2) {
                    System.out.println(playerNickname + " = " + rock);
                    System.out.println("Computer = " + paper);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                } else if (computerChoice == 3) {
                    System.out.println(playerNickname + " = " + rock);
                    System.out.println("Computer = " + scissors);
                    System.out.println(playerNickname + " wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                }
            } else if (playerChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println(playerNickname + " = " + paper);
                    System.out.println("Computer = " + rock);
                    System.out.println(playerNickname + " wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                } else if (computerChoice == 3) {
                    System.out.println(playerNickname + " = " + paper);
                    System.out.println("Computer = " + scissors);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                }
            } else if (playerChoice == 3) {
                if (computerChoice == 1) {
                    System.out.println(playerNickname + " = " + scissors);
                    System.out.println("Computer = " + rock);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                } else if (computerChoice == 2) {
                    System.out.println(playerNickname + " = " + scissors);
                    System.out.println("Computer = " + paper);
                    System.out.println(playerNickname + " wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println(playerNickname + " points = " + playerPoints);
                }
            }
        }
    }
}

