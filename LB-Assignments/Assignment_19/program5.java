/*
write a program to calculate power of a number using loops
*/
import java.util.*;

class Logic 
{
    int calculatePower(int base, int exp)
    {
        int iPower = 0, iCnt =0;

        for(iCnt = 1,iPower=1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }
        return iPower;
    }
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.println("Enter base : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter exponential : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        iRet = lobj.calculatePower(iValue1, iValue2);

        System.out.println("Power is : "+iRet);
        
    }
}
