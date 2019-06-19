import java.util.*;
class FirstDay
{
    public static void main (String S[])
    {
        Scanner SC = new Scanner (System.in);
        System.out.println("Enter the Year");
        int uyear,leapy=0,nyear=0,tnd;
        uyear = SC.nextInt();
        for(int i = 1;i<=uyear-1;i++)
        {
            if(i%4==0)
            {
                leapy++;
            }
            else
            {
                nyear++;
            }
        }
        tnd=(leapy*366)+(nyear*365);
        int day  = tnd%7;
        System.out.println(day);
        switch(day)
        {
            case 0:
            System.out.println("Sunday");
            break;
            
            case 1:
            System.out.println("Monday");
            break;
            
            case 2:
            System.out.println("Tuesday");
            break;
            
            case 3:
            System.out.println("Wednesday");
            break;
            
            case 4:
            System.out.println("Thursday");
            break;
            
            case 5:
            System.out.println("Friday");
            break;
            
            case 6:
            System.out.println("Saturday");
            break;
        }
    }
}