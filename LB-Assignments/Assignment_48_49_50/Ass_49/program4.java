/*
Taffic police app
No helmet -> 500 rs
No licence -> 1000 rs
Overspeeding -> 1500 rs
*/

import java.util.*;

class program4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        String helmet = null, licence = null, overspeeding = null;
        int Fine = 0;

        System.out.println("Helmet worn ? Yes/No : ");
        helmet = sobj.next();

        System.out.println("License available ? Yes/No : ");
        licence = sobj.next();

        System.out.println("Overspeeding ? Yes/No : ");
        overspeeding = sobj.next();

        if(helmet.equalsIgnoreCase("No"))
        {
            Fine = Fine + 500;
        }
        if(licence.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }
        if(overspeeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : "+Fine+" rs");

        sobj.close();
    }
}