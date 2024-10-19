package Practice;/*

Rob has gone to Mars to collect some stones. The bag he carries can hold a maximum weight of M. There are M stones weighing from 1 to M on Mars. There are N stones on Mars that are similar to the ones on Earth. Find the number of stones he can bring from Mars such that none are similar to any stone on Earth.

Input Specification :

Input 1: M is the size of the bag and the number of different stone weights present on Mars.

Input 2: N is the number of common stones on Earth and Mars.

Input 3: An N elements array containing the list of weights of the common stones.

Example :
Input 1 : 10 (Bag size)
Input 2 : 3 (Common stones)
Input 3 : [1,6,8]

[2,3,4,5,7,9,10]

2,3,4     2,3,5

Output : 3

*/

import java.util.*;

public class MarsStone
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Bag size: ");
        int M = in.nextInt();
        System.out.print("Common stones: ");
        int N = in.nextInt();
        System.out.println("Weights of common stones :");
        int stones[] = new int[N];
        for(int i=0;i<N;i++)
        {
            stones[i]=in.nextInt();
        }

        System.out.println("Result is : "+calc(M,N,stones));
    }

    private static int calc(int M, int N, int[] stones)
    {

        Set<Integer> set = new HashSet<>();
        for(int el : stones)
            set.add(el);

        List<Integer> marsStones = new ArrayList<>();

        for(int i=1;i<=M;i++)
        {
            if(!set.contains(i))
             marsStones.add(i);
        }

        /*int totalWeight=0,count=0;
        for(int weight : marsStones)
        {
            if(totalWeight+weight<=M)
            {
                totalWeight += weight;
                count++;
            }
            else
                break;
        }
        return count;*/
       return getMaxStones(marsStones,M,0,0,0);
    }

    private static int getMaxStones(List<Integer> stones,int M,int index,int currentSum,int currentCount)
    {
        if(currentSum>M)
            return 0;
        if(index == stones.size())
            return currentCount;

        int include = getMaxStones(stones,M,index+1,currentSum+stones.get(index),currentCount+1);
        int exclude =  getMaxStones(stones,M,index+1,currentSum,currentCount);

        return Math.max(include,exclude);

    }

}
