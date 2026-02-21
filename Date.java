import java.io.*;
import java.util.*;
class Date
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,day,year,i,p,z=0;
        int ar[]={0,31,59,90,120,151,181,212,243,273,304,334,365};
         String  m[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter Day Number");
        day= in.nextInt(); // Input Day Number
        System.out.println("Enter N Number");
        n=in.nextInt(); // Input N number of days
        System.out.println("Enter Year");
        year=in.nextInt(); // Input Year
        p=day+n; // Storing Day no. after N days
        int a=1,b=1,date=0,nday=0,year1=year;
        if(year%4==0) //Condition for Leap year
        {
            for(i=2;i<=12;i++)
            {
                ar[i]+=1;
            }
            if(day>=1&&day<=366) // condition for correct day number
            {
                for(i=0;i<=12;i++)
                {
                    if(ar[i]<day)
                    {
                        a=i;
                    }
                    if(ar[i]>day)
                    {
                        break;
                    }
                }
                date=day-ar[a]; // Calculating Date
            }
            else
            {
                z=1;
            }
            if(z==1)
            {
                System.out.println("Days are Out of Range");
            }
            else if(z!=1 && n>=1&&n<=100)
            {
                if(p>ar[12])
                {
                    p=p-ar[12];
                    year1=year1+1;
                }
                for(i=0;i<=12;i++)
                {
                    if(ar[i]<p)
                    {
                        b=i;
                    }
                    if(ar[i]>p)
                    {
                        break;
                    }
                }
                nday=p-ar[b]; //Storing date after n days.
            }
            else
            {
                z=1;
                System.out.println("N Days are Out of range ");
            }
            if(z!=1)
            {
                System.out.println("Date is : "+date+" TH " + m[a+1]+" "+year); //printing date
                System.out.println("N Date is : "+nday+" TH " + m[b+1]+" "+year1);// printing date after n days
            }
        }
        else
        {
            if(day>=1&&day<=365)
            {
                for(i=0;i<=12;i++)
                {
                    if(ar[i]<day)
                    {
                        a=i;
                    }
                    if(ar[i]>day)
                    {
                        break;
                    }
                }
                date=day-ar[a]; //calculating & storing date
            }
            else
            {
                z=1;
            }
            if(z==1)
            {
                System.out.println("Days are Out of Range");
            }
            if(n>=1&&n<=100)
            {
                if(p>ar[12])
                {
                    p=p-ar[12];
                    year1=year1+1;
                }
                for(i=0;i<=12;i++)
                {
                    if(ar[i]<p)
                    {
                        b=i;
                    }
                    if(ar[i]>p)
                    {
                        break;
                    }
                }
                nday=p-ar[b];
            }
            else
            {
                z=1;
                System.out.println("N Days are Out of range ");
            }
            if(z!=1)
            {
                System.out.println("Date is : "+date+" TH " + m[a+1]+" "+year); //printing date
                System.out.println("N Date is : "+nday+" TH " + m[b+1]+" "+year1);// printing date after n days
            }
        }
    } // end of main method
} // end of class  