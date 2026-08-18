/*
electricity compony bill calculator
first 100 units -> 5rs
next 100 units -> 7 rs
above 200 units -> 10 rs

*/

import java.util.*;

class Program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int units;
        int cost = 0;

        System.out.println("Enter units used : ");
        units = sobj.nextInt();

        if(units < 0)
        {
            System.out.println("Units cannot be negative");
            return;
        }

        if(units <= 100)
        {
            cost = units * 5;
        }
        else if(units <= 200)
        {
            cost = (100 * 5) + ((units - 100) * 7);
        }
        else
        {
            cost = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total units consumed : " + units);
        System.out.println("Total Electricity Bill : " + cost);

        sobj.close();
    }
}