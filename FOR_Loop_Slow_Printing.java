class FOR_Loop_Slow_Printing
{
    public static void main (String S[])
    {
        int i=1;
        for( ;i<=10;i++)
        {
            System.out.println(i);
            try
            {
            Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}