package ONCAMPUS_DRIVE;

/*

Count Minimum Right Flips to Set All Values in an Array

N light bulbs are connected by a wire. Each bulb has a switch associated with it. However, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.

Note:
0 represents the bulb is off.
1 represents the bulb is on.

Example:

Input:
A[] = [0, 1, 0, 1]

Output:
4

*/

import java.util.Scanner;

public class MinRightFlips
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=in.nextInt();
      }

      int ans = countFlips(arr,n);
      System.out.println(ans);

    }

    private static int countFlips(int[] arr,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(count%2==0)
            {
                if(arr[i]==0)
                    count++;
            }
            else
            {
                if(arr[i]==1)
                    count++;
            }
        }

        return count;
    }

}

/*

You are given an array of bulbs where:

0 represents a bulb that is off.
1 represents a bulb that is on.

Each time you press a switch on a bulb, that bulb and all bulbs to its right are flipped. The goal is to turn all the bulbs on (i.e., all 1s) using the minimum number of flips.

Core Idea (Flip Tracking):
Flipping State Concept:

As you progress through the array, each time you press a switch on a bulb, you change the state of the current bulb and all bulbs to the right. So, instead of actually flipping all the bulbs physically in the array, we track the number of flips.
Key Insight: After an odd number of flips, the bulbs are effectively in the opposite state (i.e., 0 becomes 1 and 1 becomes 0), but after an even number of flips, they remain in their original state.
Logic Breakdown:

We keep a count to track the number of flips made so far.
For each bulb:
If the number of flips so far is even, the bulb's state is what it appears to be. If it is 0 (off), you need to flip it.
If the number of flips so far is odd, the bulb’s state is effectively flipped from its original state. If it is 1 (on in appearance but flipped), you need to flip it.

Every time we flip a bulb, we increment the flip count.

*/