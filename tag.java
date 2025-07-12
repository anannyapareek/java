import java.util.*;
class tag
{
    String size;
    area aa=new area();
    String require[]=new String[5];
    String store[]={"Washable","Ironable","dryer","hand-wash","machine wash"};
    int check;
    void size()
    {
        if(aa.calculate_tshirt_area()<500)
        {
            size="Small";
            System.out.println(size);
            String letter=aa.extract_letter(size,1,0);
        }
        else if(aa.calculate_tshirt_area()>500 && aa.calculate_tshirt_area()<700)
        {
            size="Medium";
            System.out.println(size);
            String letter=aa.extract_letter(size,1,0);
        }
        else if(aa.calculate_tshirt_area()>700)
        {
            size="Large";
            System.out.println(size);
            String letter=aa.extract_letter(size,1,0);
        }
     }
    void tag_requirements(int i)
    {
        try
        {
          if(i>4)
          {
               return;
          }
          else
          {   
            Scanner sc=new Scanner(System.in); 
            System.out.println("Choose 1 for true and 2 for false ");
            System.out.println(store[i]+" ?");
            check=sc.nextInt();
            require[i]=check==1?store[i]:store[i]+" not";
            System.out.println(require[i]);
          }
          tag_requirements(i+1);
        }
        catch(IndexOutOfBoundsException Iobe)
        {
           System.out.print("");
        }
    }
}
    
    
    