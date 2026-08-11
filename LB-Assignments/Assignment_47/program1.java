import java.io.*;
import java.util.Scanner;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FName,Data,line;

        System.out.println("Enter File name : ");
        FName = sobj.nextLine();

        try
        {
            File fobj = new File(FName);

            if(fobj.exists())
            {
                FileReader fr = new FileReader(fobj);
                System.out.println("File opened successfully");
                System.out.println("File Contents are : ");

                BufferedReader br = new BufferedReader(fr);

                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
                System.out.println("Enter data to be appended : ");
                Data = sobj.nextLine();

                FileWriter fw = new FileWriter(FName,true);
                fw.write(Data);
                fw.write("\n");

                fw.close();

                FileReader fr2 = new FileReader(fobj);
                BufferedReader br2 = new BufferedReader(fr2);
                

                System.out.println("File contents after Append are : ");
                while((line = br2.readLine()) != null)
                {
                    System.out.println(line);
                }

                br.close();
                br2.close();
                fr.close();
                fr2.close();

            }
            else
            {
                System.out.println("File not exist");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error in opening file "+e);
        }
    }
}