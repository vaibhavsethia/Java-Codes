import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DialogTest2 implements ActionListener
{
JFrame fr;
JButton b1,b2;
JTextField tf;
JDialog d;

DialogTest2()
{
fr= new JFrame ("Dialog Test");
fr.setLayout(null);
fr.setSize(500,500);
d = new JDialog(fr,"Dialog");
d.setLayout(null);
d.setSize(275,300);
b1 = new JButton("Show Dialog Box");
b1.setBounds(100,100,200,100);
fr.add(b1);
b1.addActionListener(this);
b2 = new JButton("Welcome");
b2.setBounds(30,30,200,200);
d.add(b2);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
d.setVisible(true);
}
}
public static void main (String S[])
{
new DialogTest2();
}
}