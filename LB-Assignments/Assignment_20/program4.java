/*
program to find largest digit in number
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    int findLargestDigit()
    {
        int iMax = iNo % 10;
        int iRem = 0;

        while(iNo != 0)
        {
            iRem = iNo%10;

            if(iMax < iRem)
            {
                iMax = iRem;
            }

            iNo = iNo / 10;
        }
        return iMax;
    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        int iRet = lobj.findLargestDigit();

        System.out.println("Largest digit is : "+iRet);


    }
}