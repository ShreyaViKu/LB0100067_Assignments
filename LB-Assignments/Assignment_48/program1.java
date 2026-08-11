/*
take 2 file name from user and
copy content of first to second file
*/

import java.util.*;
import java.io.*;

class program1
{
    public static void main(String[] args)throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String f1name = null, f2name = null;
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        System.out.println("Enter first filename : ");
        f1name = sobj.nextLine();

        System.out.println("Enter second filename : ");
        f2name = sobj.nextLine();

        File f1obj = new File(f1name);
        File f2obj = new File(f2name);

        if(f1obj.exists() && f1obj.isFile())
        {
            f2obj.createNewFile();

            FileInputStream fiobj = new FileInputStream(f1obj);

            FileOutputStream foobj = new FileOutputStream(f2obj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
            fiobj.close();
            foobj.close();

        }
    }
}