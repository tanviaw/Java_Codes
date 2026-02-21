import java.util.Scanner;
public class rFibonacci
{
    static int n1=0,n2=1,n3=0;
    public void fi(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fi(count-1);
        }
    }
        public static void main(String args[])
    {
        rFibonacci obj=new rFibonacci();
        System.out.print(n1+ " "+n2);
        obj.fi(10);
        
    }
    }
