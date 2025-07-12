import java.util.*;
import java.io.*;
class costsheet
{
    String tt[][]=new String[3][6];
    float temp,temp2,sum;
   void totalcost()
    {
        Scanner sc=new Scanner(System.in);
        tt[0][0]="Consumption rate";
        tt[0][1]="Quantity";
        tt[0][2]="Fabric/Stiching cost";
        tt[0][3]="Printing cost";
        tt[0][4]="tag/packaging cost";
        tt[0][5]="total";
        for(int i=0;i<5;i++)
        {
           System.out.println("Enter " +tt[0][i] +" in decimal");
           tt[1][i]=sc.nextLine();
        }
  }
    void creation() throws IOException
    {
     try
     {
        FileOutputStream FO=new FileOutputStream("CostSheet.dat",true);
        DataOutputStream Do=new DataOutputStream(FO);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
           Do.writeUTF(tt[0][i]);
        }
        for(int k=0;k<5;k++)
        {
            temp=Float.parseFloat(tt[1][k]);
            Do.writeFloat(temp);
        }
        Do.close();
        FO.close();
     }
     catch(NullPointerException ghj)
     {
        System.out.println(); 
     }
     catch(IOException fgd)
     {
        System.out.println();
     }
    }
    void addition() throws IOException
    {
        try
        {
        FileInputStream FIS=new FileInputStream("CostSheet.dat");
        DataInputStream DIS=new DataInputStream(FIS);
        FileOutputStream FO=new FileOutputStream("CostSheet.dat",true);
        DataOutputStream Do=new DataOutputStream(FO);
        Scanner sc=new Scanner(System.in);
        for(int i=2;i<4;i++)
        {
            temp2=Float.parseFloat(tt[1][i]);
            temp2=DIS.readFloat();
            sum=sum+temp2;
        }
        tt[1][5]=Float.toString(sum);
        Do.writeFloat(sum);
        System.out.println("The sum of the total is "+sum);
        Do.close();
        FO.close();
        DIS.close();
        FIS.close();
        }
        catch
        (EOFException hii)
        {
            System.out.println("");      
         }
      }
  }


                
    