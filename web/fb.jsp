
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<script type="text/html">
function check()
{
	alert("hai");
     if(document.f1.message.value=="")
     {
         alert("Please enter the message");
		 return false;
     }
     else
     if(document.f1.email.value=="")
     {
     alert("Please enter your email id");
	 return false;
     }
     else
        return true;
}
</script>
</head>
<body>
<%
String message=request.getParameter("message");
String email=request.getParameter("email");
String userid=(String)session.getValue("user");

if(message!=null&&pass!=null)
{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_compiler?zeroDateTimeBehavior=convertToNull","root","");
		Statement stm=con.createStatement();
        String q="insert into feedback values('"+userid+"','"+message+"','"+email+"')";
		System.out.println(q);
		ResultSet rs=stm.executeQuery(q);
		while(rs.next())
	    {
			String tuser=rs.getString(1);
			String tmessage=rs.getString(2);
			String temail=rs.getString(3);

	    }


 %>

    </head>
    <body>
        <center><font color="blue" size="20">Feedback form</font></center>
        <table align="center">
            <tr>
                <td>Enter message:</td>
                <td><center><textarea rows="10" name="message"></textarea><center>
                </td>
            </tr>
            <tr>
                <td>Enter email id:</td>
                <td><input type="text" name="email" size="30">
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="submit"></td>
            </tr>
         </table>

    </body>
</html>
