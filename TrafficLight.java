import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLights implements ActionListener
{
Timer t1,t2;
JFrame fr;
int c1,c2;
JLabel lb1,lb2,lb3,lb4;
TrafficLights()
{
fr = new JFrame("Traffic Lights");
fr.setSize(500,500);
fr.setLayout(null);	
lb1 = new JLabel();
lb2 = new JLabel();
lb3 = new JLabel();
lb4 = new JLabel();
lb1.setBounds(20,20,100,100);
lb2.setBounds(20,140,100,100);
lb3.setBounds(20,260,100,100);
lb4.setBounds(20,380,100,100);
t1 = new Timer(2000,this);
t2 = new Timer(100,this);
lb1.setOpaque(true);
lb2.setOpaque(true);
lb3.setOpaque(true);
lb4.setOpaque(true);
fr.add(lb1);
fr.add(lb2);
fr.add(lb3);
fr.add(lb4);
t1.start();
t2.start();
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==t1)
{
if(c1==0)
{
lb1.setVisible(true);
lb1.setBackground(Color.RED);
lb4.setText("STOP");
lb2.setVisible(false);
lb3.setVisible(false);
c1 = 1;
}
else if(c1==1)
{
lb2.setVisible(true);
lb2.setBackground(Color.YELLOW);
lb4.setText("Ready");
lb1.setVisible(false);
lb3.setVisible(false);
c1 = 2;
}
else if(c1==2)
{
lb3.setVisible(true);
lb3.setBackground(Color.GREEN);
lb4.setText("GO");
lb1.setVisible(false);
lb2.setVisible(false);
c1=0;
}
}

if(e.getSource()==t2)
{
if(c2%2==0)
{
lb4.setVisible(true);
c2++;
}
else
{
lb4.setVisible(false);
c2++;
}
}
}

public static void main(String ...S)
{
new TrafficLights();
}
}