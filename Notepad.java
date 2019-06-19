import java.util.Scanner;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;
import java.io.ObjectStreamField;
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

import javax.swing.undo.*;



class Notepad implements ActionListener,CaretListener,UndoableEditListener
{
	
	//Containers, Components and Instance variables

	JFrame fr;
	JMenuBar bar;
	JMenu m1,m2,m3,m4,m5;

	static JTextArea tf;
	static JTextField tf1;
	JMenuItem f1,f2,f3,f4,f5,f6,f7,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,fo1,fo2,v1,h1,h2;
	JFrame fontFr;
	JLabel fontlb1;
	Timer t1;
	JButton fontB1,fontB2;
	JDialog fontd;
	JScrollPane sp;
	JComboBox fontCb1,fontCb2,fontCb3;

	static String openfilepath;
	static int wordwrap,status;
	static String str1;
	static int linenum;

	protected UndoManager undom;
	String font[]={"Times New Roman","jokerman","verdana","Monotype Corsiva","Old English Text MT"};
	String style[]={"Bold","Italic","Reglar"};
	String size[]={"8","9","10","11","12","14","16","18","20","22","24","26","28","36","48","72"};


	
//Default Constructor
	Notepad()

	{

		fr=new JFrame("My Notepad");
		fr.setSize(1350,720);

		fr.setLayout(new BorderLayout());

	
	tf=new JTextArea();

		fr.add(tf,BorderLayout.CENTER);
		tf.setVisible(true);

		tf1 = new JTextField(); // to display status bar
		fr.add(tf1,BorderLayout.SOUTH);



		sp=new JScrollPane(tf,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setBounds(0,0,fr.getWidth(),fr.getHeight());

		fr.add(sp);

		bar=new JMenuBar();

		fr.setJMenuBar(bar);



		//Menu To be Displayed in menu bar
	
	m1=new JMenu("File");

	 	m2=new JMenu("Edit");
	
	m3=new JMenu("Format");

	 	m4=new JMenu("View");
	 
 	m5=new JMenu("Help");

	

	bar.add(m1);
	
	bar.add(m2);
	
	bar.add(m3);

		bar.add(m4);
	
	bar.add(m5);


	
	//Items if File Menu

		f1=new JMenuItem("New");
	
	f2=new JMenuItem("Open");

		f3=new JMenuItem("Save");
	
	f4=new JMenuItem("Save As");
	
	f5=new JMenuItem("Page Setup...");
	
	f6=new JMenuItem("Print...");
	
	f7=new JMenuItem("Exit");


	
	m1.add(f1);
		m1.add(f2);
	
	m1.add(f3);

		m1.add(f4);
	
	m1.add(new JSeparator());

		m1.add(f5);

		m1.add(f6);
	
	m1.add(new JSeparator());

		m1.add(f7);

		//Items of Edit Menu
	
	e1=new JMenuItem("Undo");
	
	e2=new JMenuItem("Cut");

		e3=new JMenuItem("Copy");
	
	e4=new JMenuItem("Paste");

		e5=new JMenuItem("Delete");

		e6=new JMenuItem("Find...");
	
	e7=new JMenuItem("Find Next");
	
	e8=new JMenuItem("Replace...");
	
	e9=new JMenuItem("Go to");
	
	e10=new JMenuItem("Select All");

		e11=new JMenuItem("Time/Date");
	

	
		m2.add(e1);
	
	m2.add(new JSeparator());

		m2.add(e2);
	
	m2.add(e3);
	
	m2.add(e4);
	
	m2.add(e5);
	
	m2.add(new JSeparator());

		m2.add(e6);
	
	m2.add(e7);
	
	m2.add(e8);

		m2.add(e9);

		m2.add(new JSeparator());
	
	m2.add(e10);
	
	m2.add(e11);

		//Items of Format Menu
	
	fo1=new JMenuItem("Word Wrap");
	
	fo2=new JMenuItem("Font...");
	

	m3.add(fo1);
	
	m3.add(fo2);

		//Item of View Menu
	
	v1=new JMenuItem("Status Bar");
	
	m4.add(v1);

		//Item of Help Menu

		h1=new JMenuItem("View Help");
	
	h2=new JMenuItem("About Notepad");


		m5.add(h1);

		m5.add(h2);

		//Alternative Keys For Menu Items
	

	KeyStroke ks1=KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK);
	
	f1.setAccelerator(ks1);

	

	KeyStroke ks2=KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_MASK);

