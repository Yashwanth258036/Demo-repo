package BasicPrograms;

public class incement_decrement
 
{
    public static void main(String[] args) 
    {
        int x = 15; 
  System.out.println(++x + x++);  
  System.out.println(x);     
        System.out.println(".................."); 
  
  int y = 15; 
  System.out.println(++y + ++y);  
  System.out.println(y); 
  
  char ch ='A'; 
  int num=(int)ch++; 
  System.out.println(ch+" : "+num);  
  int z = 5; 
    if(++z > 5 && ++z > 6)   //Logical OR 
    { 
     z++; 
    } 
    System.out.println(z);  //7 
 
          System.out.println("................"); 
 
    z = 5; 
    if(++z > 5 & ++z > 6)   //Boolean OR 
    { 
     z++; 
    } 
    System.out.println(z); //8
        
    }
    
}
