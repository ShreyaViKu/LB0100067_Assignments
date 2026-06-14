/*
program to find smallest digit in number
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    int findSmallestDigit()
    {
        int iMin = iNo % 10;
        int iRem = 0;

        while(iNo != 0)
        {
            iRem = iNo%10;

            if(iMin > iRem)
            {
                iMin = iRem;
            }

            iNo = iNo / 10;
        }
        return iMin;
    }
}
class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        int iRet = lobj.findSmallestDigit();

        System.out.println("Smallest digit is : "+iRet);


    }
}