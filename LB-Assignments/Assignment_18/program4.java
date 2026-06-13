/*
write a program to print sum of even digits and odd digits separately
*/
import java.util.*;

class Logic 
{
    void sumEvenOddDigits(int iNo)
    {
        int iSumEven = 0, iSumOdd = 0, iRem = 0;

        while(iNo != 0)
        {
            iRem = iNo % 10;
            if(iRem % 2 == 0)
            {
                iSumEven += iRem;
            }
            else
            {
                iSumOdd += iRem;
            }
            iNo = iNo /10;
        }
        System.out.println("Sum of even digits : "+iSumEven);
        System.out.println("Sum of odd digits : "+iSumOdd);
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.sumEvenOddDigits(iValue);
        
    }
}
