import java.util.*;

class Numbers
{
    /////////////////////////////////////////////////////////////////////////
    /// Function Name : StrongNumber
    /// Description   : Function checks whether number is strong number or not
    /// Author        : Shreya Kulkarni
    /// Date          : 20/08/2026
    /////////////////////////////////////////////////////////////////////////
    
    public boolean StrongNumber(int iNo)
    {
        boolean bRet = false;
        int iTemp = 0, iSum = 0;

        int Arr[] = {1,1,2,6,24,120,720,5040,40320,362880};

        iTemp = iNo;

        while(iNo != 0)
        {
            iSum = iSum + Arr[iNo % 10];
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            bRet = true;
        }
        return bRet;
    }

    /////////////////////////////////////////////////////////////////////////
    /// Function Name : ArmstrongNumber
    /// Description   : Function checks whether number is armstrong number or not
    /// Author        : Shreya Kulkarni
    /// Date          : 20/08/2026
    /////////////////////////////////////////////////////////////////////////
    
    public boolean ArmstrongNumber(int iNo)
    {
        boolean bRet = false;

        int iCount = 0, iTemp = 0;
        double iSum = 0.0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;

        while(iNo != 0)
        {
            iSum = iSum + Math.pow((iNo % 10), iCount);
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////////
    /// Function Name : PerfectNumber
    /// Description   : Function checks whether number is perfect number or not
    /// Author        : Shreya Kulkarni
    /// Date          : 20/08/2026
    /////////////////////////////////////////////////////////////////////////
    
    public boolean PerfectNumber(int iNo)
    {
        boolean bRet = false;

        int iSum = 0;

        for(int i = 1; i < iNo; i++)
        {
            if( iNo % i == 0)
            {
                iSum = iSum + i;
            }
        }

        if(iSum == iNo)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////////
    /// Function Name : HarshadNumber
    /// Description   : Function checks whether number is harshad number or not
    /// Author        : Shreya Kulkarni
    /// Date          : 20/08/2026
    /////////////////////////////////////////////////////////////////////////
    
    public boolean HarshadNumber(int iNo)
    {
        boolean bRet = false;

        int iTemp = 0, iSum = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iSum = iSum + (iNo % 10);

            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////////
    /// Function Name : PalindromeNumber
    /// Description   : Function checks whether number is palindrome number or not
    /// Author        : Shreya Kulkarni
    /// Date          : 20/08/2026
    /////////////////////////////////////////////////////////////////////////
    
    public boolean PalindromeNumber(int iNo)
    {
        boolean bRet = false;

        int iReverse = 0, iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iReverse = (iReverse * 10) + (iNo % 10);

            iNo = iNo / 10;
        }

        if(iTemp == iReverse)
        {
            bRet = true;
        }

        return bRet;
    }
}
class program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number :");
        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        bRet = nobj.PalindromeNumber(iNo);

        if(bRet)
        {
            System.out.println(iNo+" is palindrome number");
        }
        else
        {
            System.out.println(iNo+" is not a palindrome number");
        }

        sobj.close();

    }
}