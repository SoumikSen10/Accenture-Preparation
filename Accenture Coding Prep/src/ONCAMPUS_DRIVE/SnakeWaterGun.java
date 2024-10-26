package ONCAMPUS_DRIVE;

/*

You are given a string that contains the moves played by the players sequentially in a game called Snake Water Gun. The rules of the game are as follows:

Snake beats water
Water beats gun
Gun beats snake

The move played by player A and the move played by player B in the first round will be stored in the string as "snakewater". Similarly, in the second round, the moves will be stored in the string like "snakewatergunsnake".

There are a total of N rounds played in the game, and your task is to find and return an integer value representing how many rounds player A wins.

Note:
The given string is in lowercase.

Input Specification:
The input will be a string representing the moves played by both players for all rounds.

Output Specification:
Return the integer value representing the number of rounds that player A wins.

Example:

Input:
snakewatergunsnake

Output:
2

Explanation:
In the first round, Player A plays snake and Player B plays water. Since snake beats water, Player A wins the round.
In the second round, Player A plays gun and Player B plays snake. Since gun beats snake, Player A wins again.
Therefore, Player A wins 2 rounds in total.

*/

import java.util.Scanner;

public class SnakeWaterGun
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int roundsWon = calculate(s,s.length());
        System.out.println(roundsWon);

    }

    private static int calculate(String s,int n)
    {
        String a="";
        String b="";
        String word="";
        int flag=0;

        for(int i=0;i<n;i++)
        {
            word+=s.charAt(i);

            if(word.equals("snake"))
            {
                if(flag==0)
                    a+='s';
                else
                    b+='s';

                flag=~flag;
                word="";
            }
            else if(word.equals("water"))
            {
                if(flag==0)
                    a+='w';
                else
                    b+='w';

                flag=~flag;
                word="";
            }
            else if(word.equals("gun"))
            {
                if(flag==0)
                    a+='g';
                else
                    b+='g';

                flag=~flag;
                word="";
            }
        } // end of for

        int count=0;

        for(int i=0;i<a.length();i++)
        {
            if (a.charAt(i) == 's' && b.charAt(i) == 'w')
            {
             count++; // Snake beats water
            }
            else if (a.charAt(i) == 'w' && b.charAt(i) == 'g')
            {
              count++; // Water beats gun
            }
            else if (a.charAt(i) == 'g' && b.charAt(i) == 's')
            {
               count++; // Gun beats snake
            }
        }

        return count;

    }

}
