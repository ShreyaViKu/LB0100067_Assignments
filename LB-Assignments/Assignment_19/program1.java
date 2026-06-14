/*
write a program to check whether a given 
year is leap year or not
*/
import java.util.*;

class Logic 
{
    boolean checkLeapYear(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 400 == 0) || ((iNo % 4 == 0) && (iNo % 100 != 0)))
        {
            bFlag = true;
        }
        return bFlag;
    }
}

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter year : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        bRet = lobj.checkLeapYear(iValue);

        if(bRet == true)
        {
            System.out.println("Year is Leap Year");
        }
        else
        {
            System.out.println("Year is not a Leap Year");
        }
        
    }
}
