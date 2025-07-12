import java.util.*;
import java.io.*;
class garments
{
   void create() throws IOException
   {
          userdetails UD=new userdetails();
          packaging PP=new packaging();
          tag TT=new tag();
          area AA=new area();
          costsheet CS=new costsheet();
          termsandcondition TAC=new termsandcondition();
          UD.user_details();
          UD.check_mobno();
          UD.customerdirectory();
          PP.input();
          PP.calculatePercentage();
          AA.input_dimensions();
          AA.calculate_tshirt_area();
          AA.colour();
          AA.choosefont();
          PP.afterwash();
          PP.extra_area();          
          AA.calculate_tshirt_area();
          TT.size();
          TT.tag_requirements(0);
          CS.totalcost();
          CS.creation();
          CS.addition();
          TAC.condition();
          TAC.data_mention();
   }
   public static void main(String args[]) throws IOException
   {
      Scanner sc=new Scanner(System.in);
      garments tshirts=new garments();
      System.out.println("WELCOME TO CREATE YOUR OWN TEE");
      System.out.println("Delivery will take place in maximum next 5 to 15 days");
      tshirts.create();
      System.out.println("THANK YOU!!!");
      System.out.println("Hoping to see you soon:)))"); 
    }
}
             
            
            