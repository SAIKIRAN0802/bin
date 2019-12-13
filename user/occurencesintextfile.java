import java.io.*;
import java.util.*;
public class occurencesintextfile {
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\KIRAN\\OneDrive\\Desktop\\text.txt");
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter pattern");
		String pat=sc.nextLine();
		LineNumberReader r=new LineNumberReader(fr);
		String line;
		while((line=r.readLine())!=null)
		{
			for(String s:line.split(" "))
			{
				if(s.equalsIgnoreCase(pat))
					count++;
			}
		}
		System.out.println(pat+" appeared "+count+" times");
	}
}
