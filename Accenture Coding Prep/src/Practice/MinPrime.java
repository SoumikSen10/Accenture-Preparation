package Practice;

import java.util.Scanner;

public class MinPrime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = in.nextInt();
        int ans = DiffMinPrime(n);
        System.out.println("Output is :" + ans);
    }

    //more optimized code
    private static int DiffMinPrime(int n)
    {
        int minprime=2;
        while(n>1)
        {
            if(n%minprime==0)
                break;
            else
                minprime++;
        }
        return n-minprime;
    }


//    private static int DiffMinPrime(int n)
//    {
//        int minPrime = -1;
//
//        // Find the smallest prime factor of n
//        for (int i = 2; i <= n; i++)
//        {
//            if (n % i == 0 && prime(i))
//            {
//                minPrime = i;
//                break;
//            }
//        }
//
//        return n - minPrime;
//    }
//
//    // Helper function to check if a number is prime
//    private static boolean prime(int n)
//    {
//        if (n < 2) return false;
//        for (int i = 2; i * i <= n; i++)
//        {
//            if (n % i == 0)
//                return false;
//        }
//        return true;
//    }
}
