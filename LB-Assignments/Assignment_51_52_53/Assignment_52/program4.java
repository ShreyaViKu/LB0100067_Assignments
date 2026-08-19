/*
telocom compony bills calculations
first 5 min -> free
next 10 min -> 1 rs per minute
beyond 15 min -> 2 rs per minute
*/

import java.util.*;

class program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Duration = 0, Bill = 0;;

        System.out.println("Enter call duration in minutes : ");
        Duration = sobj. nextInt();

        if(Duration > 5 && Duration <= 15)
        {
            Bill = (Duration - 5) * 1;
        }
        else if( Duration > 15)
        {
            Bill = (10 + (Duration - 15) * 2);
        }

        System.out.println("Call Duration : "+Duration+" minutes");
        System.out.println("Total call charges : "+Bill+" rs");
        
    }
}