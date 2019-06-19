import java.awt.*;
class FrameTest
{
public static void main (String ...S)
{
Frame fr = new Frame("JATIN SONI");
fr.setSize(400,400);
fr.setVisible(true);
Button b1 = new Button("Button of My Frame");
fr.add(b1);
TextField tf1 = new TextField("Hello");
fr.add(tf1);
}
}