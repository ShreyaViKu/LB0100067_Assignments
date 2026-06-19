/*
Input : iRow = 4  iCol = 3
Output : 
1  2  3
4  5  6
7  8  9
10  11  12

*/

import java.util.*;

class Logic
{
    int iRow = 0;
    int iCol = 0;

    public Logic(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
    }

    void Pattern()
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = iRow, iCount = 1; i >= 1; i--)
        {
            for(j = 1; j<= iCol; j++,iCount++)
            {
                System.out.print(iCount+"\t");
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

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of Rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic(iValue1,iValue2);

        lobj.Pattern();
    }
}