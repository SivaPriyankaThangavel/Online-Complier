 import java.io.*;
import static java.lang.System.out;
 import java.util.*;
import javax.servlet.*;
class DecServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{


try
{
    
    
String d = req.getParameter("key");
String n= req.getParameter("nvalue");
String mess= req.getParameter("msg");


String ct=mess;
StringTokenizer st = new StringTokenizer(ct,"$");     
String ctmsg = st.nextToken();
String dchk = st.nextToken();
String nchk = st.nextToken();
String pt="";
if((d.equalsIgnoreCase(dchk)) && (n.equalsIgnoreCase(nchk)))
	{
	StringTokenizer st1 = new StringTokenizer(ctmsg,"#");
	while(st1.hasMoreTokens())
		{
		String m = st1.nextToken();
		int imsg = Integer.parseInt(m);
		imsg = imsg/16;
		char c = (char)imsg;
		pt = pt+c;
		}
		
		

	}
	else
	{
		out.println("d or n is InCorrect");
	}

}
catch(Exception e)
	{e.printStackTrace();}}}
