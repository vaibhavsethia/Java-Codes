import java.io.*;
class FileTest2
{
public static void main(String S[])
{
try{
File f = new File("abc.txt");
FileOutputStream fout = new FileOutputStream(f);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("Enter text to writein File\nPress only enter to terminate");
String str = br.readLine();
if(str.length()==0)
break;

byte b[] = str.getBytes();
fout.write(b);
}
}catch(Exception e)
{
System.out.println(e);
}
}
}	