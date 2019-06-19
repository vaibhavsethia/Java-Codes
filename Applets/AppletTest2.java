import java.awt.*;
import java.applet.*;
public class AppletTest2 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawRect(30,30,100,100);
g.fillRect(30,30,100,100);

g.setColor(Color.blue);
g.drawRect(130,130,100,100);
g.fillRect(130,130,100,100);

g.setColor(Color.green);
g.drawRect(230,230,100,100);
g.fillRect(230,230,100,100);
}
}