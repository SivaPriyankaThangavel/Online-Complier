import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class CompileFile extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		                  //   Reading the data from file
		String name="hello hai";
		String s1=req.getParameter("file");
		//String dir1=req.getRemoteHost();
//		File f=new File("d:/"+dir1+"/"+s1);
//		String name=f.getName();
//		
//		FileInputStream fs1=new FileInputStream("d:/"+dir1+"/"+s1);
//		
//		int n1=fs1.available();
//		byte b[]=new byte[n1];
//		fs1.read(b);
//		String str=new String(b);
//
//		System.out.println(str);
//		
//		            //      Decryptiing the data 
//	
//	
//String d ="43";
//String n="77";
//String mess=str;
//
////out.println(mess);
//
//
//String ct=mess;
//StringTokenizer st = new StringTokenizer(ct,"$");
//String ctmsg = st.nextToken();
//String dchk = st.nextToken();
//String nchk = st.nextToken();
//String pt="";
//if((d.equalsIgnoreCase(dchk)) && (n.equalsIgnoreCase(nchk)))
//	{
//	StringTokenizer st1 = new StringTokenizer(ctmsg,"#");
//	while(st1.hasMoreTokens())
//		{
//		String m = st1.nextToken();
//		int imsg = Integer.parseInt(m);
//		imsg = imsg/16;
//		char c = (char)imsg;
//		pt = pt+c;
//		}
// 	}
//
//	String dstr=pt;
//	System.out.println(dstr);
//
//                    // Storing decrypted program in other file
// 		
//	String attach="d:/"+dir1+"/pro.java";
//
//	FileOutputStream fos=new FileOutputStream(attach);
//
//		 int end=dstr.length();
//		int start=0;
//		while(start<end)
//		{
//			fos.write(dstr.charAt(start));
//			start++;	
//		}
//		fos.close();
//		
	
		
		
		
		                    //     Compiling the program

 		
		String s="pro.java";
				 
		InputStream is;
		int c;
		int i=0;
		StringExtract se=new StringExtract(s);
		if(se.extract())
		{
                    
                    System.out.println("hello java testing you");
			FileInputStream fs=new FileInputStream("D:/file/"+s1);
			Runtime r=Runtime.getRuntime();
			Process p=r.exec("javac "+"D:/file/"+s1);
			is=p.getErrorStream();
			c=is.read();
			if( c!=-1)
			{
				pw.println("<html>");
				pw.println("<body align =center background='vv.jpg'>");
				pw.println("<br><br>");
				pw.println("<marquee><h2><b> ERROR REPORT</marquee>");
				pw.println("<form method='post' action='SaveAgain'>");
				pw.println("<pre>");
				while(c!=-1)
				{
					c=is.read();
					if((char)c=='^')
					{
						pw.println("<br>");
						c=is.read();
					}
					pw.print((char)c);

				}
				pw.println("</pre>");
				pw.println("<br><textarea align=center name='text'rows='20' cols='84'>");
				while(fs.available()>0)
				{
					pw.print((char)fs.read());	
				}
				pw.println("</textarea><br>");
				pw.println("<table border=4 align=center>");
				pw.println("<td>File Path </td>");
				pw.println("<td><input type=text name='filename' value="+name+"></td>");
				pw.println("<td><input type='submit' name='saveAgain' value='Update'></td></table>");
				pw.println("</form>");
			
			}
			else
			{
				pw.println("<html><body  background='vv.gif'>");
				pw.println("<h3 align=center> ERROR REPORT</h3>");
				pw.println("<hr size=5 width=50% align=center><br><br><br>");
				pw.println(s+":code is NO ERROR");
				pw.println("<hr size=5 width=100% align=center>");
                                pw.println("<a href='run.jsp'>");
				pw.println("<center>RUN</a><br></br><br></br>");
				pw.println("<a href='create.jsp'>");
				pw.println("<center>CREATE ANOTHER FILE</a>");
			}
			
		}
		else
		{
			pw.println("<html><body background='vv.gif'>");	
			pw.println("<h3 align=center> ERROR REPORT</h3>");
			pw.println("<hr size=5 width=50% align=center><br><br><br>");
			pw.println("<h4>FILE IS NOT JAVA FILE SO AGAIN SELECT FILE</h4>");
			pw.println("<hr size=5 width=100% align=center><br>");
			pw.println("<a href='compile.html'>GO TO SELECT JAVA FILE</a>");
		}
			pw.println("</body></html>");
			pw.close();  



		
	}
}