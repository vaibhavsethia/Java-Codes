import java.awt.*;	
import javax.swing.*;
import javax.swing.event.*;
class JSliderTest implements ChangeListener
{
JFrame fr;
JTextField tf;
JSlider js1,js2,js3;
JSliderTest()
{
fr  = new JFrame("JSLIDER");
fr.setSize(450,600);
fr.setLayout(null);
tf = new JTextField();
js1 = new JSlider(0,255,0);
js2 = new JSlider(0,255,0);
js3 = new JSlider(0,255,0);
js1.addChangeListener(this);
js2.addChangeListener(this);
js3.addChangeListener(this);
tf.setBounds(20,20,400,150);
js1.setBounds(20,200,400,100);
js2.setBounds(20,320,400,100);
js3.setBounds(20,440,400,100);
js1.setMajorTickSpacing(50);
js1.setMinorTickSpacing(10);
js1.setPaintTicks(true);
js1.setPaintLabels(true);
js2.setMajorTickSpacing(50);
js2.setMinorTickSpacing(10);
js2.setPaintTicks(true);
js2.setPaintLabels(true);
js3.setMajorTickSpacing(50);
js3.setMinorTickSpacing(10);
js3.setPaintTicks(true);
js3.setPaintLabels(true);
js1.setSnapToTicks(true);
js2.setSnapToTicks(true);
js3.setSnapToTicks(true);
fr.add(tf);
fr.add(js1);
fr.add(js2);
fr.add(js3);
fr.setVisible(true);
}
public void stateChanged(ChangeEvent e)
{
int v1 = js1.getValue();
int v2 = js2.getValue();
int v3 = js3.getValue();
tf.setBackground(new Color(v1,v2,v3));
}
public static void main(String ...S)
{
new JSliderTest();
}
}