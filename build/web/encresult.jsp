<html>
<%
//String encmsg=request.getParameter("emsg");
String encmsg=session.getValue("emsg").toString();
//out.println(encmsg);
%>
<body background="bg.jpg" align=center>
<form method="post" action="dec.jsp">
	<br><hr>
	<h2 align=center><b> ENCRYPTION PROCESS</b></h2>
	<hr>
	<a href="Main"><b>HOME</b></a>
	<p>
	<marquee><h2><b>FILE ENCRYPTED SUCCESSFULLY  </b></marquee>
    </marquee></p>
	<input type="hidden" name="emsg" value="<%=encmsg%>">
	<%=encmsg%>
<input type="submit" value="Decryption">
</form>
</body>
</html>