		f2.setAccelerator(ks2);


	
	KeyStroke ks3=KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK);
	
	f3.setAccelerator(ks3);


		KeyStroke ks5=KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK);
	
	e1.setAccelerator(ks5);



		KeyStroke ks6=KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK);
	
	e2.setAccelerator(ks6);

	

	KeyStroke ks7=KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK);

		e3.setAccelerator(ks7);



		KeyStroke ks8=KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK);

		e4.setAccelerator(ks8);

	

	KeyStroke ks9=KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.CTRL_MASK);
	
	e5.setAccelerator(ks9);

	

	KeyStroke ks10=KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_MASK);
	
	e6.setAccelerator(ks10);



		KeyStroke ks11=KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.ALT_MASK);

		fo2.setAccelerator(ks11);

		KeyStroke ks12=KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_MASK);

		e8.setAccelerator(ks12);
		
		KeyStroke ks13=KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_MASK);

		e9.setAccelerator(ks13);
		
		KeyStroke ks14=KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_MASK);

		e10.setAccelerator(ks14);
	
		KeyStroke ks15=KeyStroke.getKeyStroke(KeyEvent.VK_F3,0);

		e7.setAccelerator(ks15);

		KeyStroke ks16=KeyStroke.getKeyStroke(KeyEvent.VK_F5,0);

		e11.setAccelerator(ks16);

		//Providing listener to all menu Items

	
	f1.addActionListener(this);
	
	f2.addActionListener(this);
	
 	f3.addActionListener(this);

		f4.addActionListener(this);

		f5.addActionListener(this);
	
	f7.addActionListener(this);

		e1.addActionListener(this);
	
	e2.addActionListener(this);
	
	e3.addActionListener(this);
	
	e4.addActionListener(this);
	
	e5.addActionListener(this);
	
	e6.addActionListener(this);

		e7.addActionListener(this);

		e8.addActionListener(this);

		e9.addActionListener(this);
	
	e10.addActionListener(this);
	
	e11.addActionListener(this);

	

	fo1.addActionListener(this);
	
	fo2.addActionListener(this);

	

	v1.addActionListener(this);


		h1.addActionListener(this);
	
	h2.addActionListener(this);
		
		fr.setVisible(true);
	}
	
	//for undo
	public void undoableEditHappened(UndoableEditEvent ue)
	{
		undom.addEdit(ue.getEdit());
	}

	

//Call Back Method for Source event

	
	
