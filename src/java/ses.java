import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
public class ses extends HttpServlet
{
	
	HttpSession hs;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		hs=req.getSession(true);
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Date accessDate=(Date)hs.getValue("accessDate");
		if(accessDate!=null)
		pw.println("Last accessDate :"+accessDate+"<br>");
		accessDate=new Date();
		hs.putValue("accessDate : ",accessDate);
		pw.println("CurrentDate : "+accessDate);
		pw.close();
		
	}
}