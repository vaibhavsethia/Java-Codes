import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MenuTest implements ActionListener
{
JFrame fr;
JMenuBar bar;
JMenu m1,m2;
JMenuItem a,b,c;
JTextArea tf;
KeyStroke ks1,ks2,ks3;
MenuTest()
{
fr = new JFrame("JMenuBar Test");
fr.setLayout(null);
fr.setSize(500,500);
bar = new JMenuBar();
fr.setJMenuBar(bar);
m1 = new JMenu("Color");
m2 = new JMenu("Font");
bar.add(m1);
bar.add(m2);
a = new JMenuItem("Red");
b = new JMenuItem("Blue");
c = new JMenuItem("Green");
m1.add(a);
m1.add(b);
m1.add(c);
m1.setMnemonic(KeyEvent.VK_C);
m2.setMnemonic(KeyEvent.VK_F);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
tf = new JTextArea();
tf.setBounds(0,0,fr.getWidth()-10,fr.getHeight()-50);

ks1 = KeyStroke.getKeyStroke(KeyEvent.VK_R,KeyEvent.CTRL_MASK);
a.setAccelerator(ks1);
ks2 = KeyStroke.getKeyStroke(KeyEvent.VK_B,KeyEvent.CTRL_MASK);
b.setAccelerator(ks2);
ks3 = KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_MASK);
c.setAccelerator(ks3);

fr.add(tf);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==a)
tf.setBackground(Color.RED);

if(e.getSource()==b)
tf.setBackground(Color.BLUE);

if(e.getSource()==c)
tf.setBackground(Color.GREEN);
}
public static void main(String S[])
{
new MenuTest();
}
}