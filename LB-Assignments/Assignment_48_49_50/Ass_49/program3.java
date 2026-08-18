/*
Stock managment
IP : current stock and requested quentity
if quantity > stock -> order fails
else deduct stock
if stock < 5 -> low stock alert

*/

import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Stock = 0, quentity = 0;

        System.out.println("Enter Current stock : ");
        Stock = sobj.nextInt();

        while(true)
        {
            System.out.println("Enter requested quentity : ");
            quentity = sobj.nextInt();

            if(quentity > Stock)
            {
                System.out.println("Order Failed : Insufficient Stock !");
            }
            else if(Stock - quentity < 5)
            {
                System.out.println("Low Stock Alert !");
            }
            else
            {
                Stock = Stock - quentity;
                System.out.println("Order processed Successfully.");
                System.out.println("Remaining Stock : "+Stock);

                if(Stock == 5)
                {
                    System.out.println("Termination of code : Stock reached it minimum limit");
                    System.out.println("Thanks for using Shreya'a Application");
                    break;
                }
            }
        }

        
    }
}