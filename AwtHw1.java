import java.awt.*;
import java.awt.event.*;
class AwtHw1 implements ActionListener
{
Frame fr;
Button b1,b2,b3,b4;
TextField t1,t2,t3;
AwtHw1()
{
fr = new Frame("AwtHw1");
fr.setSize(500,400);
fr.setLayout(null);
b1 = new Button("Add");
b2 = new Button("Subtract");s
b3 = new Button("Multiply");
b4 = new Button("Divide");
Label l1 = new Label("First NUMBER");
l1.setBounds(10,100,200,40);
Label l2 = new Label("Seconcd NUMBER");
l2.setBounds(10,150,200,40);
Label l3 = new Label("Result");
l3.setBounds(10,290,200,40);
t1 = new TextField();
t2 = new TextField();
t3 = new TextField();
t1.setBounds(220,100,200,40);
t2.setBounds(220,150,200,40);
t3.setBounds(220,290,200,40);
b1.setBounds(10,200,80,50);
b2.setBounds(100,200,80,50);
b3.setBounds(190,200,80,50);
b4.setBounds(280,200,80,50);
fr.add(l1);
fr.add(l2);
fr.add(t1);
fr.add(t2);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.add(b4);
fr.add(l3);
fr.add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
fr.setVisible(true);
}
public static void main (String ...S)
{
new AwtHw1();
}
public void actionPerformed(ActionEvent e)
{
int a = Integer.parseInt(t1.getText());
int b = Integer.parseInt(t2.getText());
if(e.getActionCommand().equals("Add"))
{
int c = a+b;
t3.setText(""+c);
}
else if(e.getActionCommand().equals("Subtract"))
{
int d = a-b;
t3.setText(""+d);
}
else if(e.getActionCommand().equals("Multiply"))
{
int z = a*b;
t3.setText(""+z);
}
else if(e.getActionCommand().equals("Divide"))
{
int f = a/b;
t3.setText(""+f);
}
}
}