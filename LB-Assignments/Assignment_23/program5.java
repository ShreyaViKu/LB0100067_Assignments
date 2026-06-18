/*
Input : iRow = 3  iCol = 4
Output : 
1  1  1  1  
2  2  2  2
3  3  3  3
4  4  4  4

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

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
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

        int iValue1 =0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic(iValue1, iValue2);

        lobj.Pattern();

    }
}