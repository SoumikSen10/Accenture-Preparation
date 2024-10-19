package Practice;

public class WileyEdgePattern
{
    public static void main(String[] args)
    {
       int m = 5;
       int n = 2*m-1;
       int k = 1;
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n;j++)
           {
               if((i==j) || (i+j==2*m))
                   System.out.print(k);
               else
                   System.out.print(" ");
           }
           if(i<m)
               ++k;
           else
               --k;
           System.out.println("");
       }
    }
}

/*
Output :

1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1

 */