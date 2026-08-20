/*
Reverse each word in string
*/

import java.util.*;

class program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        StringBuffer sb = null;
        StringBuffer finalstr = new StringBuffer();

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        String Tokens[] = str.split(" ");

        for (String s : Tokens) 
        {
            sb = new StringBuffer(s);
            s = sb.reverse().toString();
            
            finalstr.append(s);
            finalstr.append(" ");
            
        }

        System.out.println(finalstr);

        
    }
}