import java.awt.*;
import javax.swing.*;
class Layout1
{
JFrame fr;
JButton b1,b2,b3,b4,b5;
Layout1()
{
fr = new JFrame("Layout Test");
fr.setSize(500,500);
fr.setLayout(new FlowLayout());
b1 = new JButton("First Button");
b2 = new JButton("Second Button");
b3 = new JButton("Third Button");
b4 = new JButton("Fourth Button");
b5 = new JButton("Fifth Button");
fr.add(b1);
fr.add(b2);
fr.add(b2);
fr.add(b3);
fr.add(b4);
fr.setVisible(true);
}
public static void main(String S[])
{
new Layout1();
}
}