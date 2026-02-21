import java.util.Scanner;
public class rTribonaaci
{
    static int n1=0,n2=0,n3=1, n4=0;
    public void tri(int count)
    {
        if(count>0)
        {
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
            System.out.print(" "+n4);
            tri(count-1);
        }
    }
        public static void main(String args[])
    {
        rTribonaaci obj=new rTribonaaci();
        System.out.print(n1+ " "+n2+" '"+n3);
        obj.tri(10);
        
    }
    }
