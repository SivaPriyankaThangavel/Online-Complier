<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%

try
{


String d = request.getParameter("key");
String n= request.getParameter("nvalue");
String mess= session.getValue("emsg").toString();
//out.println(mess);


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
		session.putValue("dmsg",pt);
		
		response.sendRedirect("decryptresult.jsp");
	}

	else
	{
		out.println("d or n is InCorrect");
	}

}
catch(Exception e)
	{e.printStackTrace();}
%>