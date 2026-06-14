/*
program to find whether number is perfect or not
*/
import java.util.*;

class Logic
{
    boolean checkPerfect(int iNo)
    {
        int iCnt = 0, iSum =0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.checkPerfect(iValue);

        if(bRet)
        {
            System.out.println("perfect number ");
        }
        else
        {
            System.out.println("not perfect number ");
        }

    }
}