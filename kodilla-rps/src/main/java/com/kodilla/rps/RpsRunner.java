package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    int playerPoints = 0;
    int playerChoice;
    int computerPoints = 0;
    int computerChoice;
    boolean end = false;
    final String rock = "ROCK";
    final String paper = "PAPER";
    final String scissors = "SCISSORS";

    Scanner scan = new Scanner(System.in);

    public void rpsgame() throws Exception {
        System.out.println("Please type your nickname to start a game");
        String playerNickname = scan.nextLine();
        while (!end) {
            System.out.println("Please enter a number \n1 = ROCK\n2 = PAPER\n3 = SCISSORS\n0 = END GAME");
            if (playerPoints == 3) {
                System.out.println(playerNickname + " wins this game with the score of = " + playerPoints + " : " + computerPoints);
                end = true;
            } else if (computerPoints == 3) {
                System.out.println("Computer wins this game with the score of = " + computerPoints + " : " + playerPoints);
                end = true;
            }
            playerChoice = scan.nextInt();
            computerChoice = (int) (Math.random() * (3 - 1 + 1) + 1);

            if (playerChoice == computerChoice) {
                System.out.println("its draw, none of u gets points. Try again!");
            } else if (playerChoice > 3) {
                System.out.println("Please enter a correct number!");
            } else if (playerChoice == 1) {
                if (computerChoice == 2) {
                    System.out.println(playerNickname + " = " + rock);
                    System.out.println("Computer = " + paper);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                } else if (computerChoice == 3) {
                    System.out.println(playerNickname + " = " + rock);
                    System.out.println("Computer = " + scissors);
                    System.out.println("Player wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                }
            } else if (playerChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println(playerNickname + " = " + paper);
                    System.out.println("Computer = " + rock);
                    System.out.println("Player wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                } else if (computerChoice == 3) {
                    System.out.println(playerNickname + " = " + paper);
                    System.out.println("Computer = " + scissors);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                }
            } else if (playerChoice == 3) {
                if (computerChoice == 1) {
                    System.out.println(playerNickname + " = " + scissors);
                    System.out.println("Computer = " + rock);
                    System.out.println("Computer wins this round");
                    computerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                } else if (computerChoice == 2) {
                    System.out.println(playerNickname + " = " + scissors);
                    System.out.println("Computer = " + paper);
                    System.out.println("Player wins this round");
                    playerPoints++;
                    System.out.println("Computer points = " + computerPoints);
                    System.out.println("Player points = " + playerPoints);
                }
            } else if (playerChoice == 0) {
                System.out.println("You choosed to end game");
                end = true;
            }
        }
    }

    public static void main(String args[]) {
        RpsRunner rpsRunner = new RpsRunner();
        try {
            rpsRunner.rpsgame();
        } catch (Exception e) {
            System.out.println("Please type a correct number");
        } finally {
            System.out.println("Try again!");
        }
    }
}