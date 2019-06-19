import java.awt.*;
import java.awt.event.*; 
class Source implements ActionListener
{
Button b1,b2;
Frame fr;
TextField tf;
Source()
{
fr = new Frame("My Frame");
fr.setLayout(null);
fr.setSize(450	,500);
b1 = new Button("Msg");
b2 = new Button("Hello");
b1.setBounds(20,20,400,100);
b2.setBounds(20,140,400,100);
fr.add(b1);
fr.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
tf = new TextField();
tf.setBounds(20,260,400,200);
fr.add(tf);
fr.setVisible(true);
}	
public void actionPerformed(ActionEvent e)
{
if(e.getActionCommand().equals("Msg"))
tf.setText("Msg button clicked");
if(e.getActionCommand().equals("Hello"))
tf.setText("Hello button clicked");
}
public static void main(String ...S)
{
new Source();
}
}