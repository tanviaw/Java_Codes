
public class rSumofEvenOdd
{
    public static int rSumofEvenOdd(int a, int b)
    {
        if(a>b)
        {
            return 0;
        }
        System.out.println(a+" ");
        return rSumofEvenOdd(a+2,b);
    }
     public static void main(String args[])
    {
        rSumofEvenOdd obj= new rSumofEvenOdd();
        
        rSumofEvenOdd(1,20);
    }
}
