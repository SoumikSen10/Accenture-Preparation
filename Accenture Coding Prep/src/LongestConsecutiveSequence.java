import java.util.HashSet;

public class LongestConsecutiveSequence
{
    public int longestConsecutive(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        int count=0,maxLen=1;
        if(nums.length==0)
            return 0;
        for(int el : nums)
            set.add(el);

        for(int el : set)
        {
            if(!set.contains(el-1))
            {
                count = 1;
                int x = el;
                while(set.contains(x+1))
                {
                    ++count;
                    ++x;
                }
                maxLen = Math.max(maxLen,count);
            }
        }
        return maxLen;
    }
}
