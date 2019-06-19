import java.io.*;
class FileTest
{
	public static void main(String S[])
	{
	try{
		File f = new File("pqr.txt");
		System.out.println("File exists "+f.exists());
		f.createNewFile();
		System.out.println("File exists "+f.exists());
		File f1 = new File("Temp");
		f1.mkdir();
		System.out.println("Directory Created");
		File f3 = new File(f1,"MNO.txt");
		f3.createNewFile();
	}catch(Exception e){}
	}
}