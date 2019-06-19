import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ButtonsHW implements ActionListener
{
int count;
JFrame fr;
String s1[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","Show","Reset"};
JButton b[] = new JButton[s1.length];
JPanel p1,p2;
ButtonsHW()
{
fr = new JFrame("Button");
fr.setSize(900,800);
fr.setLayout(new GridLayout());
p1 = new JPanel();
p1.setLayout(new GridLayout(4,4));
p2 = new JPanel(new GridLayout(2,1));
for(int i=0;i<s1.length;i++)
{
b[i] = new JButton(s1[i]);
}
for(int i=0;i<s1.length-2;i++)
{
b[i].setVisible(false);
}
p1.setSize(800,800);
p2.setSize(100,800);
for(int i=0;i<s1.length;i++)
{
p1.add(b[i]);
if(i>=16)
{
p2.add(b[i]);
b[i].addActionListener(this);
}
}
fr.add(p1);
fr.add(p2);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b[17])
{
count = 0;
for(int i=0;i<s1.length-2;i++)
{
b[i].setVisible(false);
}
}

if(e.getSource()==b[16])
{
while(true)
{
if(count==16)
{
JOptionPane.showMessageDialog(fr,"All buttons are visible","msg",JOptionPane.INFORMATION_MESSAGE);
break;
}
int x = (int)(Math.random()*16);
if(b[x].isVisible())
continue;
b[x].setVisible(true);
count++;
break;
}
}
}
public static void main(String ...S)
{
new ButtonsHW();
}
}