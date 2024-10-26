package ONCAMPUS_DRIVE;

/*

You are given an array of integers where each integer represents minutes. The task is to count the number of pairs in the array whose sum forms a whole hour (i.e., 60 minutes).

Example:
Input: [2, 58, 58, 2, 60, 60]
Output: Number of pairs = 3

Explanation:
- Pairs forming 60 minutes are (2, 58), (2, 58), and (60, 60).
Hints/Notes:

The target sum is fixed at 60 minutes.
We have to count all such pairs.

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinutesArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int pairs = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int min = arr[i];
            int target_hour = (min/60)+1;
            int target_minute = (target_hour)*60;

            int required = target_minute - min;

            if(map.containsKey(required) && map.get(required) > 0)
            {
                pairs+=map.get(required);
                map.put(required,0);
            }
            else
                map.put(min,map.getOrDefault(min,0)+1);
        }

        System.out.println(pairs);
    }
}
