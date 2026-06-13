/*
write a program to check whether number is prime or not
*/
import java.util.*;

class Logic 
{
    boolean checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean bRet = false;

        for(iCnt = 2, bRet = true; iCnt <= (iNo / 2); iCnt++)
        {
            if( iNo % iCnt == 0)
            {
                bRet = false;
                break;
            }
        }
        return bRet;
    }
}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue1 = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.checkPrime(iValue1);

        if(bRet == true)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
        
    }
}
