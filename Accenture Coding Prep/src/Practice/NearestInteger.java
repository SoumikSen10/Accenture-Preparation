package Practice;/*

Nearest Integer:

Int nearestInteger(int num, int m)

The function accepts two positive 'num' and 'm' as its argument. Implement the following function to find the nearest integer to `num`.

1) Number is divisible by `m`.
2) Number is nearest to `num` (have the least distance from `num`).

Note: If there are two numbers with the least distance from `num`, then return the larger number.

Input 1:

Num = 67
M = 8

Output 1 :
64

*/

import java.util.Scanner;

public class NearestInteger
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Enter value of m: ");
        int m = in.nextInt();

        int res = nearestInteger(num,m);

            System.out.println("Nearest integer is : "+res);
    }

    private static int nearestInteger(int num,int m)
    {
        int di=num/m;
        int leftNum=di*m;

        int nextDi=di+1;
        int rightNum=nextDi*m;

        int ans;
        if(Math.abs(num-leftNum)<Math.abs(rightNum-num))
        {
            ans=leftNum;
        }
        else
        {
            ans=rightNum;
        }
        return ans;
    }
}
