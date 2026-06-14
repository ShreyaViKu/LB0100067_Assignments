/*
program to find sum of all even numbers up to N
*/
import java.util.*;

class Logic
{
    int sumEvenNumbers(int iNo)
    {
        int iCnt = 0, iSum =0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum += iCnt;
            }
        }
        return iSum;
    }
}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0, iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.sumEvenNumbers(iValue);

        System.out.println("sum of all even numbers is : "+iRet);

    }
}