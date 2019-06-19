import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DialogTest implements ActionListener
{
JFrame fr;
JButton b1,b2,b3;
JTextField tf;

DialogTest()
{
fr= new JFrame ("Dialog Test");
fr.setLayout(null);
fr.setSize(500,500);

b1= new JButton("Error Message Button");
b1.setBounds(50,50,375,70);
fr.add(b1);

b2= new JButton("Confirm Button");
b2.setBounds(50,140,375,70);
fr.add(b2);

b3= new JButton("Input Button");
b3.setBounds(50,230,375,70);
fr.add(b3);

tf = new JTextField();
tf.setBounds(0,0,500,40);
fr.add(tf);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
JOptionPane.showMessageDialog(fr,"This is the dialog box","Hello",JOptionPane.ERROR_MESSAGE);
}

if(e.getSource()==b2)
{
int x = JOptionPane.showConfirmDialog(fr,"Swing is the extension of AWT","QUEST",JOptionPane.YES_NO_CANCEL_OPTION);

if(x==JOptionPane.YES_OPTION)
tf.setText("Correct");

if(x==JOptionPane.NO_OPTION)
tf.setText("Wrong");

if(x==JOptionPane.CANCEL_OPTION)
tf.setText("You Should Know the Answer!");

}

if(e.getSource()==b3)
{
String x = JOptionPane.showInputDialog(fr,"Enter your name","");
if(x!=null)
{
tf.setText("Welcome "+x);
}
else
{
tf.setText("Welcome abc");
}
}

}

public static void main(String s[])
{
new DialogTest();
}
}