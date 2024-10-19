package ONCAMPUS_DRIVE;

/*

It is Edward's birthday today. His friends have bought him a huge circular cake. Edward wants to find out the maximum number of pieces he can get by making exactly N straight vertical cuts on the cake.

Your task is to write a function that returns the maximum number of pieces that can be obtained by making N number of cuts.

Note:
Since the answer can be quite large, modulo it by 1000000007.

Input Specification:
input1: An integer N denoting the number of cuts.
Output Specification:
Return the maximum number of pieces that can be obtained by making N cuts on the cake.


Example1 -

Input - 4
Output - 11

Example 2 -

Input - 1
Output - 2

*/

import java.util.Scanner;

public class EdwardBirthday
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of cuts
        int pieces=0;
//        for(int i=1;i<=n;i++)
//        {
//            pieces+=i;
//        }
//        System.out.println(pieces+1);

        // easier optimized version
        pieces = n*(n+1)/2;
        System.out.println(pieces+1);
    }
}

/*

default : 1 piece
for 1 cut --> 2 pieces (+1 + previous=1)
for 2 cuts --> 4 pieces (+2 + previous=2)
for 3 cuts --> 7 pieces (+3 + previous=4)
for 4 cuts --> 11 pieces (+4 + previous=7)
||
||

if a chord of a circle cuts n other chords, then it will introduce (n+1) new parts

*/