class Table_using_nested_loop
{
public static void main (String []args)
     {
         int i,j;
         int table;
         for(i=1;i<=10;i++)
         {
             for(j=1;j<=10;j++)
             {
                 table = i*j;
                 System.out.print(table+"   ");
                }
                System.out.println();
            }
            
        }
    }