/*
write a program to find the maximum of two numbers
*/
import java.util.*;

class Logic 
{
    int findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
    }
}

class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0,iValue2 = 0, iRet = 0;

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.findMax(iValue1, iValue2);

        System.out.println("Maximum number is : "+ iRet);
        
    }
}
