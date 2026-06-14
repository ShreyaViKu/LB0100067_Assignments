/*
program to find product of digits of number 
*/
import java.util.*;

class Logic
{
    int iNo = 0;

    public Logic(int a)
    {
        this.iNo = a;
    }

    int productOfDigits()
    {
        int iProduct = 1, iRem = 0;

        while(iNo != 0)
        {
            iRem = iNo % 10;

            iNo = iNo / 10;
            
            if(iRem == 0)
            {
                continue;
            }
            iProduct = iProduct * iRem;
        }
        return iProduct;
    }
}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue =0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic(iValue);

        int iRet = lobj.productOfDigits();

        System.out.println("product of digits is : "+iRet);


    }
}