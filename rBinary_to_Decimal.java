
public class rBinary_to_Decimal
{
    public static int rBinary_to_Decimal(int binary)
    {
        if(binary==0)
        {
            return 0;
        }
        return (binary%10 +2*rBinary_to_Decimal(binary/10));
    }

    public static void main(String args[])
    {
        rBinary_to_Decimal obj= new rBinary_to_Decimal();
        System.out.println("1001 \t"+rBinary_to_Decimal(1001));
    }
}
