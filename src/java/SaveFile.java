import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SaveFile extends GenericServlet
{
	FileOutputStream fos;
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		String imsg=req.getParameter("ta");
		System.out.println("SSSS   "+imsg);
                String ff=req.getParameter("path");
                
              //  String name = request.getParameter("TEXT1");
          //  String text = request.getParameter("TEXTAREA1");
            String file = "D:/file/" +ff+".java";
    
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(imsg);
            
            filewriter.close();
                
                
                
                
                
                             //  Encrpting the program


	String d ="43";
String n="77";
 //FileInputStream fis = new FileInputStream(ipath);	
//FileOutputStream fos = new FileOutputStream(opath);
//byte b[] = new byte[fis.available()];
//fis.read(b);
//String msg = new String(b);
String msg=imsg;
Vector v = new Vector();
Vector cyp = new Vector();
String ct="";
String fct="";
for(int i=0; i<msg.length(); i++)
{
int ac = msg.charAt(i) * 16;
ct = ct+ac+"#";
}
fct = ct.trim()+"$"+d+"$"+n;

 //RequestDispatcher rd=req.getRequestDispatcher("encresult.jsp?");
//rd.forward(req,res);
//fos.write(fct.getBytes());
 
//out.println(fct);
System.out.println(fct);

String s=fct;
							 //


//		//String ff=req.getParameter("path");
//		System.out.println("FFF   "+ff);
//		String dir=req.getRemoteHost();
//		File kk=new File("d:/"+dir);
//		boolean bb=kk.mkdir();
		PrintWriter pw=res.getWriter();
//		fos=new FileOutputStream(kk+"/"+ff);
//		int end=s.length();
//                                System.out.println("S--> in savaFile==>"+s);
//		int start=0;
//		while(start<end)
//		{
//			fos.write(s.charAt(start));
//			start++;	
//		}
//		fos.close();
		
		pw.println("<html>");
		pw.println("<html>");
		pw.println("<body bgcolor=pink align=center background='bcc.jpeg'>");
		pw.println("<br><br>");
		pw.println("<center><hr><h2><b>FILE ACTION REPORT</b></h2>");
		pw.println("<hr>");
		pw.println("<hr size=5 width=50% align=center><br><br>");
		pw.println("<center>"+ff+": FILE IS SUCESSFULLY STORED");
		pw.println("<hr size=5 width=100% align=center>");
		pw.println("<a href='compile.jsp'>");
		pw.println("<center>DO YOU WISH TO GO TO  COMPILER SECTION</a>");				
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}