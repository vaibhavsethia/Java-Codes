import java.awt.*;
import javax.swing.*;
class BorderLayout1
{
JFrame fr;
JButton b1,b2,b3,b4,b5;
JPanel p1,p2;
BorderLayout1()
{
fr = new JFrame("Layout Test");
fr.setSize(1920,1080);
fr.setLayout(new BorderLayout());
p1 = new JPanel();
p2 = new JPanel();

p1.setSize(300,300);
p2.setSize(300,300);

b1 = new JButton("First Button");
b2 = new JButton("Second Button");
b3 = new JButton("Third Button");
b4 = new JButton("Fourth Button");
b5 = new JButton("Fifth Button");
p1.setBackground(Color.red);
p1.add(b1,BorderLayout.NORTH);
p1.add(b2,BorderLayout.SOUTH);
p2.add(b3,BorderLayout.EAST);
p2.add(b4,BorderLayout.WEST);
p2.add(b5,BorderLayout.CENTER);
fr.add(p1);
fr.add(p2);
fr.setVisible(true);
}
public static void main(String S[])
{
new BorderLayout1();
}
}