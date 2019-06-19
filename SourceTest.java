import java.awt.*;
import java.awt.event.*;
class SourceTest
{
Frame fr;
Button b1,b2;
static TextField tf;
SourceTest()
{
fr = new Frame("Source Test");
fr.setSize(320,400);
fr.setLayout(null);
b1 = new Button("Show");
b1.setBounds(30,40,100,40);
fr.add(b1);
b2 = new Button("Hide");
b2.setBounds(160,40,100,40);
fr.add(b2);
tf = new TextField();
tf.setBounds(30,300,230,40);
fr.add(tf);
MyListener my = new MyListener();
b1.addActionListener(my);
b2.addActionListener(my);
fr.setVisible(true);
}
public static void main(String ...S)
{
new SourceTest();
}
}
class MyListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("Show"))
{
System.out.println("Show Button Clicked");
SourceTest.tf.setText("Show Botton Clicked");
}
if(e.getActionCommand().equals("Hide"))
{
System.out.println("Hide Button Clicked");
SourceTest.tf.setText("Hide Botton Clicked");
}
}
}