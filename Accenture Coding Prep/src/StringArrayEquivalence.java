import java.util.Scanner;

public class StringArrayEquivalence
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter length of first array: ");
        int m =in.nextInt();

        System.out.print("Enter length of second array: ");
        int n =in.nextInt();

        String arr1[]=new String[m];
        String arr2[]=new String[n];

        System.out.println("Enter elements in first array:");
        for(int i=0;i<m;i++)
            arr1[i]=in.next();

        System.out.println("Enter elements in second array:");
        for(int i=0;i<n;i++)
            arr2[i]=in.next();

        if(check2(arr1,m,arr2,n))
            System.out.println("Both arrays are equivalent");
        else
            System.out.println("Both arrays are not equivalent");
    }

    public static boolean check(String[] arr1,int m,String[] arr2,int n)
    {
        if(m!=n)
            return false;
        for(int i=0;i<m;i++)
        {
            if(!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

    public static boolean check2(String[] arr1,int m,String[] arr2,int n)
    {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<m;i++)
        {
            sb1.append(arr1[i]);
            sb2.append(arr2[i]);
        }

        for(int i=0;i<n;i++)
        {
            sb2.append(arr2[i]);
        }
        return sb1.equals(sb2);
    }
}
