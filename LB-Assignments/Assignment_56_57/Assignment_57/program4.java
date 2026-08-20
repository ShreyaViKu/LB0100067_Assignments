/*
count vowels and consonents from string
*/

import java.util.*;

class program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int vowels = 0, consonents = 0;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();

        for(int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i'||
                   ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else
                {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels count : "+vowels);
        System.out.println("Consonnent count : "+consonents);

    }
}