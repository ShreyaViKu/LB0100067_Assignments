/*
A bank ATM
IP : first current balance and second withdrawal amount
WA must be multiple of 100
mazimum withdrawal per transaction is 2500
after withdrawal balance must remain atleast 1000
*/

import java.util.*;

class program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iWithdraw = 0;

        System.out.println("Enter Balance of customer :");
        int iBalance = sobj.nextInt();

        while(true)
        {
            System.out.println("Enter withdrawal amount : ");
            iWithdraw = sobj.nextInt();
            
            if(iWithdraw < 0 || iWithdraw > iBalance)
            {
                System.out.println("Invalid Input");
            }
            else if(iWithdraw % 100 != 0)
            {
                System.out.println("Transaction failed : withdrawal amount not multiple of 100");
            }
            else if(iWithdraw > 25000)
            {
                System.out.println("Transaction failed : withdrawal amount greater than limit 2500");
            }
            else if(iWithdraw == -1)
            {
                System.out.println("Termination of code");
                System.out.println("Thanks for using Shreya's ATM");
                break;
            }
            else
            {
                if(iBalance-iWithdraw < 1000)
                {
                    System.out.println("Transaction failed : Minimum balalnce must be maintained to 1000");
                    continue;
                }

                iBalance = iBalance - iWithdraw;
                if(iBalance == 1000)
                {
                    System.out.println("Minimum balance reached so no more transactions");
                    break;
                }
                System.out.println("Remaining Balance : "+ iBalance+" rs");
            }

        }
        
    }
}