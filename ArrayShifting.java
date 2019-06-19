class ArrayShifting
{
    public static void main (String S[])
    {
        int a[] = {1,2,3,4,5};
        int b[] = new int[6];
        System.out.println("HERE IT IS ::::::::::::::");
        try
        {
         for(int i=0;i<5;i++)
        {
            b[i]=a[i+1];
            if(i==4)
            b[i] = a[0];
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
        }
        catch(Exception e){}
}
}