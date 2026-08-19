/*
Cinema hall seating arrangement
0-> empty
1-> Booked
Count total booked seates, Row with maximum booking and 
check if any row is completly full
*/

import java.util.*;

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;
        int Booked = 0, MaxBookedRow = 0, Max = 0, TotalRowBooking = 0;
        boolean FullRow = false;

        System.out.println("Enter Numbe of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter Seat occupied or not in a matrix format : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] == 1)
                {
                    Booked++;
                }
            }
        }
        System.out.println("Total Booked Seats : "+Booked);

        for(i = 0; i< iRow; i++)
        {
            for(j = 0; j< iCol; j++)
            {
                TotalRowBooking = TotalRowBooking + Arr[i][j];
            
            }
            if(TotalRowBooking > Max)
            {
                Max = TotalRowBooking;
                MaxBookedRow = i+1;
            }
            if(TotalRowBooking == iCol)
            {
                FullRow = true;
            }
            TotalRowBooking = 0;
        }
        System.out.println("Row with Maximum booking : Row "+MaxBookedRow);
        
        System.out.println("Full Row Exists : "+FullRow);

    }
}