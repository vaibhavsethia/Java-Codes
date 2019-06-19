import java.awt.*;
class AwtTest
{
Frame fr;
Button b1,b2;
AwtTest()
{
fr = new Frame("Awt Test");
fr.setSize(3840,2160);
fr.setLayout(null);
b1 = new Button("Show");
b1.setBounds(30,50,70,40);
fr.add(b1);
b2 = new Button("Hide");
b2.setBounds(120,50,70,40);
fr.add(b2);
fr.setVisible(true);
}
public static void main(String ...S)
{
new AwtTest();
}
}