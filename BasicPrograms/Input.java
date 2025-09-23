package BasicPrograms;

import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter Employee Id :"); 
  int id = sc.nextInt(); 
         
        System.out.print("Enter Employee Name :"); 
  String name = sc.nextLine(); //Buffer Problem  
  name = sc.nextLine();  
   
  System.out.println("Employee Id is :"+id); 
  System.out.println("Employee Name is :"+name); 
    }
    
}
