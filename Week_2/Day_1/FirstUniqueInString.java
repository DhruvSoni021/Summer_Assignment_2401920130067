public class FirstUniqueInString {
    public static int firstUniqChar(String s) {
        int n=s.length();
        int [] freq= new int[26];
        for(int i=0;i<n;i++)    
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            if(freq[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
    }
}
