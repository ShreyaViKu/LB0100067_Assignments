/*
write a program to check whether a number is palindrome or not
*/
import java.util.*;

class Logic 
{
    boolean checkPalindrome(int iNo)
    {
        int iRev = 0, iTem = 0;
        iTem = iNo;

        while(iNo != 0)
        {
            iRev = (iRev * 10)+(iNo % 10);
            iNo = iNo/10;
        }
        
        if(iRev == iTem)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.checkPalindrome(iValue);

        if(bRet == false)
        {
            System.out.println("Number is not palindrome :( ");
        }
        else
        {
            System.out.println("Number is palindrome :) ");
        }
        
    }
}
