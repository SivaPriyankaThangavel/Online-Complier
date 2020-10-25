<html>
<%String encmsg=session.getValue("emsg").toString();
//out.println(encmsg);
%>
<head>
<style>
	table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  }
table.center {
  margin-left:auto; 
  margin-right:auto;
}
</style>
</head>
<body background="bg.jpg" align=center>
	<hr>
	<h2 align=center><b> DECRYPTION PROCESS</b></h2>
	<hr>
		<a href="Main"><b>HOME</b></a>
	<form method="post" action="Decresponse.jsp">
	<input type="hidden" name="msg" value=<%=encmsg%>>
	<table border=5 width=75% align=center>
	<td>ENTER N VALUE   <td align=center><input type="password" name="nvalue" align=center size=40><tr>
	<td>ENTER  SECRET KEY     <td align=center><input type="password" name="key" align=center size=40><tr>
	</table>
	<p>
	<marquee><h2><strong> DECRYPTION PROCESS USING RSA ALGORITHM</strong></marquee>
    </p>
	<table class="center">
	<tr>
	<td  ><input type="submit" name="compile" value="DECRYPT"></td>
	</table>
	</form>
	</body>
</html>