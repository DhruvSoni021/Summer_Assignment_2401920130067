// package Week_2.Day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagram {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }

        
        if (Arrays.equals(freqP,freqS)) ans.add(0);

        for (int i = p.length(); i < s.length(); i++) 
        {
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(freqP,freqS)) ans.add(i - p.length() + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s,p));
    }
}