public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==f1) // for New File
		{
			tf.setText("");
		}

		if(e.getSource()==f2) // To Open a File From a Destination through OpenDialog
		{

			JFileChooser open= new JFileChooser();
			int option=open.showOpenDialog(null);


			
if(option==JFileChooser.APPROVE_OPTION)
			{
				tf.setText("");
				try

				{

					openfilepath=open.getSelectedFile().getPath();
					Scanner scan= new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while(scan.hasNext())
					tf.append(scan.nextLine()+"\n");

				}

				catch(Exception er)
				{}
		
	}
			
else if(option==JFileChooser.CANCEL_OPTION)
			{

			}
		}

		if(e.getSource()==f3) // to save file
		{
			try
			{

				FileOutputStream fout=new FileOutputStream(openfilepath);
				String str1=(String)(tf.getText());

				
int len=str1.length();
				byte b[]=str1.getBytes();

				for(int i=0;i<len;i++)

				{

					fout.write(b[i]);
		  		}

			}
			catch(IOException io)

			{}


		}

		if(e.getSource()==f4) // to saveas file
		{

			JFileChooser save= new JFileChooser();

		//	save.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int option=save.showSaveDialog(null);

			if(option==JFileChooser.APPROVE_OPTION)
			{
				try

				{

					String path=save.getSelectedFile().getAbsolutePath();

			//Not Needed	String name=save.getSelectedFile().getName();	// choose to use path because it is path of total file

					File file=new File(path);
					file.createNewFile();

	
				FileOutputStream fout=new FileOutputStream(path);

					String str1=(String)(tf.getText());

					int len=str1.length();

					byte b[]=str1.getBytes();

					for(int i=0;i<len;i++)
					{

						fout.write(b[i]);
		  			}
				}
				catch(IOException io)
				{}

			}

		}


		if(e.getSource()==f7) // for exit
		{
			System.exit(0);
		}

		if(e.getSource()==e1) // for undo

		{
			undom=new UndoManager();
			e1.setEnabled(undom.canUndo());
			tf.getDocument().addUndoableEditListener(this);

			try
			{
				undom.undo();
			}
			catch(CannotRedoException cre)
			{
				cre.printStackTrace();
			}
		}
		
		if(e.getSource()==e2) // for cut

		tf.cut();

		if(e.getSource()==e3) // for copy
		tf.copy();


		if(e.getSource()==e4) // for paste
		tf.paste();


		if(e.getSource()==e6) //to find a text class is explained below
		{
			 new Find();                 	
		}

		if(e.getSource()==e7) //to find a next Text
		{
			new FindNext();
		}

		if(e.getSource()==e8) //to replace a Text
		{
			new Replace();
		}

		if(e.getSource()==e9) //to goto a line 
		new GoTo();

		if(e.getSource()==e10) // to select all Text
		{
			String str=tf.getText();
			int len=str.length();

			tf.select(0,len);
		}

		if(e.getSource()==e11) //to print date in Notepad
		{
			Date d=new Date();
			DateFormat df=new SimpleDateFormat("HH:mm:ss dd/MM/yyy");
			String date=df.format(d);
        		int loc=tf.getCaretPosition();
        		tf.insert(date,loc);
		}

		if(e.getSource()==fo1) // to set WordWrap and vice versa
		{
			if(wordwrap%2==0)
			{
				tf.setLineWrap(true);
				wordwrap++;
			}
			else
			{
				tf.setLineWrap(false);
				wordwrap++;
			}
		}

		if(e.getSource()==fo2) // For Setting up Font Dialog Box
		{

			fontFr=new JFrame("Font");
			fontFr.setSize(450,500);

			fontFr.setLayout(null);

			fontCb1=new JComboBox(font);
			fontCb1.setBounds(20,20,100,30);
			fontFr.add(fontCb1);


			fontCb2=new JComboBox(style);
			fontCb2.setBounds(150,20,100,30);
			fontFr.add(fontCb2);

			fontCb3=new JComboBox(size);
			fontCb3.setBounds(280,20,100,30);

			fontFr.add(fontCb3);


			fontlb1=new JLabel("AaBbXx");

			fontlb1.setBounds(100,100,150,200);

			fontFr.add(fontlb1);

			fontB1=new JButton("OK");

			fontB1.setBounds(175,350,100,30);

			fontFr.add(fontB1);

			fontB1.addActionListener(this);
			fontFr.setVisible(true);
			t1=new Timer(100,this);
			t1.start();
		}



		//For Font Sample of font
		if(e.getSource()==t1)

		{
	
		String font1=(String)fontCb1.getSelectedItem();
 
			String style1=(String)fontCb2.getSelectedItem();
			String siz=(String)fontCb3.getSelectedItem();

			int size1=Integer.parseInt(siz);


			if(style1=="Bold")
			{
				Font f=new Font(font1,Font.BOLD,size1);
				fontlb1.setFont(f);
			}



			else if(style1=="Italic")

			{

				Font f=new Font(font1,Font.ITALIC,size1);
				fontlb1.setFont(f);
			}

			else

			{
				Font f=new Font(font1,Font.PLAIN,size1);
				fontlb1.setFont(f);
			}

		}

		if(e.getSource()==fontB1) // for Font Ok Button i.e to implement font
		{
			fontFr.dispose();
			String font1=(String)fontCb1.getSelectedItem();
 
			String style1=(String)fontCb2.getSelectedItem();
			String siz=(String)fontCb3.getSelectedItem();

			int size1=Integer.parseInt(siz);

			if(style1=="Bold")
			{

				Font f=new Font(font1,Font.BOLD,size1);
				tf.setFont(f);
			}

			else if(style1=="Italic")
			{

				Font f=new Font(font1,Font.ITALIC,size1);
				tf.setFont(f);
			}


			else

			{

				Font f=new Font(font1,Font.PLAIN,size1);
				tf.setFont(f);
			}
		}

		if(e.getSource()==v1) // to display status bar
		{
			tf.addCaretListener(this);
			if(status%2==0)
			{
				tf1.setVisible(true);
				status++;
			}
			else
			{
				tf1.setVisible(false);
				status++;
			}
		}

		if(e.getSource()==h2) //to get about notepad 
		{
			new AboutNotepad();	
		}
	
		
	}
	
	//call back method of status bar
	public void caretUpdate(CaretEvent ce) 
	{
		int linenum=1;
		int columnnum=1;

		try 
		{
			int caretpos=tf.getCaretPosition();
			linenum=tf.getLineOfOffset(caretpos);
		
			columnnum=caretpos-tf.getLineStartOffset(linenum);
			linenum += 1;
		}
		catch(Exception ex) 
		{}
		tf1.setText("Line:\t"+linenum+"\tColumn:\t"+columnnum);	
	}

	public static void main(String s[])
	{
		new Notepad();
	}

}

