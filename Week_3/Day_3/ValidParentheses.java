// package Week_3.Day_3;

import java.util.Stack;

public class ValidParentheses {
     public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{ // ch closing bracket
                if(st.size()==0) return false;
                char top = st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }
     public static boolean sameStyle(char a,char b)
    {
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        else return false;
    }
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
}
// Time complexity-> O(n);
