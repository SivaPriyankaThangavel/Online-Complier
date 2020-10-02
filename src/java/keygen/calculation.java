package keygen;
public class calculation
{
	 long great,a;
	 double aa,bb,cc,rm;
	 long rd;
	 long eval;
	public  long calE(long pi,long p,long q)
	 {
		  great=0;
		  aa=Math.log(pi)/Math.log(10);
		  bb=Math.floor(aa);
		  cc=Math.pow(10,bb);
		  rm=Math.random()*cc;
		  System.out.println("rm :"+rm);
		  rd=Math.round(rm);
		  System.out.println("rd :"+rd);
		  while(great != 1)
		  {
			   rd=rd+1;
			   great=GCD(rd,pi);
			   pi=(p-1)*(q-1);
		  }
		  return rd;
	 }

	public  long GCD(long e,long pi)
	 {
		 System.out.println("e :"+e);
		  if(e > pi)
		  {
			   while(e%pi != 0)
			   {
					a=e%pi;
					e=pi;
					pi=a;
			   }
			   great=pi;
		  }
		  else
		  {
			   while(pi%e != 0)
			   {
					a=pi%e;
					System.out.println("a :"+a);
					pi=e;
					System.out.println("pi :"+pi);
					e=a;
					System.out.println("e12 :"+e);
			   }
			   great=e;
		  }
		  return great;
	 }
}



