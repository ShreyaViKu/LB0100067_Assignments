/*
Accept number from user and position 
and toggle that bit and return that number 
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

    public int TogggleBit()
    {
        int iMask = 0x1, iAns = 0;

        iMask = iMask << (iPos -1);

        iAns = iNo ^ iMask;

        return iAns;
    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iLocation = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter Location : ");
        iLocation = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue, iLocation);

        iRet = bobj.TogggleBit();

        System.out.println("Modified number is : "+iRet);

    }
}