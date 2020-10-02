import javax.servlet.*;
import java.io.*;
import java.lang.reflect.*;
public class API extends GenericServlet
{
	Class c;
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		

		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("Name  ");
		pw.println("<html><body bgcolor='#C8E4FF'>");
		pw.println("<pre>");
		String name=req.getParameter("name");
		pw.println("Name  "+name);
		try
		{
			c=Class.forName(name);
			Constructor cc[]=c.getConstructors();
			System.out.println("Constructor Created");
			Method m[]=c.getMethods();
			System.out.println("Method Created");
			Field f[]=c.getFields();
			System.out.println("Field Created");
			pw.println("<h2 align=center> JAVA API CLASSES</h2>");
			pw.println("<h5 align=center> JAVA API FIELDS</h2>");
			for(int i=0;i<f.length;i++)
			{
			pw.println(f[i]);
			}
			pw.println("<h5 align=center> JAVA API CONSTRUCTORS</h2>");
			for(int i=0;i<cc.length;i++)
			{
			pw.println(cc[i]);
			}
			pw.println("<h5 align=center> JAVA API METHODS</h2>");
			for(int i=0;i<m.length;i++)
			{
			pw.println(m[i]);
			}
			pw.println("<a href='create.jsp'>");
			pw.println("<h4 align=center>Create java file</h4></a><br>");
			pw.println("<a href='compile.jsp'><h4 align=center>Compile java file<h4></a>");
			
		}
		catch(Exception e)
		{
			pw.println("<h1 align=center><b>ERROR</b></h1>");
			pw.println("<br><br><br>");
			pw.println("<marquee><h2><b> INVALID API CLASS NAME</b></h2></marquee>");
			pw.println("<a href='javaapi.jsp'><h4 align=center>RETRY AGAIN</h4></a><br></tr>");
			
		}
		pw.println("</pre></body></html>");
		pw.close();
	}
}