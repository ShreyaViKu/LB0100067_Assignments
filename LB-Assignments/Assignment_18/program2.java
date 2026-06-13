/*
write a program to print all even numbers uo to N
*/
import java.util.*;

class Logic 
{
    void printEvenNumbers(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if( iCnt % 2 == 0)
            {
                System.out.println(iCnt);;
            }
        }
    }
}

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.printEvenNumbers(iValue);
        
    }
}
