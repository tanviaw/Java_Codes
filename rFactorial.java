
public class rFactorial
{
    public static int Factorial(int n)
    {
        if(n==0)
        { return 1;
    }
    return (n*Factorial(n-1));
}

    public static void main(String args[])
    {
        rFactorial obj= new rFactorial();
        int fact=5;
        int num=Factorial(fact);
        System.out.println("Fac of 5\t" +num);
}
}