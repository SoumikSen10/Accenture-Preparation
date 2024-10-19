package ONCAMPUS_DRIVE;

/*

Alex gives you a positive number N and wants you to rearrange the bits of the number in its binary representation such that all set bits (1s) are in consecutive order. Your task is to find and return an integer value representing the minimum possible number that can be formed after rearranging the bits of the number N.

Example:

Input:
𝑁=10
Binary:
1010
Output:
3 (binary: 0011)

Input:
𝑁=2
Binary:
10
Output:
1 (binary: 01)

*/

import java.util.Scanner;

public class BitsRearrange
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arrangements = generate(n);
        System.out.println(arrangements);
    }

    private static int generate(int n)
    {
        //count set bits of n
        int count=0;
        while(n>0)
        {
            count+=(n&1);//finding set bit. if found increments else doesnot
            n=n>>1;
        }

        int num=0;
//        while(--count>=0)
//        {
//            num+=(int)Math.pow(2,count); //generating the number
//        }

        //we can also consider above part as sum of gp to optimize it
        // 1,2,4,....

        //optimized
        num = (int)Math.pow(2,count)-1;
        //above formula is a * (r^n - 1) / (r-1)
        //I wrote it based on series we get i.e. 1,2,4,8,... n terms since here both a and r-1 are 1 hence I skipped

        return num;
    }
}
