package ONCAMPUS_DRIVE;

/*

There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.

The rules of the game are as follows:

Start at the 1st friend.
Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
The last friend you counted leaves the circle and loses the game.
If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
Else, the last friend in the circle wins the game.
Given the number of friends, n, and an integer k, return the winner of the game.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class CircularGame
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        //int ans = findWinner(n,k);
        //System.out.println(ans);

        int res = iterativePractice(n,k);
        System.out.println(res);

    }

    private static int iterativePractice(int n,int k)
    {
        int res = 0;
        for(int i=1;i<=n;i++)
        {
            res = (res+k)%i;
        }

        return res+1;
    }

    private static int findWinPrac(int n,int k)
    {
        if(n==1)
            return 0;

         int index = findWinPrac(n-1,k);
         index = (index+k)%n;
        return index;
    }

    private static int practice(int n,int k)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++)
            list.add(i);

        int i=0;
        while(list.size()>1)
        {
            int index = (i+k-1) % (list.size());
            list.remove(index);
            i=index;
        }

        return list.get(0);

    }

    private static int findWinner(int n,int k)
    {
        int winner = 1;

        for(int i=2;i<=n;i++)
        {
            winner = (winner + (k-1))%i + 1;
        }

        return winner;

    }


}
