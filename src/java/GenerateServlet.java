 import java.io.IOException;
 import java.io.PrintStream;
 import java.io.PrintWriter;
  import javax.servlet.GenericServlet;
  import javax.servlet.RequestDispatcher;
  import javax.servlet.ServletException;
  import javax.servlet.ServletRequest;
  import javax.servlet.ServletResponse;
  import keygen.calculation;
  import keygen.prime;
  
  public class GenerateServlet extends GenericServlet
  {
    PrintWriter pw;
  String pstr = "";
   String qstr = "";
    String s;
    String output;
    long p;
    long q;
    long pi;
    long e;
    long val;
    long ds;
    long r;
    long qd;
    static long d;
    static long n;
    int i;
    int cnt;
  long[] rst = new long[100];
  long[] div = new long[100];
   long[] qud = new long[100];
   long[] rem = new long[100];
   String fe = "";
   String fd = "";
   String fn = "";
   String PubKey = "";
   String PriKey = "";
  
    public void service(ServletRequest paramServletRequest, ServletResponse paramServletResponse)
      throws ServletException, IOException
    {
     prime localprime = new prime();
     calculation localcalculation = new calculation();
    this.pw = paramServletResponse.getWriter();
    String str1 = paramServletRequest.getParameter("first");
    String str2 = paramServletRequest.getParameter("second");
     this.p = Long.parseLong(str1);
     this.q = Long.parseLong(str2);
     System.out.println(this.p);
     System.out.println(this.q);
      String str3;
      RequestDispatcher localRequestDispatcher1;
     if (this.p == this.q)
      {
       str3 = "PRIME NUMBERS SHOULD NOT BE EQUAL";
       localRequestDispatcher1 = paramServletRequest.getRequestDispatcher("enc.jsp?ms1=" + str3);
       localRequestDispatcher1.forward(paramServletRequest, paramServletResponse);
      }
     else if (!localprime.checkPrime(this.p)) {
       str3 = "PLEASE ENTER P AS A PRIME NUMBER";
  
       localRequestDispatcher1 = paramServletRequest.getRequestDispatcher("enc.jsp?ms2=" + str3);
       localRequestDispatcher1.forward(paramServletRequest, paramServletResponse);
      }
     else if (!localprime.checkPrime(this.q)) {
       str3 = "PLEASE ENTER Q AS A PRIME NUMBER";
  
       localRequestDispatcher1 = paramServletRequest.getRequestDispatcher("enc.jsp?ms3=" + str3);
      localRequestDispatcher1.forward(paramServletRequest, paramServletResponse);
      }
     else if ((!localprime.checkPrime(this.p)) && (!localprime.checkPrime(this.q)))
      {
       str3 = "PLEASE ENTER P AND Q VALUES AS PRIME NUMBERS";
       localRequestDispatcher1 = paramServletRequest.getRequestDispatcher("enc.jsp?ms4=" + str3);
       localRequestDispatcher1.forward(paramServletRequest, paramServletResponse);
      }
     else if ((localprime.checkPrime(this.p)) && (localprime.checkPrime(this.q)))
      {
      n = this.p * this.q;
       this.pi = ((this.p - 1L) * (this.q - 1L));
       this.e = localcalculation.calE(this.pi, this.p, this.q);
       System.out.println("e :" + this.e);
  
       this.qd = (this.pi / this.e);
       this.r = (this.pi % this.e);       this.cnt = 0;
       this.rst[this.cnt] = this.pi;
       this.div[this.cnt] = this.e;
       this.qud[this.cnt] = this.qd;
      this.rem[this.cnt] = this.r;
       System.out.println("val\tds\tqd\tr");
        do
        {
         this.cnt += 1;
         this.val = this.div[(this.cnt - 1)];
	this.ds = this.rem[(this.cnt - 1)];
         this.qd = (this.val / this.ds);
         this.r = (this.val % this.ds);
         System.out.println(this.val + "\t" + this.ds + "\t" + this.qd + "\t" + this.r);
         if (this.r == 0L)
            continue;
         this.rst[this.cnt] = this.val;
         this.div[this.cnt] = this.ds;
         this.qud[this.cnt] = this.qd;
        this.rem[this.cnt] = this.r;
        }
       while (this.r != 0L);
  
       long l1 = this.rst[(this.cnt - 1)];
       long l2 = -this.qud[(this.cnt - 1)];
       long l3 = this.div[(this.cnt - 1)];
       long l8 = 1L;
  
       for (this.i = (this.cnt - 2); this.i >= 0; this.i -= 1)
        {
         long l5 = this.rst[this.i];
         long l6 = -this.qud[this.i];
         long l7 = this.div[this.i];
         if (l3 != this.rem[this.i])
            continue;
         if (l1 != l7)
            continue;
         l1 = l5;
         long l4 = l8;
         l8 = l2;
        l2 = l4 + l2 * l6;
        l3 = l7;
        }
  
       if (l2 < 0L)
        d = this.pi + l2;
        else
         d = l2;
      this.fe = String.valueOf(this.e);
       this.fd = String.valueOf(d);
       this.fn = String.valueOf(n);
  
       RequestDispatcher localRequestDispatcher2 = paramServletRequest.getRequestDispatcher("enc.jsp?pkey=" + this.fe + "&skey=" + this.fd + "&nval=" + this.fn);
      localRequestDispatcher2.forward(paramServletRequest, paramServletResponse);
      }
    }
  }

