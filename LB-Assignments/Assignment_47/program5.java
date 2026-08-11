import java.io.*;
import java.util.Scanner;

public class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        String DName = sobj.nextLine();

        File fobj = new File(DName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File arr[] = fobj.listFiles();

            for(int i = 0; i<arr.length; i++)
            {
                if(arr[i].isFile())
                {
                    System.out.println(arr[i].getName() + " is a file");
                }
                else
                {
                    System.out.println(arr[i].getName() + " is a directory");
                }
            }
        }
    }
    
}
