/*
write a program to print table of a number
*/
import java.util.*;

class Logic 
{
    void printTable(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNo+" * "+iCnt+" = "+(iCnt*iNo));
        }
    }
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0;

        System.out.println("Enter number : ");
        iValue1 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.printTable(iValue1);
        
    }
}
