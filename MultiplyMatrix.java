import java.util.Scanner;

class MultiplyMatrix
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int res[][] = new int[3][3];
		int temp;
		System.out.println("Enter elements of Matrix A");
		for(int i = 0;i<3;i++)
		{	
			for(int j = 0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of Matrix B");
		for(int i = 0;i<3;i++)
		{	
			for(int j = 0;j<3;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		//Multiplying matrix now
		System.out.println();
		for (int i = 0; i < 3; i++)
        		{
            			for (int j = 0; j < 3; j++)
           			 {
    			            for (int k = 0; k < 3; k++)
                	                 		            {
                  		  	res[i][j] = res[i][j] + a[i][k] * b[k][j];
                			            }
            			}
   		}
	
		System.out.println("The product is:");
        		for (int i = 0; i < 3; i++)
       		 {
       		     for (int j = 0; j < 3; j++)
           		    {
                			System.out.print(res[i][j] + " ");
            	                     }
           	                     System.out.println();
		}
	}
}