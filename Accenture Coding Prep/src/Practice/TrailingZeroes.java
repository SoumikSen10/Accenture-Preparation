package Practice;

import java.util.Scanner;

public class TrailingZeroes
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = findZeroes(N);
        System.out.println(x);
    }

    private static int findZeroes(int n)
    {
        int c = 0;
        while(n>0)
        {
            c=c+(n/5);
            n=n/5;
        }
        return c;
    }
}
