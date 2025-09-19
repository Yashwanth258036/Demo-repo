package Constructors;

public class Override {

    int x;
    int y;
    Override()
    {
System.out.println("Defalut cons");
    }
    Override(int x,int y)
    {
        System.out.println("Sum is : "+ (x+y));
    }
    Override(int x,double y)
    {
        System.out.println("Sume is "+(x+y));
    }
    Override(double x, int y)
    {
        System.out.println("Sum is : "+(x+y));

    }
    Override(int x,int y,int z )
    {
        System.out.println("sume is "+(x+y+z));
    }
    public static void main(String[] args) {
        Override o1=new Override();
        Override o2=new Override(10,2.9);
        Override o3=new Override(2.5,24);
        Override o4=new Override(10,24);
        Override o5=new Override(1,2,3);

        
    }
    
}
