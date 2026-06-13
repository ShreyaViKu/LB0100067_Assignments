/*
write a program to find the minimum of three numbers
*/
import java.util.*;

class Logic 
{
    int findMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            return iNo1;
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0,iValue2 = 0,iValue3 = 0, iRet = 0;

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number : ");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.findMin(iValue1, iValue2, iValue3);

        System.out.println("Minimum number is : "+ iRet);
        
    }
}
