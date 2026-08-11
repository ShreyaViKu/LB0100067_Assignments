/*
take directory name from user
and display all files and folders with size
*/
import java.util.*;
import java.io.*;

class program5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter folder name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);
        
        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    System.out.println("Filename : "+fArr[i].getName());
                    System.out.println("File size : "+fArr[i].length());
                }
                if(fArr[i].isDirectory())
                {
                    System.out.println("Folder ename : "+fArr[i].getName());
                    System.out.println("Folder size : "+fArr[i].length());
                }
                
            }

        }
        
    }
}