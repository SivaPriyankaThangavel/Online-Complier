<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/JavaScript">
            function check()
            {

                if(f1.user.value=="")
                    {
                        alert("Please enter userid");
                        return false;
                    }
                if(f1.pass.value=="")
                    {
                        alert("Please enter password");
                        return false;
                    }
                else 
                    return true;
            }
         </script>
    </head>
    <body background="bcc.jpeg">
        <% 

        String user=request.getParameter("user");
        String pass=request.getParameter("pass");
		session.putValue("user",user);

        if(user!=null&&pass!=null)
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_compiler?zeroDateTimeBehavior=convertToNull","root","");

		System.out.println("connected");
        
		Statement stm=con.createStatement();
        String q="select * from login";
		System.out.println(q);
        ResultSet rs=stm.executeQuery(q);
        int f=0;
		
        while(rs.next())
	    {
	        String tuser=rs.getString(1);
	        String tpass=rs.getString(2);
	        System.out.println(tuser);
	        System.out.println(tpass);
        if(tuser.equalsIgnoreCase(user)&&tpass.equalsIgnoreCase(pass))
		{
	        f=1;
	        break;
		}
	}
	if(f==1)
		response.sendRedirect("program.jsp");
	else
			{
		%>

<FONT SIZE="" COLOR="#FF0000">Invalid Userid or Password </FONT><jsp:include page="login.jsp"></jsp:include>
		
	<%
		 
}
		}
%>
             <form name="f1" action="login.jsp"  onsubmit="return check()">
            <br><br><br><br><br><br>
            <table align="center" border="5">
                  <tr>
                      <td>User Id      :</td>
                      <td><input type="text" name="user" ></td>
                  </tr>
                  <tr>
                      <td>Password:</td>
                      <td><input type="password" name="pass" ></td>
                  </tr>
                  <tr>
                      <td></td>
                      <td><input type="submit" value="Login"></td>
                  </tr>
                  <tr>
                      <td></td>
                      <td><a href="fyp.jsp" target="fr3">Forgot your password</a></td>
                  </tr>
                  <tr>
                      <td></td>
                      <td><a href="nusr.jsp" target="fr3">New User Login</a></td>
                  </tr>
        </form>
     </body>
</html>
