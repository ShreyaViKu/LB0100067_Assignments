import java.util.*;

class Numbers
{
    /////////////////////////////////////////////////////////////////////
    /// Function    : NeonNumber
    /// Description : sum of digits of it's square
    ///               equals the number itself
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean NeonNumber(int iNo)
    {
        boolean bRet = false;

        int sqr = 0, iSum = 0;

        sqr = iNo * iNo;

        while(sqr != 0)
        {
            iSum = iSum + (sqr % 10);

            sqr = sqr / 10;

        }

        if(iSum == iNo)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////
    /// Function    : AutomorphicNumber
    /// Description : if its square ends with same digits as number
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean AutomorphicNumber(int iNo)
    {
        boolean bRet = false;

        int sqr = 0;

        sqr = iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != sqr % 10)
            {
                break;
            }
            iNo = iNo / 10;
            sqr = sqr / 10;
        }

        if(iNo == 0)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////
    /// Function    : SpyNumber
    /// Description : if sum of digits = product of digits
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean SpyNumber(int iNo)
    {
        int iSum =0, iProduct = 0, iDigit = 0;

        iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iProduct = iProduct * iDigit;

            iNo = iNo / 10;
        }

        return (iSum == iProduct);
    }

    /////////////////////////////////////////////////////////////////////
    /// Function    : SunnyNumber
    /// Description : if number + 1 is perfect square
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean SunnyNumber(int iNo)
    {
        boolean bRet = false;

        int sqrt = 0;

        sqrt = (int)Math.sqrt(iNo+1);

        if(iNo+1 == sqrt*sqrt)
        {
            bRet = true;
        }

        return bRet;
    }

    /////////////////////////////////////////////////////////////////////
    /// Function    : DisariumNumber
    /// Description : sum of digits raised to their position = number
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean DisariumNumber(int iNo)
    {
        int iTemp = 0, iDigit = 0, iCount = 0;
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
            iDigit = iNo % 10;

            iSum = iSum + (Math.pow(iDigit, iCount));

            iNo = iNo/10;
            iCount--;

        }

        return (iSum == iTemp);
    }

    /////////////////////////////////////////////////////////////////////
    /// Function    : TrimorphicNumber
    /// Description : if cube of number ends with number itself
    /// Author      : Shreya Kulkarni
    /// Date        : 21/08/2026
    /////////////////////////////////////////////////////////////////////
    
    public boolean TrimorphicNumber(int iNo)
    {
        boolean bRet = false;

        int cube = 0;

        cube = iNo * iNo * iNo;

        while(iNo != 0)
        {
            if(iNo % 10 != cube % 10)
            {
                break;
            }

            iNo = iNo / 10;
            cube = cube / 10;
        }
        
        if(iNo == 0)
        {
            bRet = true;
        }

        return bRet;
    }
}

public class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        bRet = nobj.TrimorphicNumber(iNo);

        if(bRet)
        {
            System.out.println(iNo+" is trimorphic Number");
        }
        else
        {
            System.out.println(iNo+" is not a trimorphic Number");
        }

        sobj.close();
    }
    
}
