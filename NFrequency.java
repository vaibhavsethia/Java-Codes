class Nfrequency
{
public static void main(String S[])
{
int count=0;
int s = Integer.parseInt(S[0]);
for(int i=0;i<S.length;i++)
{
int a = Integer.parseInt(S[i]);
if(s==a)
{
count++;
}
}
System.out.println("Repetition is "+count);
}
}