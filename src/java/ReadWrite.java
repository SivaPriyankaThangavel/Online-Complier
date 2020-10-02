import java.io.*;
class ReadWrite
{
	FileInputStream fis;
	FileOutputStream fos;
	public String getContent(String file)
	{
		char c[];
		try
		{
			fis=new FileInputStream(file);
			c=new char[fis.available()];
			for(int i=0;fis.available()>0;i++)
			{
				c[i]=(char)fis.read();
			}
			return String.valueOf(c);
		}
		catch(Exception e)
		{
			return String.valueOf(e);
		}
	}
	public void putContent(String file,String cc)
	{
		try
		{
			fos=new FileOutputStream(file);
			
			for(int i=0;i<cc.length();i++)
			{
				fos.write(cc.charAt(i));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
