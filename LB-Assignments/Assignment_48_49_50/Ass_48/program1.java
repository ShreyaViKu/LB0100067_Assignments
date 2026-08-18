/*
Penalty clculation for a library
days < 7 -> no penelty
days 8 to 12 -> 5 rs for each day
days > 12 -> 10rs for each day
IP : total number of days book was kept

*/

import java.util.*;

class program1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Days = 0, Fine = 0;

        System.out.println("Enter number of Days : ");
        Days = sobj.nextInt();

        if(Days < 0)
        {
            System.out.println("Invalid Input");
        }
        else if(Days <= 7)
        {
            System.out.println("Returened on time. No fine applicable");
        }
        else
        {
            for(int i = 8; i <= Days; i++)
            {
                if(i >= 8 && i <= 12)
                {
                    Fine = Fine + 5;
                    continue;
                }
                Fine = Fine + 10;
            }
            System.out.println("Total fine to be paid : "+Fine+" rs");
        }
        
    }
}