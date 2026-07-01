/*
Accept number from user and position 
and toggle first and last nibble content 
*/
import java.util.*;

class Bitwise
{
    public int iNo;

    public Bitwise(int a)
    {
        this.iNo = a;
    }

    public int TogggleFandLNibble()
    {
        int iMask = 0xF000000F, iAns = 0;

        iAns = iNo ^ iMask;

        return iAns;
    }
}
class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue);

        iRet = bobj.TogggleFandLNibble();

        System.out.println("Modified number is : "+iRet);

    }
}