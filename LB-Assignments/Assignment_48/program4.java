/*
take file name from user and calculate checksum
checksum is a value like a hash which
is used to check whether data is altered or not
*/
import java.util.*;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.io.*;
//import java.util.zip.Adler32;
//import java.util.zip.CRC32;

class program4
{
    public static void main(String[] args)throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        Adler32 aobj = new Adler32();
        CRC32 cobj = new CRC32();

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        System.out.println("enter file name : ");
        String fname = sobj.nextLine();

        File fobj = new File(fname);
        FileInputStream fiobj = new FileInputStream(fobj);

        if(fobj.exists())
        {
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                aobj.update(Buffer,0,iRet);
                cobj.update(Buffer,0,iRet);
            }

            System.out.println("Adler checksum : "+aobj.getValue());
            System.out.println("CRC32 checksum : "+cobj.getValue());

            fiobj.close();
        }
        
    }
}