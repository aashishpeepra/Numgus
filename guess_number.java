import java.util.*;
class guess_number
{
    static int input;
    static int ans;
    public static void correction()
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        while(true && k!=1)
        {
            System.out.println("Enter the maximum number you want to get generated not more then 100");
            String wow=sc.nextLine();
            try{
                input=Integer.parseInt(wow);
                k=1;
            }
            catch(NumberFormatException ignore)
            {
                System.out.println("Invalid input try integers");
            }
        }
    }
    public static void correction_ans()
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        while(true && k!=1)
        {
            String wow=sc.nextLine();
            try{
                ans=Integer.parseInt(wow);
                k=1;
            }
            catch(NumberFormatException ignore)
            {
                System.out.println("Invalid input try integers");
            }
        }
    }
    public static void guess()
    {
        
        Scanner sc=new Scanner(System.in);correction();
        int num=(int)(Math.random()*input)+1;
        System.out.println("COMPUTER GENERATED THE NUMBER ! GAME STARTS --------");
        int choice=10;
         ans=0;
        int k=0;
        while(choice!=0)
        {
            System.out.println("CHANCE: "+choice+" ENTER YOUR GUESS");
            correction_ans();
            if(ans==num)
            {
                System.out.println("YOU WON!!"); 
                k=1;
                break;
            }
            else if(ans<num)
            {
                System.out.println("Number is bigger then your guess ");
            }
            else if(ans>num)
            {
                System.out.println("Number is smaller then your guess");
            }
            choice--;
        }
        if(k==0)
        {
            System.out.println("THE NUMBER WAS :"+num);
        }
        else
        {
            System.out.println("WELL PLAYED..............");
        }
    }
}