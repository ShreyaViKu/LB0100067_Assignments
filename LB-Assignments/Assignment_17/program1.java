/*
write a program to find the sum of digits of a number with oop concepts
*/
import java.util.*;

class Logic 
{
    int sumOfDigits(int iNo)
    {
        int iSum = 0;
        while(iNo != 0)
        {
            iSum += (iNo % 10);
            iNo = iNo/10;
        }
        return iSum;
    }
}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.sumOfDigits(iValue);

        System.out.println("Sum of digits are : "+ iRet);
        
    }
}
