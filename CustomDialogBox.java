import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DialogTestHW implements ActionListener
{
String s1[]={"Bradley Hand ITC","Jokerman","Verdana"};
String s2[]={"Bold","Italic","Plain"};
String s3[]={"18","20","22","24"};
JFrame fr;
JButton b1,b2;
JTextField tf;
JDialog d;
JComboBox cb1,cb2,cb3;

DialogTestHW()
{
fr= new JFrame ("Dialog Test");
fr.setLayout(null);
fr.setSize(500,500);
d = new JDialog(fr,"Dialog");
d.setLayout(null);
d.setSize(400,400);
tf = new JTextField();
tf.setBounds(50,50,300,250);
b1 = new JButton("Show Font");
b1.setBounds(50,400,300,40);
fr.add(b1);
b2 = new JButton("OK");
b2.setBounds(100,300,100,50);
d.add(b2);

cb1 = new JComboBox(s1);
cb1.setBounds(10,10,80,40);
cb2 = new JComboBox(s2);
cb2.setBounds(120,10,80,40);
cb3 = new JComboBox(s3);
cb3.setBounds(250,10,80,40);
b1.addActionListener(this);
b2.addActionListener(this);
d.add(cb1);
d.add(cb2);
d.add(cb3);
fr.add(tf);
fr.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
d.setVisible(true);
}
if(e.getSource()==b2)
{
d.setVisible(false);
}
String n = (String)cb1.getSelectedItem();
String style = (String)cb2.getSelectedItem();
int x=1;
int s=16;
if(style.equals("Bold"))
x = Font.BOLD;

if(style.equals("Italic"))
x = Font.ITALIC;

if(style.equals("Plain"))
x = Font.PLAIN;

String size = (String)cb3.getSelectedItem();
s=Integer.parseInt(size);
if(e.getSource()==b2)
tf.setFont(new Font(n,x,s));
}
public static void main (String S[])
{
new DialogTestHW();
}
}