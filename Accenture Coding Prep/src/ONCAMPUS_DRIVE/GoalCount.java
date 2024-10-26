package ONCAMPUS_DRIVE;

/*

A football match is ongoing, and every time a team scores, their name is recorded on a scoreboard. The names are either "TeamA" or "TeamB," depending on which team scored the goal. Once the match ends, your task is to determine which team scored more goals.

Input:
A string containing the sequence of goals recorded, with each goal labeled as either "TeamA" or "TeamB."

Output:
The name of the team that scored more goals.

Example:

Input:
"TeamA TeamB TeamA TeamA TeamB TeamB TeamA"

Output:
"TeamA"

*/

import java.util.Scanner;

public class GoalCount
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n=s.length();
        int countA=0,countB=0;
        String word="";
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
             word+=ch;
            else {
                if (word.equals("TeamA")) {
                    countA++;

                } else if (word.equals("TeamB")) {
                    countB++;

                }
                word = "";
            }
        }

        if (word.equals("TeamA")) {
            countA++;

        } else if (word.equals("TeamB")) {
            countB++;
        }

        if(countA>countB)
            System.out.println("TeamA");
        else
            System.out.println("TeamB");

    }
}
