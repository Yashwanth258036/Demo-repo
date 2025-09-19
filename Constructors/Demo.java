package Constructors;

public class Demo 
{
    int x;
    int y;
    Demo()
    {
        System.out.println("Default Constructor called");
        x=25;
        y=25;

    }
    Demo(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
    public int method()
    {
        return x+y;
    }
    public static void main(String[] args) {
        Demo obj1=new Demo();
        System.out.println(""+obj1.x+":"+obj1.y); 
        System.out.println(obj1.method());
        Demo obj2=new Demo(10, 20);
        
        System.out.println(obj2.method());

    }
    
}
