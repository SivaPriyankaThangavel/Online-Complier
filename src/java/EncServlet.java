import javax.servlet.*;
import java.io.*;
public class EncServlet extends GenericServlet
{
	PrintWriter pw;
	String seckey;
	String sfile;
	String tfile;
	ReadWrite rw;
	boolean b1,b2,b3;
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
			res.setContentType("text/html");
			pw=res.getWriter();	
			seckey=req.getParameter("skey");
			sfile=req.getParameter("sfile");
			tfile=req.getParameter("tfile");
			pw.write(seckey);
			pw.write(sfile);
                                                pw.write(tfile);


				pw.close();
			
	}
}