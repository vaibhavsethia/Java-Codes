

import java.io.*;

class FileTest3
{
	public static void main(String s[])throws Exception
	{
		FileInputStream fin=new FileInputStream("FileTest2.java");
		int size=fin.available();
		byte b[]=new byte[size];
		fin.read(b);
		String str=new String(b);
		System.out.println(str);
	}}