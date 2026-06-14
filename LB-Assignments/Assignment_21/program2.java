/*
program to find product of digits of number 
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    void countEvenOddRange()
    {
        int iCnt = 0;
        int iEven = 0, iOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        System.out.println("Even numbers are : "+iEven);
        System.out.println("Odd numbers are : "+iOdd);
    }
}
class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.countEvenOddRange();


    }
}