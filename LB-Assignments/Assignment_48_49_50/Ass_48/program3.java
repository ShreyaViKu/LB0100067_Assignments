/*
each student has marks in 5 subjects out of 100
if any subject < 35 -> fail
avg >= 75 -> distinction
avg >= 60 -> First class
avg >= 50 -> second class
avg < 50 -> pass
*/

import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        
        int Marks[] = new int[5];
        int i = 0, iSum = 0;

        System.out.println("Enter marks of 5 Subjects : ");
        for(i = 0; i< 5; i++)
        {
            Marks[i] = sobj.nextInt();
            if(Marks[i] < 0 || Marks[i] > 100)
            {
                System.out.println("Enter valid marks in range 0 to 100");
                return;
            }
        }

        for(i = 0; i < Marks.length; i++)
        {
            if(Marks[i] < 35)
            {
                System.out.println("Result : Fail");
                return;
            }
            iSum = iSum + Marks[i];
        }

        int avg = iSum / Marks.length;

        System.out.println("Average Marks : "+avg);
        if(avg >= 75)
        {
            System.out.println("Final Result : Distinction");
        }
        else if(avg >= 60 && avg < 75)
        {
            System.out.println("Final Result : First Class");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Final Result : Second class");
        }
        else
        {
            System.out.println("Final Result : Pass");
        }
        
    }
}