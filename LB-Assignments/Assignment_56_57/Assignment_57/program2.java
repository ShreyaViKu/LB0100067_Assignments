/*
longest word in string
*/

import java.util.*;

class program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String str = null, longest = null;
        int max = 0;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        String Tokens[] = str.split(" ");

        for (String s : Tokens) 
        {
            if(s.length() > max)
            {
                max = s.length();
                longest = s;
            }
            
        }

        System.out.println("Longest word is : "+longest);
    }
}