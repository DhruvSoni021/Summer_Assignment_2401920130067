// package Week_2.Day_2;

import java.util.HashSet;

public class LongestSubsttring {
      public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> m = new HashSet<>();
        int i=0,j=0;
        int max = 0;

        while(j<s.length())
        {
            if(!m.contains(s.charAt(j)))
            {
                m.add(s.charAt(j));
                max = Math.max(max,j-i+1);
                j++;
            }
            else 
            {
                m.remove(s.charAt(i));
                i++; 
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
