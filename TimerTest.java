import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TimerTest implements ActionListener
{
Timer T1;
JFrame fr;
int m;
TimerTest()
{
fr = new JFrame("Timer Test");
fr.setSize(500,500);
fr.setLayout(null);
T1 = new Timer(500,this);
T1.start();
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==T1)
{
Container c = fr.getContentPane();
if(m==0)
{
c.setBackground(Color.RED);
m = 1;
}
else if(m==1)
{
c.setBackground(Color.BLUE);
m = 2;
}
else
{
c.setBackground(Color.GREEN);
m = 0;
}
}
}
public static void main(String ...S)
{
new TimerTest();
}
}