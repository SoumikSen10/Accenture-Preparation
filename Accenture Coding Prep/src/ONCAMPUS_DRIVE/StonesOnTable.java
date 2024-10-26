package ONCAMPUS_DRIVE;

/*

You are given a sequence of colored stones placed on a table. Each stone can be either 'R' (Red), 'G' (Green), or 'B' (Blue). Your task is to remove adjacent stones of the same color such that no two adjacent stones have the same color in the final sequence.

Input:
The first line contains an integer N, which represents the number of stones.
The second line contains a string str of length N, consisting of characters 'R', 'G', and 'B' which denote the colors of the stones.

Output:
Print the minimum number of stones to remove so that no two adjacent stones have the same color.

Example:

Input:
N = 6
str = "RRGGBR"

Output:
2

Explanation:
In the string str = "RRGGBR", you need to remove one 'R' and one 'G' to make the sequence "RGBR". Thus, the minimum number of stones to remove is 2.

Constraints:
The length of the string N is between 1 and 100 inclusive.
The goal of this problem is to count and remove the number of adjacent stones that share the same color. If you identify such pairs, only one of the two stones needs to be removed.

*/

import java.util.Scanner;

public class StonesOnTable
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int ans = removalCount(s,n);
        System.out.println(ans);

    }

    private static int removalCount(String s, int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);

            if(prev==curr)
                count++;
        }
        return count;
    }

}
