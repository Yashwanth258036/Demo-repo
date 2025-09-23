package BasicPrograms;

import java.util.Scanner;

public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0)
         {
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
            System.out.println(rev+": "+num);

            
        }
        System.out.println("Reversed number is "+rev);

        
    }
    
}
