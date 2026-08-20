/*
Palindrome string or not
*/
import java.util.*;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null, reverse = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        if(str.equals(sb.reverse().toString()))
        {
            System.out.println("String "+sb+" is palindrome");
        }
        else
        {
            System.out.println("String "+sb+" is not a palindrome");
        }
        
    }
}