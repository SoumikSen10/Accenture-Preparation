package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharsFreq
{
    public String frequencySort(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> characters = new ArrayList<>(map.keySet());
        characters.sort((a, b) -> map.get(b) - map.get(a));

        String str="";
        StringBuilder sb = new StringBuilder();
        for(char c : characters)
        {
            int freq = map.get(c);
            for(int i=0;i<freq;i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
