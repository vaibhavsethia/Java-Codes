import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RedCutCopyPaste implements ActionListener
{
JFrame fr;
JTextArea tf;
JButton b1,b2,b3,b4,b5;
Color c;
Font f;
RedCutCopyPaste()
{
fr = new JFrame("TextArea Test");
fr.setSize(275,420);
fr.setLayout(null);
Container c1 = fr.getContentPane();
c1.setBackground(Color.BLUE);	
f = new Font("Jokerman",Font.ITALIC,30);
b1 = new JButton("Red");
b2 = new JButton("Cut");
b3 = new JButton("Copy");
b4 = new JButton("Paste");
b5 = new JButton("Font");
tf = new JTextArea();
c = new Color(255,0,0);
tf.setBounds(20,20,220,100);
b1.setBounds(20,140,100,100);
b2.setBounds(140,140,100,100);
b3.setBounds(20,260,100,100);
b4.setBounds(140,260,100,45);
b5.setBounds(140,315,100,45);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
fr.add(tf);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.add(b4);
fr.add(b5);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
tf.setBackground(c);
//We can set Background like this also:
//tf.setBackground(Color.RED);
}
if(e.getSource()==b2)
{
tf.cut();
}
if(e.getSource()==b3)
{
tf.copy();
}
if(e.getSource()==b4)
{
tf.paste();
}
if(e.getSource()==b5)
{
tf.setFont(f);
}
}
public static void main(String ...S)
{
new RedCutCopyPaste();
}
}