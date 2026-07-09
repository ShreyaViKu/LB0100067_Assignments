/*
Accept 1 number from user and range of positions
toggle all bits from that range
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

    public int ToggleBitRange()
    {
        int iRet = 0, i = 0;
        int imask = 0;

        for(i = iPos1; i <= iPos2; i++)
        {
            imask = imask | (1 << (i-1));
        }
        iRet = imask ^ iNo;

        return iRet;

    }
}
class program5
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

        if((iPosition1 > 32 || iPosition1 <1) || (iPosition2 > 32 || iPosition2 <1) || (iPosition1 >= iPosition2))
        {
            System.out.println("Invalid positions");
        }
        else
        {
            Bitwise bobj = new Bitwise(iValue, iPosition1, iPosition2);

            int iRet = bobj.ToggleBitRange();

            System.out.println("Updated number is : "+iRet);
        }
    }
}