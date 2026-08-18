/*
Loan approval system
Age between 21 and 60
monthly income >= 25000
credit score >= 700
must not have existing unpaid loan

*/

import java.util.*;

class program2
{
    public static void LoanApproval(int Age, int income, int cscore, String Loan)
    {
        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected : Age not valid");
        }
        else if(income < 25000)
        {
            System.out.println("Loan Rejected : Monthly income is less than 25,000");
        }
        else if(cscore < 700)
        {
            System.out.println("Lone Rejected : Credit Score is less than 700");
        }
        else if(Loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected : You have unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0, income = 0, cscore = 0;
        String Loan = null;

        System.out.println("Enter your age : ");
        Age = sobj.nextInt();

        System.out.println("Enter monthly income : ");
        income = sobj.nextInt();

        System.out.println("Enter credit score : ");
        cscore = sobj.nextInt();

        System.out.println("Existing unpaid loan ? Yes/No : ");
        Loan = sobj.next();

        LoanApproval(Age, income, cscore, Loan);
   
        
    }
}