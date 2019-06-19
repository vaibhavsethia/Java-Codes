import java.util.*;
import java.io.*;

class CodeNinja1
{
    public static void main(String args[])
    {
        int t,i;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        System.out.println();
        CodeNinja1 cn = new CodeNinja1();
        double beauty[] = new double[t];
        double input[] = new double[t];
        for(i=0;i<t;i++)
        {
            input[i] = sc.nextDouble();
            System.out.println();
            beauty[i] = cn.func(input[i],i);
            System.out.println();
        }
        for(i=0;i<t;i++)
        {
            System.out.println(beauty[i]);
        }
    }
        
    double func(double d,int n)
    {
        int j=0;
        int d1 = (int)d;
        double fx = (int)(Math.floor(n/d1))^d1;
        CodeNinja1 cn1 = new CodeNinja1();
        double res1[] = new double[cn1.t];
        double fres;    
        res1[j] = fx;
        j++;
        fres=res1[0];
        for(int k=1;k<cn1.t;k++)
        {
            fres = fres^res1[k];
        }
        return fres;
    }
}