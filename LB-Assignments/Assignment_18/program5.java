/*
write a program to check 
whether number is +ve, -Ve or zero
*/
import java.util.*;

class Logic 
{
    void checkSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("number is negative");
        }
        else if(iNo > 0)
        {
            System.out.println("number is positive");
        }
        else
        {
            System.out.println("number is zero");
        }
    }
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.checkSign(iValue);
        
    }
}
