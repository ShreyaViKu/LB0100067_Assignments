/*
iRow = 4   iCol = 4
*  *  *  #
*  *  #  *
*  #  *  *
#  *  *  *

*/
import java.util.*;

class PatternPrint
{
    public int iRow;
    public int iCol;

    public PatternPrint(int a, int b)
    {
        this.iRow = a;
        this.iCol= b;
    }

    void Pattern()
    {
        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Number of rows and columns must be same");
            return;
        }

        int i = 0, j = 0;

        for(i = iRow; i >= 1; i--)
        {
            for(j = 1; j<= iCol; j++)
            {
                if(i==j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1= 0, iValue2 = 0;

        System.out.println("Enter number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns :");
        iValue2 = sobj.nextInt();

        PatternPrint pobj = new PatternPrint(iValue1, iValue2);

        pobj.Pattern();

    }
}