/*
Voting System
IP: No. of votes and N voter ID
Duplicate voter ID not allowed
*/

import java.util.*;

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Set <Integer>hobj = new HashSet<Integer>();
        
        int iNo = 0, Duplicates = 0;

        System.out.println("Enter total number of votes : ");
        iNo = sobj.nextInt();

        for(int i = 0; i < iNo; i++)
        {
            System.out.println("Enter voter ID : ");
            int voterId = sobj.nextInt();

            if(hobj.contains(voterId))
            {
                Duplicates++;
            }
            else
            {
                hobj.add(voterId);
            }
        }

        System.out.println("Valid votes : "+(iNo - Duplicates));

        System.out.println("Rejected Duplicate Votes : "+Duplicates);

    }
}