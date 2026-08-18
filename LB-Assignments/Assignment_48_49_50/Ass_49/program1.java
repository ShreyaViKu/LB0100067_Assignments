/*
parking charges
first 2 hours -> 20 rs
after 2 hours -> 10 rs per extra hour
if total hours > 10 -> add 50 rs penalty
*/

import java.util.*;

class program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int hours = 0, fee = 0;

        System.out.println("Enter total parking hours : ");
        hours = sobj.nextInt();

        if(hours < 0)
        {
            System.out.println("Hours can not be negative");
            return;
        }
        if(hours <= 2)
        {
            fee = hours * 20;
        }
        else
        {
            fee = 40 + ((hours- 2) * 10);
        }
        if(hours > 10)
        {
            fee = fee + 50;
        }

        System.out.println("Total parking duration : "+hours+" hours");
        System.out.println("Total parking fee : "+fee+" rs");
    }
}