/*
write a program to display grade of student based on marks
*/
import java.util.*;

class Logic 
{
    char DisplayGrade(int iNo)
    {
        char cGrade = '\0';

        if(iNo < 40)
        {
            cGrade = 'F';
        }
        else if(iNo < 60)
        {
            cGrade = 'C';
        }
        else if(iNo < 70)
        {
            cGrade = 'C';
        }
        else if(iNo < 80)
        {
            cGrade = 'B';
        }
        else if(iNo < 90)
        {
            cGrade = 'A';
        }
        else
        {
            cGrade = 'O';
        }
        return cGrade;
    }
}

class program2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        char cGrade = '\0';

        System.out.println("Enter marks : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();

        cGrade = lobj.DisplayGrade(iValue);

       System.out.println("Grade is "+cGrade);
        
    }
}
