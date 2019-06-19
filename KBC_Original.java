import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class KBC_Original implements ActionListener
{
String ques[] = {"Q1.Who is the Prime Minister of India .","Q2.Who is the CEO of Apple .","Q3.Who is the Founder of The Company Pagani .","Q4.Which is the world's fastsest road legal car .","Q5.Which Fuel is used in Drag Racing ."};
String opn1[] = {"Narendra Modi","Steve Jobs","Anil Dhirubai Ambani","Al-an-abi Dragster","Methanol"};
String opn2[] = {"Manmohan Singh","Tim Cook","Henry Ford","Koienegsegg Agera","Petrol"};
String opn3[] = {"Pratibha Patil","Matt Alonso","Horacio Pagani","Thrust SSC","Top Fuel"};
String opn4[] = {"Rajendra Prasad","Arachduke Ferdinand","Richard Rowlings","Bugatti Veyron 16.4 SS","Diesel"};
String ans[] = {"Narendra Modi","Tim Cook","Horacio Pagani","Bugatti Veyron 16.4 SS","Top Fuel"};
JFrame fr,fr2;
JRadioButton rb1,rb2,rb3,rb4;
JLabel lb1,lb2,lb3;
JButton b1,b2;
JProgressBar bar;
Timer T1,T2;
Color c,col;
Font f;
int t=10;
int count,ca;
KBC()
{
fr = new JFrame("KBC");
fr.setSize(485,700);
fr.setLayout(null);

fr2 = new JFrame("KBC");
fr2.setSize(485,700);
fr2.setLayout(null);

c = new Color(100,50,250);
Container c1 = fr.getContentPane();
c1.setBackground(c);

bar = new JProgressBar(1,100);
bar.setBounds(70,300,300,40);
fr2.add(bar);
fr2.setVisible(true);

Container c2 = fr2.getContentPane();
col = new Color(100,50,250);
c2.setBackground(col);

T1 = new Timer(10000,this);
T2 = new Timer(1000,this);
T2.start();
f = new Font("Jokerman",Font.ITALIC,15);
b1 = new JButton("Submit");
b2 = new JButton("Next");
lb1 = new JLabel(ques[0]);
lb2 = new JLabel();
lb3 = new JLabel("Time : "+t+" Seconds");
lb1.setFont(f);
lb1.setForeground(Color.WHITE);
lb1.setBounds(100,20,400,200);
lb1.setFont(f);
lb3.setForeground(Color.WHITE);
lb3 .setBounds(360,100,400,200);

rb1 = new JRadioButton(opn1[0]);
rb2 = new JRadioButton(opn2[0]);
rb3 = new JRadioButton(opn3[0]);
rb4 = new JRadioButton(opn4[0]);

ButtonGroup bg = new ButtonGroup();

bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);

rb1.setBackground(c);
rb2.setBackground(c);
rb3.setBackground(c);
rb4.setBackground(c);

rb1.setFont(f);
rb1.setForeground(Color.WHITE);

rb2.setFont(f);
rb2.setForeground(Color.WHITE);

rb3.setFont(f);
rb3.setForeground(Color.WHITE);

rb4.setFont(f);
rb4.setForeground(Color.WHITE);

rb1.setBounds(20,250,200,20);
rb2.setBounds(250,250,200,20);
rb3.setBounds(20,380,200,20);
rb4.setBounds(250,380,200,20);

b1.setBounds(20,500,200,75);
lb2.setForeground(Color.WHITE);
b2.setBounds(250,500,200,75);
lb2.setBounds(150,400,200,150);
lb2.setFont(f);

fr.add(rb1);
fr.add(rb2);
fr.add(rb3);
fr.add(rb4);
fr.add(b1);
fr.add(b2);
fr.add(lb1);
fr.add(lb2);
fr.add(lb3);

b1.addActionListener(this);
b2.addActionListener(this);

for(int i=1;i<=100;i++)
{
bar.setStringPainted(true);
bar.setValue(i);
bar.setString("Loading..."+i+"%");
try
{
Thread.sleep(100);
}
catch(Exception e)
{}
}
fr2.dispose();
T1.start();
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String an="";
if(e.getSource()==b1)
{

T1.stop();

if(rb1.isSelected())
an=rb1.getText();
if(rb2.isSelected())
an=rb2.getText();
if(rb3.isSelected())
an=rb3.getText();
if(rb4.isSelected())
an=rb4.getText();
if(an.equals(ans[count]))
{
	lb2.setText(" Correct answer");
	ca=ca+20;
}
else
{
	lb2.setText("Wrong answer");
}
}

if(e.getSource()==b2)
{	
	T1.stop();
	T1.start();
	try
	{
	count++;
	lb1.setText(ques[count]);
	lb2.setText("");
	rb1.setText(opn1[count]);
	rb2.setText(opn2[count]);
	rb3.setText(opn3[count]);
	rb4.setText(opn4[count]);
	}
	catch(Exception ex){}
	if(count==5)
	{
		lb1.setText("Your Score is : "+ca);
		lb2.setVisible(false);
		rb1.setVisible(false);
		rb2.setVisible(false);
		rb3.setVisible(false);
		rb4.setVisible(false);
	}
}

if(e.getSource()==T1)
{	
	T1.stop();
	T1.start();
	try
	{
	count++;
	lb1.setText(ques[count]);
	lb2.setText("");
	rb1.setText(opn1[count]);
	rb2.setText(opn2[count]);
	rb3.setText(opn3[count]);
	rb4.setText(opn4[count]);
	}
	catch(Exception ex){}
	if(count==5)
	{
		lb1.setText("Your Score is : "+ca);
		lb2.setVisible(false);
		rb1.setVisible(false);
		rb2.setVisible(false);
		rb3.setVisible(false);
		rb4.setVisible(false);
	}
}

if(e.getSource()==T2)
{	
	t--;
	lb3.setText("Time : "+t+" Seconds");
	if(t==0)
	{
		t=10;
	}
}
}
public static void main(String ...S)
{
new KBC();
}
}