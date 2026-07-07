/*
iRow = 5   iCol = 5
1  2  3  4  5
1  2        5
1     3     5
1        4  5
1  2  3  4  5

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

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j<= iCol; j++)
            {
                if((i == j) || (i==1)||(j==1)||(i==iRow)||(j==iCol))
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
class program5
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