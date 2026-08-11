import java.util.*;
import java.io.*;

class program2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter file name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println(fname+" is a regular file");
        }
        else
        {
            System.out.println(fname+" is not a regular file");
        }
        
    }
}