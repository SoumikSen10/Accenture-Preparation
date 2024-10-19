package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLargeNumber
{
        public static BigInteger factorial(int n)
        {

            if (n == 0) {
                return BigInteger.ONE;
            }

                BigInteger f = BigInteger.ONE;
                for (int i = 1; i <= n; i++)
                {
                    f = f.multiply(BigInteger.valueOf(i));
                }

                return f;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}
