import java.util.*;
class area
{
    int Bl, Sl, chest, armhole,wastage,Al,area,total_area,colour_no,neck;
    String font,size,print,mix,word,colour;
    int quantity=0;
    area()
    {
         wastage=2;
    }
    void input_dimensions()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Body length size of the t-shirt: ");
        Bl=sc.nextInt();
        System.out.print("Enter the arm length size of the t-shirt: ");
        Al=sc.nextInt();
        System.out.print("Enter the chest size of the t-shirt: ");
        chest=sc.nextInt();
        System.out.print("Enter the armhole size of the t-shirt: ");
        armhole=sc.nextInt();
        System.out.print("Enter the sleeve length of the t-shirt: ");
        Sl=sc.nextInt();
        System.out.println("Area of t-shirt is "+calculate_tshirt_area());
    }
    int calculate_tshirt_area()
    {
        area=(int)((Bl+Sl)*0.5*chest+armhole+Al)*wastage;
        return area;
    }
    void colour()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Choose colour of t-shirt  ");
        System.out.println("1.Black \t 2.White \t 3.grey");
        colour_no=sc.nextInt();
        if(colour_no==1)
            colour="Black";
        else if(colour_no==2)
           colour="White";
        else if(colour_no==3)
           colour="Grey";
        else
           colour="Black";
    }
    String extract_letter(String str,int j,int k)
    {
        String ch="";
        for(int i=k;i<j;i++)
        {
            ch+=str.substring(i,i+1);
        }
        return ch;
    } 
    void choosefont()
    {
         int num;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter font to be printed:");
         font=sc.nextLine();
         System.out.println("Choose 1 for print in capital letters; /n Choose 2 to print in small lettters;/n Choose 3 to print in mix; /n Choose 4 for an alternate");
         int a=sc.nextInt();
        switch(a)
        {
            case 1:
            print=font.toUpperCase();
            break;

            case 2:
            print=font.toLowerCase(); 
            break;

            case 3:
             {
                 String temp_2="";
                for(int i=0;i<font.length();i++)
                {
                    String ch1=extract_letter(font,i+1,i);
                    num=(int)(Math.random()*10);
                    temp_2=(num%2==0)?temp_2+ch1.toUpperCase():temp_2+ch1.toLowerCase();
                }
                print=temp_2;
                break;
             }
            case 4:
            {
                System.out.println("Enter the number of words you entered in font");
                int no_words=sc.nextInt();
                String temp_3="";
                StringTokenizer ss=new StringTokenizer(font," ");
                for(int i=0;i<no_words;i++)
                {
                    word=ss.nextToken();
                    temp_3=(i%2==0)?(temp_3+word.toLowerCase()+" "):(temp_3+word.toUpperCase()+" ");
                }
                print=temp_3;
                break;
            }
        }
        System.out.println("The font to be printed is:"+print);
    }
}

        
    
