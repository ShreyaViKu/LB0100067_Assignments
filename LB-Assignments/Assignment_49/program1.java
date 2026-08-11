import java.io.*;
import java.util.*;

import org.xml.sax.SAXException;

class program1
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        String fname = null;
        String foldername = null;

        File fobjfolder = null;
        File fobjfile = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Buffer[] = new byte[100];
        int iRet = 0;

        System.out.println("Enter Folder name : ");
        foldername = sobj.nextLine();

        System.out.println("Enter file name to be packed in : ");
        fname = sobj.nextLine();

        fobjfolder = new File(foldername);

        if(fobjfolder.exists() && fobjfolder.isDirectory())
        {
            fobjfile = new File(fname);
            foobj = new FileOutputStream(fobjfile);
            

            File fArr[] = fobjfolder.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    fiobj = new FileInputStream(fArr[i]);

                    String header = null;

                    header = header + fArr[i].getName();
                    header = header + " ";
                    header = header + fArr[i].length();

                    foobj.write(header.getBytes(),0,header.length());

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                    fiobj.close();

                }
            }
            foobj.close();
            System.out.println("Packing done successfully");
        }
        else
        {
            System.err.println("Folder "+foldername+" Can not be found");
        }



    }
    
}
