/*
Fitness app recorder 
IP : 7 integer
OP : Goal achieved days and maximum steps in week
*/

import java.util.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[7];
        int max = 0, GoalAchieved = 0;
        boolean valid = true;

        System.out.println("Enter steps for the week : ");

        for(int i = 0; i < 7; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0)
            {
                System.out.println("Invalid step input");
                valid = false;
                break;
            }
        }

        if(valid)
        {
            for (int i : Arr)
            {
                if( i > max)
                {
                    max = i;
                }
                if(i != 0)
                {
                    GoalAchieved++;
                }
            }

            System.out.println("Goal Achieved Days : "+GoalAchieved);

            System.out.println("Maximum steps in week : "+max);
        }
  
    }
    
}
