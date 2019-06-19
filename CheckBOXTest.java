import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CheckTest implements ItemListener
{
JFrame fr;
JCheckBox cb1,cb2;
JTextArea tf;
CheckTest()
{
fr = new JFrame("Check Test");
fr.setSize(415,500);
fr.setLayout(null);
tf = new JTextArea();
tf.setBounds(20,20,360,200);
cb1 = new JCheckBox("BLUE");
cb2 = new JCheckBox("GREEN");
cb1.setBounds(20,240,100,80);
cb2.setBounds(20,340,100,80);
fr.add(tf);
fr.add(cb1);
fr.add(cb2);
cb1.addItemListener(this);
cb2.addItemListener(this);
fr.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==cb1)
tf.setBackground(Color.BLUE);
if(e.getSource()==cb2)
tf.setBackground(Color.GREEN);
}
public static void main (String ...S)
{
new CheckTest();
}
}