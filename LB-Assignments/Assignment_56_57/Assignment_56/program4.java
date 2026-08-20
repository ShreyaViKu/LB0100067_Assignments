/*
Display characters appearing more than once
*/

import java.util.*;

class program4
{
    public static void DuplicateCharaters(String str)
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

        System.out.println("Characters appearing more than once in string : ");
        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] > 1)
            {
                System.out.print((char)(i+97)+"\t");
            }
        }
        System.out.println();

    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str1 = null;

        System.out.println("Enter String : ");
        str1 = sobj.nextLine();
        
        DuplicateCharaters(str1);
    }
}