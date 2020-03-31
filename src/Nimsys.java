/**
 * COMP90041 Programming and Software Developing Assignment 1:
 * Nim is a two-player game that the first one who remove the last one stone will lose
 *
 * @author Yuan
 * Name: Yuan Hung Lin
 * StudentID: 1119147
 * Username: yuanhungl
 */

import java.util.Scanner;

public class Nimsys {

    public static String playGame = "Y";

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // welcome sentence.
        System.out.println("Welcome to Nim\n");

        // enter player1's name, and create variable NimPlayer
        System.out.println("Please enter Player 1's name:");
        NimPlayer player1 = new NimPlayer();
        player1.name = scan.next();

        // enter player2's name, and create variable NimPlayer
        System.out.println("\nPlease enter Player 2's name:");
        NimPlayer player2 = new NimPlayer();
        player2.name = scan.next();
        System.out.println();

        // create a loop for playing game again or not
        while (playGame.equals("Y")) {

            // create upper bound of stone removal
            System.out.println("Please enter upper bound of stone removal:");
            int upBond = scan.nextInt();

            // create total stones
            System.out.println("\nPlease enter initial number of stones:");
            int totalStones = scan.nextInt();

            // create turns variable in order to play game in turns
            int turns = 0;

            // recursively play game in turns
            while (totalStones != 0) {
                checkStones(totalStones);       // print the rest of stones
                turns++;
                if ((turns % 2) != 0) {         // if turns is odd, it's player1's turn
                    int out1 = player1.removeStone();
                    totalStones -= out1;
                } else {                        // if turns is even, it's player2's turn
                    int out2 = player2.removeStone();
                    totalStones -= out2;
                }
            }
            System.out.println("\nGame Over");

            // print the winner
            if ((turns % 2) != 0) {
                String winner2 = player2.name + " wins!\n";
                System.out.println(winner2);
            } else {
                String winner1 = player1.name + " wins!\n";
                System.out.println(winner1);
            }

            System.out.print("Do you want to play again (Y/N):\n");
            playGame = scan.next();
        }
    }

    /**
     * func to print the total stones
     *
     * @param totalStones
     */
    public static void checkStones(int totalStones) {
        System.out.printf("\n%d stones left:", totalStones);
        for (int i = 0; i < totalStones; i++) {
            System.out.print(" *");
        }
    }

}
