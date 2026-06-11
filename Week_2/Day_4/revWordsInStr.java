// package Week_2.Day_4;

public class revWordsInStr {
    public static String reverseWords(String s) {
        int i=0,j=0;
        int l=0,r=0;
        char [] arr = s.toCharArray();
        while(j<=s.length())
        {   
            if(j==arr.length || arr[j]==' ')
            {   l=i;
                r=j-1;
                while(l<r)
                {
                    char temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                    r--;
                    l++; 
                }
                i=j+1;    
            }
            j++;
        }
        String ans = new String(arr);
        return ans;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}
