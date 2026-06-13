// package Week_2.Day_5;

public class StringCompression {
     public static int compress(char[] chars) {
        int i = 0;
        int index = 0;

        while(i < chars.length) 
        {
            char current = chars[i];
            int count = 0;

            while(i<chars.length && chars[i]==current) 
            {
                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) 
            {
                String c = String.valueOf(count);

                for (char ch : c.toCharArray()) 
                {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
    public static void main(String[] args)
    {
        char [] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
