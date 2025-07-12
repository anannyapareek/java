import java.util.*;
import java.io.*;
class userdetails
{
     long mob_no;
     String Houseno,roadno,pincode,buildname,city,state,name;
    void user_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        name=sc.nextLine();
        System.out.println("Enter the Delivery Address");
        System.out.println("Enter the House Number");
        Houseno=sc.nextLine();
        System.out.println("Enter the Road Number");
        roadno=sc.nextLine();
        System.out.println("Enter the Pin Code ");
        pincode=sc.nextLine(); 
        System.out.println("Enter the City");
        city=sc.nextLine(); 
        System.out.println("Enter the State");
        state=sc.nextLine();  
        System.out.println("Enter your Mobile Number");
        mob_no=sc.nextLong();
    }
    void check_mobno()
    {
        Scanner sc=new Scanner(System.in);
        int j=0;
        for(int i=0;i<10;i++)
        {
            long rem=mob_no%10;
            j++;
            mob_no=mob_no/10;
        }
        if(j!=10)
        {
            mob_no=0;
            System.out.println("Wrong Input");
            System.out.println("Enter number again");
            mob_no=sc.nextInt();
            check_mobno();
        }
    }
    void customerdirectory() throws IOException
    {
        
         FileWriter FW=new FileWriter("CustomerDirectory.dat",true);
         BufferedWriter BW=new BufferedWriter(FW);
         PrintWriter PW=new PrintWriter(BW);
         PW.println(name);
         PW.println("House Number:"+Houseno);
         PW.println("Road number:"+roadno);
         PW.println("Pincode :"+pincode);
         PW.println("Building Name :"+buildname);
         PW.println("City :"+city);
         PW.println("State :"+state);
         PW.println("Mobile Number: "+mob_no);
         PW.close();
         BW.close();
         FW.close();
    }
}
        
