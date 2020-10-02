class StringExtract
{
	String s,s1;
	int pos;
	int p;
	StringExtract(String v)
	{
		s=v;
	}
	boolean extract()
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')pos=i;
			
		}
			
		s1=s.substring(pos+1,s.length());
		if(s1.equalsIgnoreCase("java"))
		return true;
		else
		return false;
	}
	String extractClass()
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')pos=i;
			
		}
			
		s1=s.substring(pos+1,s.length());
		if(s1.equalsIgnoreCase("class"))
		return s.substring(0,pos);
		else
		return "null";
	}
	String extractMain(String b) 
	{
		
		for(int i=b.length();0>i;i--)
		{
			if(b.charAt(i)=='/')p=i;
		}
		return b.substring(p+1,b.length());	
	}
}
