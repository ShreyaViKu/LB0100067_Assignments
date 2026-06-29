/*
Accept number from user and position also
check whether the bit at given position is on or off
*/
import java.util.*;

class Bitwise
{
    public int iNo, iPos;

    public Bitwise(int a, int b)
    {
        this.iNo = a;
        this.iPos = b;
    }

    public Boolean ChkBit()
    {
        boolean bRet = false;

        int iMask = 0x1;

        iMask = iMask << (iPos-1);

        if((iMask & iNo) == iMask)
        {
            bRet = true;
        }

        return bRet;
    }

}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iPos = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter bit position : ");
        iPos = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue,iPos);

        bRet = bobj.ChkBit();

        if(bRet)
        {
            System.out.println("Bit is on");
        }
        else
        {
            System.out.println("Bit is off");
        }

    }
}