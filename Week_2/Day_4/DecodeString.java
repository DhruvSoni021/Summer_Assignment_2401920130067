// package Week_2.Day_4;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int repeatCount = 0;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch)) 
            {
                repeatCount = repeatCount * 10 + (ch - '0');
            }
            else if(ch == '[') 
            {
                countStack.push(repeatCount);
                stringStack.push(currentString);

                repeatCount = 0;
                currentString = new StringBuilder();
            }
            else if(ch == ']') 
            {
                int times = countStack.pop();
                StringBuilder previousString = stringStack.pop();

                for (int i = 0; i < times; i++) {
                    previousString.append(currentString);
                }

                currentString = previousString;
            }

            else 
            {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        System.out.println(decodeString(s));
    }
}
