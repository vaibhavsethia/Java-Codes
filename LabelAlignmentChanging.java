import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LabelAlignmentChanging implements ActionListener
{
int x=0;
JLabel lb1[] = new JLabel[5];
JFrame fr;
JButton b1,b2;
int j;
LabelAlignmentChanging()
{
fr = new JFrame();
fr.setSize(450,400);
fr.setLayout(null);
lb1[0] = new JLabel("First");
lb1[1] = new JLabel("Second");
lb1[2] = new JLabel("Third");
lb1[3] = new JLabel("Fourth");
lb1[4] = new JLabel("Fifth");
lb1[0].setHorizontalAlignment(SwingConstants.LEFT);
lb1[1].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[2].setHorizontalAlignment(SwingConstants.LEFT);
lb1[3].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[4].setHorizontalAlignment(SwingConstants.LEFT);
lb1[0].setBounds(50,50,100,50);
lb1[1].setBounds(50,120,100,50);
lb1[2].setBounds(50,190,100,50);
lb1[3].setBounds(50,260,100,50);
lb1[4].setBounds(50,350,100,50);
fr.add(lb1[0]);
fr.add(lb1[1]);
fr.add(lb1[2]);
fr.add(lb1[3]);
fr.add(lb1[4]);
b1 = new JButton("Change");
b2 = new JButton("Change ALL");
b1.setBounds(170,120,200,50);
b2.setBounds(170,260,200,50);
fr.add(b1);
fr.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
if(lb1[j].getHorizontalAlignment()==JLabel.LEFT)
{
lb1[j].setHorizontalAlignment(JLabel.RIGHT);
}
else
{
lb1[j].setHorizontalAlignment(JLabel.LEFT);
}
j++;
if(j==5)
{
j=0;
}
}
if(e.getActionCommand().equals("Change ALL"))
{
if(x==0)
{
lb1[0].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[1].setHorizontalAlignment(SwingConstants.LEFT);
lb1[2].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[3].setHorizontalAlignment(SwingConstants.LEFT);
lb1[4].setHorizontalAlignment(SwingConstants.RIGHT);
x=1;
}
else
{
lb1[0].setHorizontalAlignment(SwingConstants.LEFT);
lb1[1].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[2].setHorizontalAlignment(SwingConstants.LEFT);	
lb1[3].setHorizontalAlignment(SwingConstants.RIGHT);
lb1[4].setHorizontalAlignment(SwingConstants.LEFT);
x=0;
}
}
}
public static void main(String ...S)
{
new LabelAlignmentChanging();
}
}