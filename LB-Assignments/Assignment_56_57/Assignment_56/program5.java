/*
Display frequency of each character in string
*/

import java.util.*;

class program5
{
    public static void Frequency(String str)
    {
        int frequency[] = new int[26];

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        char s[] = str.toCharArray();

        for(int i = 0; i < s.length; i++)
        {
            if(s[i] >= 'a' && s[i] <= 'z')
            {
                frequency[s[i]-97]++;
            }
        }

        System.out.println("Characters with their frequency in string : ");
        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.println((char)(i+97)+" -> "+frequency[i]);
            }
        }

    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;

        System.out.println("Enter String : ");
        str1 = sobj.nextLine();
        
        Frequency(str1);
    }
}