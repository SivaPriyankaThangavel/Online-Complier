import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.util.logging.ConsoleHandler;

public class RunFile extends GenericServlet
{StringBuffer standardOutput = new StringBuffer();
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		                  //   Reading the data from file
		
		String s1=req.getParameter("file");
             
		String dir1=req.getRemoteHost();
		
		                    //    Run the program
                                 		

                
		 System.out.println(dir1+"pp >>>>>>>>>process before>>>"+s1);
			Runtime r=Runtime.getRuntime();
                        
                        
                     System.out.println("Testing.....");      
                        
                        
                       try {
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("java -classpath D:\\file "+s1.replaceFirst(".*/(\\w+).*","$1"));
			InputStream inputStream = process.getInputStream();
                        OutputStream outputStream = process.getOutputStream();
			InputStreamReader isr = new InputStreamReader(inputStream);
			InputStream errorStream = process.getErrorStream();
			InputStreamReader esr = new InputStreamReader(errorStream);
                        
                        OutputStreamWriter osw=new OutputStreamWriter(outputStream);
                        
 
			int n1;
			char[] c1 = new char[1024];
			
			while ((n1 = isr.read(c1)) > 0) {
				standardOutput.append(c1, 0, n1);
			}
                        
                       
			System.out.println("Standard Output: " + standardOutput.toString());

			int n2;
			char[] c2 = new char[1024];
			StringBuffer standardError = new StringBuffer();
			while ((n2 = esr.read(c2)) > 0) {
				standardError.append(c2, 0, n2);
			}
			System.out.println("Standard Error: " + standardError.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
                       
                       
                       System.out.println("testing end");
                     
                     
                     
                     
                     
                        
                        
                        
                        
                        
                                                 
 			Process p=r.exec("java -cp D:/files/"+s1);
			InputStream is=p.getInputStream();
                        
                        InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            System.out.println("<OUTPUT>");
            while ( (line = br.readLine()) != null)
                System.out.println(line);
            
          //  pw.write("<br></br>");
            //pw.write(line);
            System.out.println("</OUTPUT>");
			int c=is.read();
                                               
			if( c!=-1)
			{
				pw.write("<html>");
				pw.write("<body align =center background='vv.jpg'>");
				pw.write("<br><br>");
				pw.write("<h2><b> Out Put</b>");
				pw.write("<form method='post' action='SaveAgain'>");
				pw.write("<br><pre>");
                  			pw.print((char)c);
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
				pw.write("</pre>");
				pw.write("<br><textarea align=center name='text'rows='20' cols='84'>");
				
				pw.write("</textarea><br>");
				pw.write("<table border=4 align=center>");
				pw.write("<td>File Path </td>");
				pw.write("<td><input type=text name='filename' value="+s1+"></td>");
				pw.write("<td><input type='submit' name='saveAgain' value='Update'></td></table>");
				pw.write("</form>");
			
			}
			else
			{
				pw.println("<html><body  background='vv.gif'>");
				pw.println("<h3 align=center> ERROR REPORT</h3>");
				pw.println("<hr size=5 width=50% align=center><br><br><br>");
				pw.println(":code is NO ERROR");
				pw.println("<hr size=5 width=100% align=center>");
				pw.println("<a href='create.jsp'>");
				pw.println("<center>CREATE ANOTHER FILE</a>");
			}
			
		            pw.print("<br></br>");
                            pw.print("<br></br>");
		            pw.print("**********OUTPUT*********");
                            pw.print("<br></br>");
                            pw.print("<br></br>");
                            pw.print("<br></br>");
                            pw.print("<center>");
                            pw.print("                    "+standardOutput.toString());
                             pw.print("<center>");



		
	}
}