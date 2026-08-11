import java.io.*;
import java.util.Scanner;

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FName;

        System.out.println("Enter file name : ");
        FName = sobj.nextLine();

        try
        {
            File fobj = new File(FName);

            if(fobj.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
