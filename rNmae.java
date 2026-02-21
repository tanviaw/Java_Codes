import java.util.Scanner;
public class rNmae
{
     void n(int i)
    {
        if(i>=10)
             return;
        System.out.println("no");
        n(i+1);
    }
    
    public static void main(String args[])
    {
        rNmae obj=new rNmae();
        obj.n(0);
    }
}