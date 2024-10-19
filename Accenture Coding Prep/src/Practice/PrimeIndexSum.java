package Practice;

import java.util.Scanner;

public class PrimeIndexSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Result is: "+calcPrimeInSum(arr,n));
    }

    private static int calcPrimeInSum(int[] arr,int n)
    {
        if(n<=2)
            return 0;
        int sum = 0;
        for(int i=2;i<n;i++)
        {
            if(prime(i))
                sum+=arr[i];
        }
        return sum;
    }
    private static boolean prime(int n)
    {
        int count=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                if(n/i!=i)
                    count++;
            }
            if(count>2)
                break;
        }
        if(count==2)
            return true;
        return false;
    }
}