class Find implements ActionListener
{
	JFrame fr;
	JTextField tf1;
	JButton b1,b2;
	JLabel lb1;
	int len;
	int index;

	Find()
	{
		fr=new JFrame("Find");
		fr.setSize(350,175);
		fr.setLayout(null);

		lb1=new JLabel("Find what");
		lb1.setBounds(10,30,90,20);

		tf1=new JTextField();
		tf1.setBounds(90,30,130,20);

		b1=new JButton("Find");
		b1.setBounds(235,30,95,20);

		b2=new JButton("Cancel");
		b2.setBounds(240,80,80,25);

		b1.addActionListener(this);
		b2.addActionListener(this);

		fr.add(lb1);
		fr.add(tf1);
		fr.add(b1);
		fr.add(b2);

		fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str=tf1.getText();
			String str1=Notepad.tf.getText();
			len=str.length();
			index=str1.indexOf(str,index+len);
			Notepad.tf.select(index,index+len);

			fr.dispose();		
		}
		if(e.getSource()==b2)
		{
			fr.dispose();
		}
	}
}

class GoTo implements ActionListener
{
	JFrame fr;
	JTextField tf1;
	JButton b1,b2;
	JLabel lb1;
	int len;
	int index;

	GoTo()
	{
		fr=new JFrame("GoTo");
		fr.setSize(350,175);
		fr.setLayout(null);

		lb1=new JLabel("Line No");
		lb1.setBounds(10,30,90,20);

		tf1=new JTextField();
		tf1.setBounds(90,30,130,20);

		b1=new JButton("GoTo");
		b1.setBounds(235,30,95,20);

		b2=new JButton("Cancel");
		b2.setBounds(240,80,80,25);

		b1.addActionListener(this);
		b2.addActionListener(this);

		fr.add(lb1);
		fr.add(tf1);
		fr.add(b1);
		fr.add(b2);
		
		fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{	
			String str1=tf1.getText();
			int linenum=Integer.parseInt(str1);
		//	Notepad.tf.setOffset(linenum-1);
		//	Notepad.tf.setCaretPosition(linenum-1);
			fr.dispose();		
		}
		if(e.getSource()==b2)
		{
			fr.dispose();
		}
	}
}

