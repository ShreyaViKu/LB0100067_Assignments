/*
write a program to check whether a number is divisible by 5 and 11
*/
import java.util.*;

class Logic 
{
    boolean checkDivisible(int iNo)
    {

        if((iNo % 5 == 0) && (iNo % 11 == 0))
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
        
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.checkDivisible(iValue);

        if(bRet)
        {
            System.out.println("number is divisible by 5 And 11");
        }
        else
        {
            System.out.println("number is not divisible by 5 And 11");
        }
        
    }
}
