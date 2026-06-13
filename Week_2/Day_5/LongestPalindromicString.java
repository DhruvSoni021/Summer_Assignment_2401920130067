// package Week_2.Day_5;

public class LongestPalindromicString {
    public static boolean palinDrome(String sub)
    {
        int i=0,j=sub.length()-1;

        while(i<j)
        {
            if(sub.charAt(i) != sub.charAt(j))
            {
                return false;   
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        if(s.length()<=1) return s;

        String res ="";

        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub = s.substring(i,j+1);

                if(palinDrome(sub) && res.length()<sub.length())
                {
                    res = sub; 
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    
}
