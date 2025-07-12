import java.util.*;
import java.io.*;
class termsandcondition
{
    tag tt=new tag();
    area aa=new area();
    packaging pp=new packaging();
    userdetails ud=new userdetails();
    String terms="The order and all the minute details are in this file. By signing this piece of paper you agree that all the details in this are final and accurate"; 
    void condition() throws IOException
    {
    try
      {
        FileReader FRR=new FileReader("terms_andconditions.dat");
        BufferedReader BRR=new BufferedReader(FRR);
        FileWriter FW=new FileWriter("terms_conditions.dat");
        BufferedWriter BW=new BufferedWriter(FW);
        PrintWriter PWW=new PrintWriter(BW);
        Scanner sc=new Scanner(System.in);
        PWW.println(terms);
        BW.close();
        FW.close();
        BRR.close();
        FRR.close();
      }
     catch(IOException oog)
     {
        System.out.println(" ");
     }
    }
    void data_mention() throws IOException
    {
        FileWriter FW=new FileWriter("terms_conditions.dat");
        BufferedWriter BW=new BufferedWriter(FW);
        PrintWriter PWW=new PrintWriter(BW);
        PWW.println("Name: "+ud.name);
        PWW.println("Moblie number of user"+ud.mob_no);
        PWW.println("Fabric one: "+pp.Fabric_1);
        PWW.println("Fabric two: "+pp.Fabric_2);
        PWW.println("The area of t-shirts after shrink/expand: "+pp.new_area);
        PWW.println("The font to be printed is:"+aa.font);
        PWW.println("The colour of the t-shirt is"+aa.colour);
        for(int i=0;i<5;i++)
       {
        PWW.println(tt.require[i]);
        }
        PWW.close();
        BW.close();
        FW.close();
  }
}
        
        
        
        
        
         
        