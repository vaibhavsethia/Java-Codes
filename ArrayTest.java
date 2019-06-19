import java.io.*;
class ArrayTest
{
public static void main (String S[])
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a[][]= new int[3][3];
System.out.println("Enter elements");
try
{
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
}
catch(Exception e)
{
}
System.out.println();
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}
