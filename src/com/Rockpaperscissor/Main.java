package com.Rockpaperscissor;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        Scanner scanner = new Scanner(System.in);
        String playerMove;
        while (true) {
            System.out.println("Enter your move(r,p,s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p")
                    || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + " is not valid move");
        }
        System.out.println("Computerplayed:" + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("The game is a tie");
        } else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("you win");

            } else if (computerMove.equals("s")) {
                System.out.println("you lose");
            }

        } else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("you win");

            } else if (computerMove.equals("s")) {
                System.out.println("you lose");
            }
        } else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("you win");
            } else if (computerMove.equals("r")) {
                System.out.println("you lose");
            }

        }
        System.out.println("Play Again? (y/n)");
        String playAgain = scanner.nextLine();

        if (!playAgain.equals("y")) {

        }

        scanner.close();
    }
}


