<%@ page import="java.sql.*" %>
<html>
<head>
</head>

<body>
<%  
	String fname=request.getParameter("fname");
	String mname=request.getParameter("mname");
	String lname=request.getParameter("lname");
        String d=request.getParameter("d");
		String m=request.getParameter("m");
		String y=request.getParameter("y");
		String emailid=request.getParameter("emailid");
		String userid=request.getParameter("userid");
        String password=request.getParameter("password");
	 
	    String sps=request.getParameter("sps");
        String ans=request.getParameter("ans");
  String dob=d+"-"+m+"-"+y;
          Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_compiler?zeroDateTimeBehavior=convertToNull","root","");
	Statement stm=con.createStatement();
String q="insert into registration  values('"+fname+"','"+mname+"','"+lname+"','"+dob+"','"+emailid+"','"+userid+"','"+password+"','"+sps+"','"+ans+"')";
 System.out.println(q);
 	
		int n=stm.executeUpdate(q);	
		if(n>0)
			{
			String p="insert into login values('"+userid+"','"+password+"')";
			
			stm.executeUpdate(p);
			response.sendRedirect("login.jsp");			
			}
		else
			{
		    out.println("registration failed");
		     }
	String q1="select userid from login";
	
	ResultSet rs=stm.executeQuery(q1);


	System.out.println(userid);

	%>
</body>
</htm