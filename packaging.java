import java.util.*;
import java.io.*;
class packaging
{
    area a=new area();
    int growth,shrink,wash,after_wash,new_area,quantity,check;
    String cloth[];
    String Fabric_1,Fabric_2,terms;
    float quantity_fab_1,quantity_fab_2,total;

    void input()
    {
        String[] fab={"Cotton","Organic Cotton","Polyester"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the fabric from cotton,organic cotton,polyester");
        System.out.println("Enter the name of the 1st fabric");
        Fabric_1=sc.nextLine();
        System.out.println("Enter the name of the 2nd Fabric");
        Fabric_2=sc.nextLine();
        for(int i=0;i<3;i++)
          {
            if(Fabric_1.equalsIgnoreCase(fab[i]) || Fabric_2.equalsIgnoreCase(fab[i]))
            {
                check=1;
            }
         }
         if(check==0)
         {
           System.out.println("Wrong Input!");
           System.exit(0);
         }
        System.out.println("Enter the quantity of the 1st fabric");
        quantity_fab_1=sc.nextInt();
        System.out.println("Enter the quantity of the 2nd Fabric");
        quantity_fab_2=sc.nextInt();
        System.out.println("Enter length of fabric before washing");
        wash=sc.nextInt();
        System.out.println("Enter length of Fabic after washing");
        after_wash=sc.nextInt();
    }
    void calculatePercentage()
    {
        total=(quantity_fab_1+quantity_fab_2);
        System.out.println("Percentage of 1st fabric: "+(quantity_fab_1/total)*100.0);
        System.out.println("Percentage of 2nd fabric: "+(quantity_fab_2/total)*100.0);
    } 
    void afterwash()
    {
        if(Fabric_1.equalsIgnoreCase("organic cotton")||Fabric_1.equalsIgnoreCase("polyester")||Fabric_1.equalsIgnoreCase("cotton"))
        {
            if(wash<after_wash)
            {
                growth=(int)(after_wash-wash);
                System.out.println("The growth of the cloth is "+growth);
            }
            else 
            {
                shrink=(int)(wash-after_wash);
                System.out.println("The shrink of the cloth is "+shrink);
            }
        }
    }
    void extra_area()
    {
        int temp_area=a.calculate_tshirt_area();
        new_area=growth>0?(int)temp_area+growth:(int)temp_area-shrink;
    }
}
    
 
           
        
        
    
                
                
