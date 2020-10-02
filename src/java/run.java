import java.io.*;
class run
{
	public static void main(String g[])
	{
		InputStream is;
		int c;
		try{
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("java ");
			is=p.getInputStream();
			c=is.read();
			while(c!=-1){	System.out.print((char)c); c=is.read();}
		}
		catch(Exception e){ System.out.println(e);}
	}
}