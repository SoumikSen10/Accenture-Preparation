package Practice;

public class LongestStrWithoutRepeat
{
    public int lengthOfLongestSubstring(String s)
    {
        int[] hashArray = new int[128]; // Supports all ASCII characters
        int left = 0, right = 0, maxLength = 0;
        while (right < s.length())
        {
            char ch = s.charAt(right);
            hashArray[ch]++;
            while (hashArray[ch] > 1) {
                hashArray[s.charAt(left)]--;
                left++;
            }

            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }
        return maxLength;
    }
}
