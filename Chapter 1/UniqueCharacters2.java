/*
Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures?
This solution does not use additional data structure.
Case insensitive: Considers duplicate even if in lower/upper case
*/

public class UniqueCharacters2
{
    public static void main (String[] args)
    {
        hasUniqueChars("oval");
        hasUniqueChars("happy");
        hasUniqueChars("Malibu");
        hasUniqueChars("Unique");
    }

    public static void hasUniqueChars (String str)
    {
        int length = str.length();
        String sampleStr = str.toLowerCase();
        boolean hasUnique = false;
        int i;
        for (i = 0; i < length; i++)
        {
            for (int j = i+1; j < length; j++)
            {
                if (sampleStr.charAt(i) == sampleStr.charAt(j))
                {
                    hasUnique = true;
                    break;
                }
            }
            if (hasUnique)
            {
                break;
            }
        }
        if (!hasUnique)
        {
            System.out.println("The string " + str + " has unique characters");
        }
        else
        {
            System.out.println("The string " + str + " does not have unique characters");
        }
    }
}