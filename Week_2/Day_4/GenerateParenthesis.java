// package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void addParenthesis(int n,int open,int close,String s, List<String> arr){
        if(close==n)
        {
            arr.add(s);
            return;
        }
        if(open<n) addParenthesis(n,open+1,close,s+"(",arr);
        if(close<open) addParenthesis(n,open,close+1,s+")",arr);
    }

    public static List<String> generateParenthesis(int n)
    {
        ArrayList<String> arr = new ArrayList<>();
        addParenthesis(n,0,0,"",arr);
        return arr;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }
    
}
