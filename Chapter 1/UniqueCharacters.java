/*
Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures?
This solution uses additional data structure HashSet; since it does not let you add duplicate characters.
Case insensitive: Considers duplicate even if in lower/upper case
*/
import java.util.HashSet;

public class UniqueCharacters
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
        HashSet<Character> charList = new HashSet<Character>();
        for (int i = 0; i < length; i++)
        {
            char character = sampleStr.charAt(i);
            if (!charList.add(character))
            {
                break;
            }
        }
        // On adding a character in hashset, it returns true if the character was added
        // and false if the character was a duplicate
        if (charList.size() == length)
        {
            System.out.println("The string " + str + " has unique characters");
        }
        else
        {
            System.out.println("The string " + str + " does not have unique characters");
        }
    }
}