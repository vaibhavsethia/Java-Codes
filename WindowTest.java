import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class WindowTest extends WindowAdapter
{
JFrame fr;
JTextField tf;
int i;
WindowTest()
{
fr = new JFrame("Window Test");
fr.setSize(400,400);
fr.setLayout(null);
tf = new JTextField();
tf.setBounds(50,50,200,200);
fr.add(tf);
fr.addWindowListener(this);
fr.setVisible(true);
}
public void windowDeactivated(WindowEvent e)
{
System.out.println("Window Deactivated");
}
public void windowActivated(WindowEvent a)
{
tf.setText("Window Activated "+i);
i++;
}
public static void main(String ...S)
{
new WindowTest();
}
}