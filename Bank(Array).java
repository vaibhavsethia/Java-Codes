import java.io.*;

class bank
{
int accno,bal;
String name;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

void deposite() throws IOException
{
System.out.print("\nEnter the amount to deposite:\t");
int amt=Integer.parseInt(br.readLine());
	
	bal=bal+amt;
	
	System.out.print("\nRemaining balance=\t"+bal);
	System.out.print("\nThankyou for visit");
}

void widraw() throws IOException
{
System.out.print("\nEnter the amount to widraw:\t");
int amt=Integer.parseInt(br.readLine());
	if(bal>amt)
	{
	bal=bal-amt;
	}
	
	else
	System.out.print("\nInsufficient balance");
	System.out.print("\nRemaining balance=\t"+bal);
	System.out.print("\nThankyou for visit");
}

void detail() throws IOException
{

System.out.print("\n\t\tEnter the account number\t");
accno=Integer.parseInt(br.readLine());
System.out.print("\n\t\tEnter the balance\t");
bal=Integer.parseInt(br.readLine());
System.out.print("\n\t\tEnter the name\t");
name=br.readLine();

}

void enquiry()
{
	System.out.print("\nAccont=\t"+accno);
	System.out.print("\nBalanace=\t"+bal);
	System.out.print("\nName=\t"+name);
}

}

class Banktest
{
public static void main(String s[]) throws IOException
{
bank b1[]=new bank[30];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int i,count=0;
	for(i=0;i<1;i++)
	{
	b1[i]=new bank();
	b1[i].detail();
	count++;
	}

while(true)
{
	System.out.print("\n\n\t\tMAIN MENU");
	System.out.print("\n\n\t\t1.Add Customer");
	System.out.print("\n\n\t\t2.Account Details");
	System.out.print("\n\n\t\t3.Widraw");
	System.out.print("\n\n\t\t4.Deposite");
	System.out.print("\n\n\t\tExit");
	System.out.print("\n\t\tEnter your choice:\t");
	int choice=Integer.parseInt(br.readLine());
	int ac;
	switch(choice)
		{
		case 1: b1[count]=new bank();
			b1[count].detail();
			count++;
			break;

		case 2: System.out.print("\n\tEnter acccno:\t");
			ac=Integer.parseInt(br.readLine());
			for(i=0;i<count;i++)
				{
					if(b1[i].accno==ac)
						{
							b1[i].enquiry();
							break;
						}
				}
			break;

		case 3: System.out.print("\n\tEnter accno:\t");
			ac=Integer.parseInt(br.readLine());
			for(i=0;i<count;i++)
				{
					if(b1[i].accno==ac)
						{
							b1[i].widraw();
							break;
						}
				}
			break;

		case 4:	System.out.print("\n\tEnter accno:\t");
			ac=Integer.parseInt(br.readLine());
			for(i=0;i<count;i++)
				{
					if(b1[i].accno==ac)
						{
							b1[i].deposite();
							break;
						}
				}
			break;

		case 5: System.exit(0);
		}
}


}
}