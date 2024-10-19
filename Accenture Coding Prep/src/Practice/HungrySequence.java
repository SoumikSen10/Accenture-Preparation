package Practice;/*

X and Y went on a date to a fine dining establishment. Up until paying for the food, everything went smoothly. The waiter requests that lahub compose an n int hungry sequence, in exchange for payment.

A sequence ( a_1, a_2, ..., a_n ), consisting of n integers, is Hungry if and only if:

- Its elements are in increasing order. That is, an inequality ( a_i < a_j ) holds for any two indices ( i,j ) (( i < j )).

- For any two indices ( i ) and ( j ) (( i < j )), ( a_j ) must not be divisible by ( a_i ).

lahub is in trouble, so he asks you for help. Find a Hungry sequence with ( n ) elements.

*/

import java.util.Scanner;

public class HungrySequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of elements :");
        int n = in.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(n+i+" ");
        }

    }
}
