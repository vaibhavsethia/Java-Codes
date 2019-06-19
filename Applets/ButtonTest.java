import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonTest extends Applet implements ActionListener
{
Button b1,b2;
int flag = 1;
public void init()
{
b1 = new Button("First");
b2 = new Button("Second");
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
flag = 1;

if(e.getSource()==b2)
flag = 2;

repaint();
}
public void paint(Graphics g)
{
if(flag==1)
{
g.setColor(Color.red);
g.fillOval(30,30,100,100);
}
if(flag==2)
{
g.setColor(Color.green);
g.fillRect(30,30,100,100);
}
}
}