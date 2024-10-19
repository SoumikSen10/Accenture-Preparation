package ONCAMPUS_DRIVE;

/*

Two players, A and B, are playing the game of Rock, Paper, and Scissors. Player A chooses a move represented by String 𝑀, and the move can be one of the following: Rock, Paper, or Scissors.

The rules are:

Rock beats Scissors.
Scissors beats Paper.
Paper beats Rock.
Your task is to find and return a string value representing the winning move for B.

Example 1:
Input:
Rock
Output:
Paper

Example 2:
Input:
Scissors
Output:
Rock

Example 3:
Input:
Paper
Output:
Scissors

*/

import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String M = in.next();
        String move=determine(M);
        System.out.println(move);
    }

    private static String determine(String s)
    {
        if(s.equals("Rock"))
            return "Paper";
        else if(s.equals("Scissor"))
            return "Rock";
        else
            return "Scissor";
    }
}
