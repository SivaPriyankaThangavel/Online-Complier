import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SaveAgain extends GenericServlet
{
	FileOutputStream fos;
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		
		String imsg=req.getParameter("text");
                String filenamee=req.getParameter("filename");
		System.out.println("SSSS   "+imsg);

                             //  Encrpting the program

                
                 String file = "D:/file/" +filenamee+".java";
    
                 File f=new File(file);
                 
                 f.delete();
                 
            FileWriter filewriter = new FileWriter(file, true);
           
            filewriter.flush();
            filewriter.write(imsg);
            
            filewriter.close();
                 

            
       
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


//		String ff=req.getParameter("filename");
//		System.out.println("FFF   "+ff);
//		String dir=req.getRemoteHost();
//		File kk=new File("d:/"+dir);
//		boolean bb=kk.mkdir();
		PrintWriter pw=res.getWriter();
//		fos=new FileOutputStream(kk+"/"+ff);
//		int end=s.length();
//		int start=0;
//		/*while(start<end)
//		{
//			fos.write(s.charAt(start));
//			start++;	
//		}*/
//                                 fos.write(s.getBytes());
//		fos.close();
		
		pw.println("<html>");
		pw.println("<html>");
		pw.println("<body bgcolor=pink align=center>");
		pw.println("<br><br>");
		pw.println("<center><hr><h2><b>FILE ACTION REPORT</b></h2>");
		pw.println("<hr>");
		pw.println("<hr size=5 width=50% align=center><br><br>");
		pw.println("<center>"+filenamee+":  FILE IS SUCESSFULLY STORED");
		pw.println("<hr size=5 width=100% align=center>");
		pw.println("<a href='compile.jsp'>");
		pw.println("<center>DO YOU WISH TO GO TO  COMPILER SECTION</a>");				
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}