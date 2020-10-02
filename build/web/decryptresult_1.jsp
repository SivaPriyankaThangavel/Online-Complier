<html>
<%
String decmsg=session.getValue("dmsg").toString();
%>
<body background="bg.jpg" align=center>
	<br><hr>
	<h2 align=center><b> ENCRYPTION PROCESS</b></h2>
	<hr>
	<a href="Main"><b>HOME</b></a>
	<p>
	<marquee><h2><b>FILE DECRYPTED SUCCESSFULLY  </b></marquee>
    </marquee></p>
	<%=decmsg%>
</body>
</html>