/*
Accept 2 numbers from user and display
position of common ON bits from that 2 numbers
*/
import java.util.*;

class Bitwise
{
    public int iNo1, iNo2;

    public Bitwise(int a, int b)
    {
        this.iNo1 = a;
        this.iNo2 = b;
    }

    public void CommonBits()
    {
        int iCommon = iNo1 & iNo2;
        int iPos = 1;

        while(iCommon != 0)
        {
            if((iCommon & 1) == 1)
            {
                System.out.print(iPos+"\t");
            }
            iCommon = iCommon >> 1;
            iPos++;
        }

    }
}
class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter First Number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = sobj.nextInt();

        Bitwise bobj = new Bitwise(iValue1, iValue2);

        bobj.CommonBits();

    }
}