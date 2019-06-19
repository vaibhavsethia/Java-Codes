import java.awt.*;
import java.applet.*;
public class AppletTest extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello",10,30);
g.drawRect(50,50,150,100);
g.setColor(Color.red);
g.fillRect(50,50,140,90);
g.drawOval(200,200,50,50);
}
}