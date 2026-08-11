/*
make directory of name taken by user
*/
import java.util.*;
import java.io.*;

class program3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter folder name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        if(fobj.isDirectory())
        {
            System.out.println("Directory already exists");
        }

        if(fobj.mkdir())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("unable to create directory");
        }
        
    }
}