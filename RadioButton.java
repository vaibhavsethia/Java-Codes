import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RadioButton implements ItemListener
{
JFrame fr;
JRadioButton rb1,rb2;
JTextArea tf;
ButtonGroup bg;
RadioButton()
{
fr = new JFrame("Check Test");
fr.setSize(415,500);
fr.setLayout(null);
tf = new JTextArea();
tf.setBounds(20,20,360,200);
bg = new ButtonGroup();
rb1 = new JRadioButton("BLUE");
rb2 = new JRadioButton("GREEN");
rb1.setBounds(20,240,100,80);
rb2.setBounds(20,340,100,80);
fr.add(tf);
bg.add(rb1);
bg.add(rb2);
fr.add(rb1);
fr.add(rb2);
rb1.addItemListener(this);
rb2.addItemListener(this);
fr.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==rb1)
{
tf.setBackground(Color.BLUE);
}
if(e.getSource()==rb2)
{
tf.setBackground(Color.GREEN);
}
}
public static void main (String ...S)
{
new RadioButton();
}
}