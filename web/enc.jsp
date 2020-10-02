
<html>
<body background="bg.jpg" align=center>
	<br><hr>
	<h2 align=center><b> ENCRYPTION PROCESS</b></h2>
	<hr>
	<a href="Main"><b>HOME</b></a>
	
	
	
	<form method="post" action="GenerateServlet" >
	<table border=5 width=75% align=center>
	<td>ENTER FIRST PRIME NO (P)<td align=center><input type="password" name="first" size=40><tr>
	<td>ENTER SECOND PRIME NO (Q)<td align=center><input type="password" name="second" align=center size=40></table>
	<table border=4 align=center>
	<tr>
	<td  align=center><input type="submit" name="compile" value="GENERATE KEYS"></td>
	</table>
	</form>
	<marquee><h2><b> ENCRYPTION PROCESS USING RSA ALGORITHM</b></marquee>
    <p>&nbsp;</p>

	
	
	
	<%String msg1=request.getParameter("ms1");
	  String msg2=request.getParameter("ms2");
	  String msg3=request.getParameter("ms3");
	  String msg4=request.getParameter("ms4");
	  String pubkey=request.getParameter("pkey"); 
	  String seckey=request.getParameter("skey"); 
	  String nvalue=request.getParameter("nval"); 
	%>


	<%if(msg1!=null){%>
	<marquee><h2><b><%=msg1%></b></marquee>
    <p>&nbsp;</p>
	<%}else if(msg2!=null){
	%><marquee><h2><b><%=msg2%></b></marquee>
    <p>&nbsp;</p>
	<%}else if(msg3!=null){%><marquee><h2><b><%=msg3%></b></marquee>
    <p>&nbsp;</p>
	<%}else if(msg4!=null){%>
		<marquee><h2><b><%=msg4%></b></marquee>
    <p>&nbsp;</p><%}%>



	<table border=5 width=674 align=center>
	<td width="151">PUBLIC KEY (E)<td align=center width="499">
	<%if(pubkey!= null)
	{%>
	<input type="text"name="first" size=40 value="<%=pubkey%>">
	<%}
	else
		{
	%>
	<input type="text"name="first" size=40>
	<%}%>
	</table>
	<table border=5 width=674 align=center>
	<td width="152">SECRET KEY (D)<td align=center width="498">
	<% if(seckey!=null)
     {%>
	<input type="text" name="skey" size=40 value="<%=seckey%>">
	
	<%}
	else
	{%>
	<input type="text"name="first" size=40>
	<%}%>
	</table>
	<table border=5 width=674 align=center>
	<td width="152">N VALUE (N)<td align=center width="498">
	<%if(nvalue!=null)
	{%><input type="text" name="first" size=40 value="<%=nvalue%>">
	<%}else{%>
	<input type="text"name="first" size=40>
	<%}%>
	</table><h2>
    </h2><h2></h2>
	</h2><h2></h2>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
	<form method="post" action="intext.jsp" >
	<input type="hidden"name="skey" value="<%=seckey%>">
	<input type="hidden"name="nv" value="<%=nvalue%>">

	<table border=4 align=center>
	<tr>
	<td  align=center><input type="submit" name="compile" value="SEND KEYS"></td>
	</table>
	</form>
    <h2></h2>
    <h2></h2>
    <h2></h2>
    <h2></h2>
</body></html>