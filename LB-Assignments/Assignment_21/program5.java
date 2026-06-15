/*
program to display all nmbers divisible by 2 & 3  
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    void printDivisibleBy2And3()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3==0))
            {
                System.out.print(iCnt+", ");
            }
        }
    }
}
class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.printDivisibleBy2And3();


    }
}