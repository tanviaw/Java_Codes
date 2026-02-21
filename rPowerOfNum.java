
public class rPowerOfNum
{
    public static int PowerOfNum(int a, int b)
    {
        if(b==0){
            return 1;
        }
        return a*PowerOfNum(a,b-1);
    }

    public static void main(String args[])
    {
        rPowerOfNum obj= new rPowerOfNum();
        
    }
}
