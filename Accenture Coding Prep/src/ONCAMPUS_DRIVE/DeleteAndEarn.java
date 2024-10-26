package ONCAMPUS_DRIVE;

/*

You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

Pick any nums[i] and delete it to earn nums[i] points.
Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.

Return the maximum number of points you can earn by applying the above operation some number of times.

Examples:

Example 1:
Input: [3, 4, 2]
Output: 6

Explanation:

Delete 3 to earn 3 points. Array becomes [4, 2].
Delete 4 to earn 4 points. Array becomes [2].
Total points = 3 + 4 = 6.

Example 2:
Input: [2, 3, 3, 3, 4]
Output: 9

Explanation:

Delete 3 (choose any one of the three 3s) to earn 3 points. Array becomes [2, 3, 3, 4].
Delete another 3 to earn 3 points. Array becomes [2, 3, 4].
Delete 3 one more time to earn 3 points. Array becomes [2, 4].
Total points = 3 + 3 + 3 = 9.


*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeleteAndEarn
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[]=new int[n];

        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            nums[i] = in.nextInt();
            max=Math.max(nums[i],max);
        }

       Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+num);
        }

        int prev_pick = map.getOrDefault(1,0);
        int prev_notpick = 0;

        for(int i=2;i<=max;i++)
        {
            int curr_pick = prev_notpick + map.getOrDefault(i,0);
            int curr_notPick = Math.max(prev_pick,prev_notpick);

            prev_notpick=curr_notPick;
            prev_pick=curr_pick;
        }
        System.out.println(Math.max(prev_pick,prev_notpick));
    }
}


/*

For the DP approach

First calculate the individual value that we can earn from each element.
freq[i]*nums[i]

Then store the number and their corresponding value that we calculated above in a hashmap

Now we will apply pick and notpick logic from the hashmap

map val : [ 0    2    9    4 ]
map key : [ 1    2    3    4 ]

pick    =   0    2    9    6

notpick =   0    0    2    9

*/