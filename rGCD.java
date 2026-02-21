
public class rGCD
{
    public static int GCD(int p, int q)
    {
        if(p==0)
            return q;
            return GCD(q%p,p);
    }

    
    public static void main(String args[])
    {
        rGCD obj= new rGCD();
        
    }}
