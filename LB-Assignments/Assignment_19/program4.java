/*
write a program to print all digits of number separately not in reverse order
*/
import java.util.*;

class Logic 
{
    void printDigits(int iNo)
    {
        if(iNo == 0)
        {
            return;
        }

        printDigits(iNo / 10);

        System.out.println(iNo % 10);
    }
}

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.printDigits(iValue);
        
    }
}
