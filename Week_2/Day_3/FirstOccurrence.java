// public package Week_2.Day_3;

public class FirstOccurrence {
      public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args)
    {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}