<%@page contentType="text/html" %>
<html>

<head>
     <title>Registration Jsp Page</title>
     <script type="text/javascript">
          function check() {
               if (document.f1.d.value == "") {
                    alert("Please enter date of birth");
               }
               else
                    if (document.f1.m.value == "") {
                         alert("plz select a month");
                    }
                    else
                         if (document.f1.y.value == "") {
                              alert("plz select a year");
                         }
                         else
                              if (document.f1.password.value != document.f1.c_password.value) {
                                   alert("password & confirm password should be same");
                              }
                              else
                                   if (document.f1.sps.value == "") {
                                        alert("Please enter a question");
                                   }
                                   else {
                                        f1.action = "register.jsp";
                                        f1.submit();
                                   }

          }
     </script>
</head>
<body bgcolor="pink" style="background-image: url('bcc.jpeg')">
     <form name="f1">
          <p align="center">
               <font color="red" size="30">
                    <center>Registration Form</center>
               </font>
          </p>
          <br><br><br>
          <table align="center">
               <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="fname" size="30" required></td>
               </tr>
               <tr>
                    <td>Middle Name:</td>
                    <td><input type="text" name="mname" size="30" required></td>
               </tr>
               <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lname" size="30" required></td>
               </tr>
               <tr>
                    <td>Date of Birth:</td>
                    <td><select name="d">
                              <option value="0" SELECTED>SELECT</OPTION>
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                              <option value="6">6</option>
                              <option value="7">7</option>
                              <option value="8">8</option>
                              <option value="9">9</option>
                              <option value="10">10</option>
                              <option value="11">11</option>
                              <option value="12">12</option>
                              <option value="13">13</option>
                              <option value="14">14</option>
                              <option value="15">15</option>
                              <option value="16">16</option>
                              <option value="17">17</option>
                              <option value="18">18</option>
                              <option value="19">19</option>
                              <option value="20">20</option>
                              <option value="21">21</option>
                              <option value="22">22</option>
                              <option value="23">23</option>
                              <option value="24">24</option>
                              <option value="25">25</option>
                              <option value="26">26</option>
                              <option value="27">27</option>
                              <option value="28">28</option>
                              <option value="29">29</option>
                              <option value="30">30</option>
                              <option value="31">31</option>
                         </select>dd
                         <select name="m">
                              <option value="0" SELECTED>SELECT</OPTION>
                              <option value="Jan">Jan</option>
                              <option value="Feb">Feb</option>
                              <option value="Mar">Mar</option>
                              <option value="Apr">Apr</option>
                              <option value="May">May</option>
                              <option value="Jun">Jun</option>
                              <option value="Jul">Jul</option>
                              <option value="Aug">Aug</option>
                              <option value="Sep">Sep</option>
                              <option value="Oct">Oct</option>
                              <option value="Nov">Nov</option>
                              <option value="Dec">Dec</option>
                         </select>mm
                         <input type="text" name="y" size="4">yyyy</td>
               </tr>
               <tr>
                    <td>Email id:</td>
                    <td><input type="email" name="emailid" size="30" required></td>
               </tr>
               <tr>
                    <td>User id:</td>
                    <td><input type="text" name="userid" size="30" required></td>
               </tr>
               <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" size="32" required></td>
               </tr>
               <tr>
                    <td>Confirm password:</td>
                    <td><input type="password" name="c_password" size="32" required></td>
               </tr>
               <tr>
                    <td>Select a question for use in password missing:</td>
                    <td><select name="sps">
                              <option value="Whats ur nickname">What's ur nickname?</option>
                              <option value="Whats ur native place">What's ur native place?</option>
                              <option value="When is ur bday">When is ur b'day?</option>
                              <option value="Where did u do ur schooling">Where did u do ur schooling?</option>
                              <option value="Whats ur best friends name">What's ur best friend'z name?</option>
                         </select>
               </tr>
               <tr>
                    <td>Type ur answer:</td>
                    <td><input type="text" name="ans" required></td>
               </tr>
               <tr>
                    <td></td>
                    <td><input type="submit" value="Register" onclick="check()">
               </tr>
          </table>
     </form>
</body>
</html>