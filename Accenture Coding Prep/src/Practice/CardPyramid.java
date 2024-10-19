package Practice;

import java.util.Scanner;

public class CardPyramid
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the pyramid level: ");
        int n = in.nextInt();
        System.out.println("No of cards needed for pyramid is : "+calc(n));
    }

    private static int calc(int n)
    {
        if(n==0)
            return 0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i*3;
        }
        return (sum-n) % 1000007;
    }
}
