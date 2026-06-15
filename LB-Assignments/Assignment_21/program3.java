/*
program to display all factors of given number  
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    void displayFactors()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+", ");
            }
        }
    }
}
class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        lobj.displayFactors();


    }
}