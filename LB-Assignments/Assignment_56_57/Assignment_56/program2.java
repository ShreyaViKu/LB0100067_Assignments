/*
Anagram strings or not
2 strings contains same characters with same frequency regrdless order
*/
import java.util.*;

class program2
{
    public static boolean AnagramStrings(String str1, String str2)
    {
        boolean bRet = true;

        int frequency[] = new int[26];

        str1 = str1.trim();
        str1 = str1.replaceAll("\\s+"," ");
        str1 = str1.toLowerCase();
        char s1[] = str1.toCharArray();

        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+"," ");
        str2 = str2.toLowerCase();
        char s2[] = str2.toCharArray();

        if(s2.length != s1.length)
        {
            return false;
        }

        for(int i = 0; i < s1.length; i++)
        {
            if(s1[i] >= 'a' && s1[i] <= 'z')
            {
                frequency[s1[i]-97]++;
            }
            if(s2[i] >= 'a' && s2[i] <= 'z')
            {
                frequency[s2[i]-97]--;
            }
        }

        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] != 0)
            {
                bRet = false;
                break;
            }
        }

        return bRet;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null, str2 = null;

        System.out.println("Enter first String : ");
        str1 = sobj.nextLine();

        System.out.println("Enter second String : ");
        str2 = sobj.nextLine();

        if(AnagramStrings(str1, str2))
        {
            System.out.println("Both strings are anagram");
        }
        else
        {
            System.out.println("Both strings are not anagram");
        }  
    }
}