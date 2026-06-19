/*
Input : iRow = 4  iCol = 3
Output : 
A  A  A  
B  B  B
C  C  C
D  D  D

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
        char ch = '\0';

        for(i = 1, ch = 'A'; i<= iRow; i++, ch++)
        {
            for(j = 1; j<= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println(); 
        }
    }
}
class program3
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