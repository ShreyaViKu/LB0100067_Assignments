/*
remove duplicate characters from string
*/

import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        int frequency[] = new int[26];

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        str = str.toLowerCase();
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                frequency[Arr[i]-97]++;
            }
        }

        for(int i = 0; i< frequency.length; i++)
        {
            if(frequency[i] > 0)
            {
                System.out.print((char)(i+97));
            }
        }

    }
}