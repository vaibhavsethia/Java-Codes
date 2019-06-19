import javax.swing.*;
class TabbedTest
{
JFrame fr;
JTabbedPane pane;
JLabel lb1,lb2,lb3,lb4;
TabbedTest()
{
fr = new JFrame("My Frame");
fr.setSize(1920,1080);
fr.setLayout(null);
lb1 = new JLabel(new ImageIcon("1.jpg"));
lb2 = new JLabel(new ImageIcon("2.jpg"));
lb3 = new JLabel(new ImageIcon("3.jpg"));
lb4 = new JLabel(new ImageIcon("4.jpg"));
pane = new JTabbedPane();
pane.setBounds(50,50,1260,600);
pane.addTab("First",lb1);
pane.addTab("Second",lb2);
pane.addTab("Third",lb3);
pane.addTab("Fourth",lb4);
fr.add(pane);
fr.setVisible(true);
}
public static void main (String ...S)
{
new TabbedTest();
}
}