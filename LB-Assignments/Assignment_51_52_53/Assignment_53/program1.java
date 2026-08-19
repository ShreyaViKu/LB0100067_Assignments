/*
Student performance analyzer using 2D matrix
Rows -> students
Columns -> Subjects
Calculate total marks of each student , identify the topper 
calculate average marks for each subject, students who failed in any exa,(< 35)
*/

import java.util.*;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int N = 0, M = 0;
        int i = 0, j = 0, iTotal = 0, Max = 0, TIndex = 0, Avg = 0;

        System.out.println("Enter number of students : ");
        N = sobj.nextInt();

        System.out.println("Enter Number of subjects : ");
        M = sobj.nextInt();

        int Arr[][] = new int[N][M];

        System.out.println("Enter marks of students in Matrix format : ");
        for(i = 0; i < N; i++)
        {
            for(j = 0; j< M; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Students with marks are as follow : ");
        for(i = 0; i < N; i++)
        {
            for(j = 0; j< M; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Students Total : ");

        for(i = 0; i < N; i++)
        {
            for(j = 0; j< M ; j++)
            {
                iTotal = iTotal + Arr[i][j];
            }
            System.out.println("Student "+(i+1)+" : "+iTotal);
            if(iTotal > Max)
            {
                Max = iTotal;
                TIndex = i;
            }
            iTotal = 0;
        }

        System.out.println("Topper : Student "+(TIndex+1));

        System.out.println("Subjects average : ");
        for(j = 0; j < M; j++)
        {
            for(i = 0; i < N; i++)
            {
                iTotal = iTotal + Arr[i][j];
            }
            Avg = iTotal / N;
            System.out.println("Subject "+(j+1)+" : "+Avg);
            iTotal = 0;
        }

        System.out.println("Students Failed : ");
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < M; j++)
            {
                if(Arr[i][j] < 35)
                {
                    System.out.println("Student "+(i+1));
                    break;
                }
            }
        }
    }
}