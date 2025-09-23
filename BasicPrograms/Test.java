package BasicPrograms;

public class Test 
{
    Integer x = 24;   
    Integer y = 24; 
    Integer z = x + y; 
    public static void main(String[] args) 
    {
        System.out.println(new Test().x);
        System.out.println("\n Byte range:"); 
  System.out.println(" min: " + Byte.MIN_VALUE); 
  System.out.println(" max: " + Byte.MAX_VALUE); 
  System.out.println(" size :"+Byte.SIZE); 
  
  System.out.println("\n Short range:"); 
  System.out.println(" min: " + Short.MIN_VALUE); 
  System.out.println(" max: " + Short.MAX_VALUE); 
  System.out.println(" size :"+Short.SIZE); 
 
  System.out.println("\n Integer range:"); 
  System.out.println(" min: " + Integer.MIN_VALUE); 
  System.out.println(" max: " + Integer.MAX_VALUE); 
  System.out.println(" size :"+Integer.SIZE); 
 
  System.out.println("\n Long range:"); 
  System.out.println(" min: " + Long.MIN_VALUE); 
  System.out.println(" max: " + Long.MAX_VALUE); 
  System.out.println(" size :"+Long.SIZE);
  int x = 'A';  
    int y = 'B'; 
    System.out.println(x+y);  
 System.out.println('A' + 'A');  
    }
    
}
