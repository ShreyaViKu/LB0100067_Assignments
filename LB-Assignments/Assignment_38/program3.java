/*
Accept 1 number from user 
and check whether 9th or 12 th bit is on or off
*/
import java.util.*;

class Bitwise
{
    public int iNo;

    public Bitwise(int a)
    {
        this.iNo = a;
    }

    public boolean ChkBits()
    {
        boolean bRet = false;

        int iMask = 0X900;
        int Ans = iNo & iMask;

        if((Ans == 0x800) || (Ans == 0x100))
        {
            bRet = true;
        }
        return bRet;

    }
}
class program3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue= 0;

        System.out.println("Enter First Number : ");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue);

        if(bobj.ChkBits())
        {
            System.out.println("TRRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}