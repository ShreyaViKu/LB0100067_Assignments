/*
Pangram string
if it contains alphabates from a to z at least once
*/
import java.util.*;

class program3
{
    public static boolean PangramString(String str)
    {
        boolean bRet = true;

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

        for(int i = 0; i < frequency.length; i++)
        {
            if(frequency[i] == 0)
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

        String str1 = null;

        System.out.println("Enter first String : ");
        str1 = sobj.nextLine();

        if(PangramString(str1))
        {
            System.out.println("string is panagram");
        }
        else
        {
            System.out.println("string is not panagram");
        }  
    }
}