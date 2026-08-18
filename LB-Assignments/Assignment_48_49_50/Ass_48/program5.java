/*
e commerce platform wants to calculate final payable amount
amount > 5000 -> 20%
amount > 2000 -> 10%
premium members -> extra 5 % 

*/

import java.util.*;

class Program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int amount = 0, discount = 0, prize = 0;
        String membership = null;
        int discountmembership = 0;

        System.out.println("Enter Purchase amount : ");
        amount = sobj.nextInt();

        System.out.println("Enter Membership type : ");
        membership = sobj.next();

        prize = amount;

        if(amount > 5000)
        {
            discount = (amount * 20)/ 100;
        }
        else if(amount > 2000)
        {
            discount = (amount * 10)/ 100;
        }
        prize = amount - discount;

        if(membership.equalsIgnoreCase("Premium"))
        {
            discountmembership = (prize * 5) / 100;
            prize = prize - discountmembership;
        }

        System.out.println("Original amount : "+amount+" rs");
        System.out.println("Total discount : "+(discount+discountmembership)+" rs");
        System.out.println("Final payable amount : "+prize+" rs");
    }
}