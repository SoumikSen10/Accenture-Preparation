import java.util.Arrays;
import java.util.Scanner;

public class RearrangeElementsArr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elemennts: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The given array is :"+ Arrays.stream(arr).toArray());

        rearrange(arr,n);

    }

    public static void rearrange(int[] arr,int n)
    {
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int k=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
                neg[k++]=arr[i];
            else
                pos[t++]=arr[i];
        }

        t=0;
        k=0;

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[i]=pos[t++];
            }
            else
            {
                arr[i]=neg[k++];
            }
        }

        System.out.println("The rearranged array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
