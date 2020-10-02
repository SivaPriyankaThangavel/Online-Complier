<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="bcc.jpeg">
        <center>
            <h1><font face="Monotype Corsiva" color="red">
            Forgot password
                </font>
        </h1>
        </center>
        <table align="center">
            <tr>
                <td>
                    Select a question for use in password missing:
                </td>
                <td>
                    <select name="f">
                        <option value="What's ur nickname?">What's ur nickname?</option>
                        <option value="What's ur native place?">What's ur native place?</option>
                        <option value="When is ur b'day?">When is ur b'day?</option>
                        <option value="Where did u do ur schooling?">Where did u do ur schooling?</option>
                        <option value="What's ur best friend's name?">What's ur best friend'z name?</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Type ur answer:</td>
                <td><input type="text" name="ps"></td>
            </tr>
            <tr>
                <td>Reconfirm ur answer:</td>
                <td><input type="text" name="ps1"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="submit"></td>
            </tr>
    </body>
</html>
