import java.util.Scanner;

public class GooglePrimeNo
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n=in.nextInt();
        if(check(n))
            System.out.println("It is a googly prime no");
        else
            System.out.println("It is not  a googly prime no");
    }

    private static boolean check(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        //System.out.println(sum);
        if(prime(sum))
             return true;
        return false;
    }

    private static boolean prime(int n)
    {
        if(n<=1)
            return false;
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
