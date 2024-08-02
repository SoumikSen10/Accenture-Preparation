import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class ArrayElFrequency
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.print("The array elements are: ");
        System.out.println(arr.toString());

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> element : map.entrySet())
        {
            System.out.println(element.getKey()+ " - "+element.getValue());
        }

    }

}
