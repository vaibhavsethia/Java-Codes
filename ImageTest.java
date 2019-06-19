import javax.swing.*;
import java.awt.event.*;
class ImageTest implements ActionListener
{
JFrame fr;
JLabel l1;
JButton b1;
String s1[]={"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg"};
int i;
ImageTest()
{
fr = new JFrame(" Image Test");
fr.setLayout(null);
fr.setSize(1000,1000);
b1 = new JButton("Image");
Icon i = new ImageIcon("1.jpg");
l1 = new JLabel(i);
l1.setBounds(20,20,500,900);
b1.setBounds(20,540,100,40);
fr.add(l1);
b1.addActionListener(this);
fr.add(b1);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
l1.setIcon(new ImageIcon(s1[i]));
i++;
if(i==5)
{
i=0;
}
}
public static void main (String ...S)
{
new ImageTest();
}
}