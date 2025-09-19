package Constructors;

public class Bank 
{
    double minBal;
    Bank()
    {
        System.out.println("Creating bank account..");
        minBal=1000;
        minBal-=1500;
    }
    public Bank(double minBal)
    {
         this.minBal=minBal;
    }
    public double method()
    {
        return minBal;
    }
    public static void main(String[] args) {
        Bank c1=new Bank();
        System.out.println(c1.minBal);
        Bank c2=new Bank(2000);
        System.err.println(c2.minBal);
        
    }
    
}
