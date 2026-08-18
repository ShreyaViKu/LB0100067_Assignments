/*
Annual Tax Calculator
up to 250000 -> 0%
250001 to 500000 -> 5%
500001 to 1000000 -> 20%
Above 1000000 -> 30%
*/

import java.util.*;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int income = 0, Tax = 0;

        System.out.println("Enter Annual income : ");
        income = sobj.nextInt();

        if(income < 0)
        {
            System.out.println("Invalid income");
            sobj.close();
            return;
        }

        if(income <= 250000)
        {
            Tax = 0;
        }
        else if(income > 250000 && income <= 500000)
        {
            Tax = ((income - 250000)* 5) / 100;
        }
        else if( income > 500000 && income <= 1000000)
        {
            Tax = ((250000 *5)+((income-500000)*20)) / 100;
        }
        else
        {
            Tax = ((250000 *5)+(500000 * 20) +((income-1000000) * 30)) / 100;
        }
        System.out.println("Annual Income : "+income+" rs");
        System.out.println("Total Tax Payable : "+Tax+" rs");

        sobj.close();
    }
}