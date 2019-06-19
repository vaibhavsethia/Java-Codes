import javax.swing.*;
class SwingTest
{
JFrame fr;
JButton b1;
SwingTest()
{
fr = new JFrame();
fr.setSize(400,400);
fr.setLayout(null);
b1 = new JButton("Swing test");
b1.setBounds(100,100,200,100);
fr.add(b1);
fr.setVisible(true);
}
public static void main(String S[])
{
new SwingTest();
}
}