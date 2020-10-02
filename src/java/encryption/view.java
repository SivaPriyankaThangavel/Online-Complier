package encryption;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class view extends Frame implements ActionListener
{
	Button b,b1;
	TextArea t1;
	public view()
	{
		super("View Files");
		setSize(300,300);
		setLayout(new FlowLayout());
		b=new Button("BrowseFile");
		add(b);
		b1=new Button("Exit");
		add(b1);
		t1=new TextArea(13,35);
		add(t1);
		b.addActionListener(this);
		b1.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
		FileDialog f=new FileDialog(this,"select File",FileDialog.LOAD);
		f.setVisible(true);
		String dir=f.getDirectory();
		String file=f.getFile();
		char c[];
		int i=0;
		try
		{
			FileInputStream fis=new FileInputStream(dir+file);
			c=new char[fis.available()];
			while(fis.available()>0)
			{
				c[i]=(char)fis.read();
				i++;
			}
			t1.setText(String.valueOf(c));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		else
			setVisible(false);
	}


	public static void main(String arg[])
	{
		new view();
	}
}