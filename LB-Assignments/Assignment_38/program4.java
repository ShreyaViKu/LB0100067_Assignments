/*
Accept 1 number from user 
and check whether 9th or 12 th bit is on or off
*/
import java.util.*;

class Bitwise
{
    public int iNo;
    public int iPos1, iPos2;

    public Bitwise(int a, int b, int c)
    {
        this.iNo = a;
        this.iPos1 = b;
        this.iPos2 = c;
    }

    public boolean ChkBits()
    {
        boolean bRet = false;

        int iMask1 = 0X1;
        int iMask2 = 0X1;

        iMask1 = iMask1 << (iPos1-1);
        iMask2 = iMask2 << (iPos2-1);

        int iMask = iMask1 | iMask2;

        int Ans = iMask & iNo;

        if(Ans != 0)
        {
            bRet = true;
        }
        return bRet;

    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue= 0;
        int iPosition1 = 0, iPosition2 = 0;

        System.out.println("Enter First Number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter First Position : ");
        iPosition1 = sobj.nextInt();

        System.out.println("Enter Second Position : ");
        iPosition2 = sobj.nextInt();

        if((iPosition1 > 32 || iPosition1 <1) || (iPosition2 > 32 || iPosition2 <1))
        {
            System.out.println("Invalid positions");
        }
        else
        {
            Bitwise bobj = new Bitwise(iValue, iPosition1, iPosition2);

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
}