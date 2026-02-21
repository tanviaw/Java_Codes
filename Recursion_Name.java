import java.util.Scanner;
public class Recursion_Name
{
     int name(int i)
    {
        String n="hi";
        return (i<=10)? System.out.println("hi"):name(i+1); 
    }
    public static void main(String args[])
    {
        Recursion_Name obj=new Recursion_Name();
        obj.name(0);
    }
}