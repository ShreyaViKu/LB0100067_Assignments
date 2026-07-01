/*
Accept number from user and count number of
on bits without using % and /
*/
import java.util.*;

class Bitwise
{
    public int iNo;

    public Bitwise(int a)
    {
        this.iNo = a;
    }

    public int CountOn()
    {
        int iCount = 0;
        int iTemp = iNo;

        while(iTemp != 0)
        {
            if((iTemp & 1)==1)
            {
                iCount++;
            }
            iTemp = iTemp >> 1;
        }
        return iCount;

    }
}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue);

        iRet = bobj.CountOn();

        System.out.println("number of On bits are : "+iRet);

    }
}