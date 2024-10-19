package ONCAMPUS_DRIVE;

/*

You are playing a game of "Toss and Score" in the Hillwood City Mall with your friends. The game consists of the following rules:

Toss an unbiased coin multiple times.
For each heads (H), you get 2 points, and for each tails (T), you lose 1 point.
The game ends as soon as you get 3 heads in a row, or you toss the coin throughout the length of string S.
You are given a string S consisting of letters 'H' (for heads) and 'T' (for tails), representing the sequence of the results of each toss. Your task is to find and return the final score you get once the game ends.

Note:
The final score can be negative as well.

Input:
A string S consisting of characters 'H' (heads) and 'T' (tails).

Output:
An integer representing the final score of the game.

Example:

Input:
S = "HTTHHHTT"

Output:
6

Explanation: For each 'H', you gain 2 points, and for each 'T', you lose 1 point. The game ends when there are 3 consecutive 'H's, and the score at that point is 6.

*/

import java.util.Scanner;

public class TossAndScore
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int score=findScore(s);
        System.out.println(score);
    }

    private static int findScore(String s)
    {
        if(s.length()==0)
            return 0;

        int count=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='H')
            {
                ans+=2;
                count++;
            }
            else if(s.charAt(i)=='T')
            {
                count=0;
                ans -= 1;
            }

            if(count==3) {
                break;
            }

        }
        return ans;
    }
}
