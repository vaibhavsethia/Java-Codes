import javax.swing.*;

class ProgressBarTest
{
JFrame fr1,fr2;
JProgressBar bar;
JTextField tf;
ProgressBarTest()
{
fr1 = new JFrame("Frame 1");
fr1.setSize(500,500);
fr1.setLayout(null);
bar = new JProgressBar(1,100);
bar.setBounds(30,300,300,40);
fr1.add(bar);
fr2 = new JFrame("Frame 2");
fr2.setSize(500,500);
fr2.setLayout(null);
tf = new JTextField();
tf.setBounds(20,20,460,100);
fr2.setLayout(null);
fr2.add(tf);
fr1.setVisible(true);
for(int i=1;i<=100;i++)
{
bar.setStringPainted(true);
bar.setValue(i);
bar.setString("Loading..."+i+"%");
try
{
Thread.sleep(100);
}
catch(Exception e)
{}
}
fr1.dispose();
fr2.setVisible(true);
}
public static void main (String S[])
{
new 	ProgressBarTest();
}
}