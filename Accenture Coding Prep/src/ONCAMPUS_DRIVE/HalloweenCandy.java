package ONCAMPUS_DRIVE;

/*

Your daughter, Alex, has just come home with a bag full of candy after a long night of trick-or-treating. Before going to sleep, Alex places the candy in numPiles piles, with the i-th pile containing candyPiles[i] number of candies.

After arranging the candies into piles, Alex announces she is going to sleep for numHours hours.

Your plan is to eat all the candy before Alex wakes up in numHours. You can eat c candies per hour, but in each hour you will only eat candy from a single pile. If a pile contains fewer than c candies, you will only eat the number of candies in that pile and wait until the next hour to eat more candy.

Having a little bit of self-restraint, your goal is to calculate the smallest number of candies c you need to eat per hour in order to finish all the candy before Alex wakes up again.

Input Format:

The first line of the input will be an integer, numPiles.

The next numPiles lines of the input will represent candyPiles with each line representing the number of candies in that pile.

The last line of the input will be a string representation of an integer representing the number of hours, numHours, that Alex will be asleep for.

Output Format: The output will be an integer, representing the smallest number of candies c that you need to eat per hour in order to finish all the candy before Alex wakes up.

*/

import java.util.Scanner;

public class HalloweenCandy
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numPiles = in.nextInt();

        int candyPiles[] = new int[numPiles];

        for(int i=0;i<numPiles;i++)
            candyPiles[i]=in.nextInt();

        int numHours = in.nextInt();

        int c = practice(candyPiles,numHours);
        System.out.println(c);

    }

//    private static int calculate(int numPiles, int[] candyPiles,int numHours)
//    {
//        int low=0,high=max_element(candyPiles);
//        int c=0;
//
//        while(low<=high)
//        {
//            int mid=low+(high-low)/2;
//            int requiredHours=0;
//            for(int i=0;i<numPiles;i++)
//            {
//                requiredHours+=candyPiles[i]/mid + (candyPiles[i]%mid!=0 ?1 :0) ;
//            }
//
//            if(requiredHours>numHours)
//                low=mid+1;
//            else
//            {
//                c=mid;
//                high=mid-1;
//            }
//        }
//        return c;
//
//    }

    private static int practice(int[] candyPiles,int numHours)
    {
        int l = 0 , r = max_element(candyPiles);
        int res = r;

        while(l<=r)
        {
            int mid = l + (r-l)/2;

            int totalTime = 0;

            for(int pile : candyPiles)
            {
                totalTime = totalTime + pile/mid + ((pile%mid)!=0 ? 1 : 0);
                // This approach ensures that the number of hours is correctly counted even when there are leftovers in the pile.
            }

            if(totalTime<=numHours)
            {
                res = mid;
                r=mid-1;
            }

            else
            {
                l=mid+1;
            }
        }
        return res;
    }

    private static int max_element(int[] arr)
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }

}

/*

Initial Setup:

low = 0, high = max_element(candyPiles)
We use binary search here. low starts at 0 (the minimum possible candies per hour), and high is set to the maximum number of candies in any pile (the most candies you would need to eat in one hour in the worst-case scenario).

Binary Search Loop (while low <= high):

Mid-Calculation:

mid represents the current guess for the number of candies (c) you can eat per hour.

Calculate the total hours required:

We iterate through each pile of candies.
For each pile, requiredHours is calculated by dividing the pile by mid. This tells how many hours it would take to finish that pile if you could eat mid-candies per hour.
If there are leftover candies (i.e., candyPiles[i] % mid != 0), you add 1 more hour for the remaining candies.
Check the hours against the given numHours:
If requiredHours > numHours, it means our guess for c (mid) is too small, so we increase low to search for larger values of c.
Otherwise, we know that mid is a valid candidate, so we store it as the best possible value (c = mid), and then we reduce high to search for even smaller possible values of c.
The loop continues until the binary search narrows down the smallest valid c.

*/