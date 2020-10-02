package keygen;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class prime
{
	 int i;
	 String s;
	 int flag=0;
	public boolean checkPrime(long n)
	 {
		  if(n==0 || n==1)
		  {
		  System.out.println("not prime number");
                                     flag=1;
		  }
		  else
		  {
			   for(i=2;i<n;i++)
			   {
					if(n%i == 0)
					{
						 flag=1;
						 break;
					}
			   }
		  }
		  if(flag==1)
			   return false;
		  else
			   return true;
	 }
}