class FindNext implements ActionListener
{
	JFrame fr;
	JTextField tf1;
	JButton b1,b2;
	JLabel lb1;
	int len;
	int index;

	FindNext()
	{
		fr=new JFrame("Find next");
		fr.setSize(350,175);
		fr.setLayout(null);

		lb1=new JLabel("Find what");
		lb1.setBounds(10,30,90,20);

		tf1=new JTextField();
		tf1.setBounds(90,30,130,20);

		b1=new JButton("Find Next");
		b1.setBounds(235,30,95,20);

		b2=new JButton("Cancel");
		b2.setBounds(240,80,80,25);

		b1.addActionListener(this);
		b2.addActionListener(this);

		fr.add(lb1);
		fr.add(tf1);
		fr.add(b1);
		fr.add(b2);

		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str=tf1.getText();
			String str1=Notepad.tf.getText();
			len=str.length();
			index=str1.indexOf(str,index+len);
			Notepad.tf.select(index,index+len);		
		}
		if(e.getSource()==b2)
		{
			fr.dispose();
		}
	}
}

class Replace implements ActionListener
{
	JFrame fr;
	JTextField tf1,tf2;
	JButton b1,b2,b3;
	JLabel lb1,lb2;
	int len;
	int index;

	Replace()
	{
		fr=new JFrame("Replace");
		fr.setSize(380,200);
		fr.setLayout(null);
		lb1=new JLabel("Find what :");
		lb1.setBounds(10,20,90,20);

		lb2=new JLabel("Replace with");
		lb2.setBounds(10,50,100,20);

		tf1=new JTextField();
		tf1.setBounds(90,20,130,20);

		tf2=new JTextField();
		tf2.setBounds(90,50,130,20);

		b1=new JButton("Find");
		b1.setBounds(240,20,100,20);

		b2=new JButton("Replace");
		b2.setBounds(240,50,100,20);

		b3=new JButton("Cancel");
		b3.setBounds(250,120,80,23);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		fr.add(lb1);
		fr.add(tf1);
		fr.add(tf2);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		fr.add(lb2);

		fr.setVisible(true); 
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str=tf1.getText();
			String str1=Notepad.tf.getText();
			len=str.length();
			index=str1.indexOf(str,index+len);			
			Notepad.tf.select(index,index+len);		
		}
		if(e.getSource()==b2)
		{
			String str=tf2.getText();
			Notepad.tf.replaceRange(str,index,index+len);
		}
		if(e.getSource()==b3)
		{
			fr.dispose();
		}
	}
}

class AboutNotepad implements ActionListener
{
	JFrame fr;
	JTextArea ar;
	JButton b1;
	
	AboutNotepad()
	{
		fr=new JFrame("About Notepad");
		fr.setSize(460,330);
		fr.setLayout(null);

		ar=new JTextArea("Microsoft Windows\nVersion 1.0(Build 0001)\n\nCopyRight JatinCorporation. All rights Reserved.\nThe Windows 8.1 SL OS and its user InterFace Are\nprotected by trademark and other pending or existing intellectual property\n rights in INDIA and \n other country/regions\n\n\nThis product is licenced under  MYOWN SOFTWARE LICENCE \nTERMS TO:\nJatin Soni");
		ar.setBounds(10,10,430,230);
		ar.setEditable(false);
		ar.setBackground(Color.white);

		b1=new JButton("OK");
		b1.setBounds(160,250,100,30);

		fr.add(b1);
		fr.add(ar);

		b1.addActionListener(this);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		fr.dispose();
	}
}