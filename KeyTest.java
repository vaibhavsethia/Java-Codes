	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	class KeyTest extends KeyAdapter
	{
		int x,y;
		JFrame fr;
		JLabel lb1;
		Icon i;
		KeyTest()
		{
			fr=new JFrame("win frame");
			fr.setLayout(null);
			fr.setSize(1024,768);
			i = new ImageIcon("kt.jpg");
			lb1=new JLabel(i);
			lb1.setBounds(0,0,224,235);
			fr.add(lb1);
			fr.addKeyListener(this);
			fr.setVisible(true);
		}

		public static void main(String s[])
		{
			new KeyTest();
		}
		public void keyPressed(KeyEvent e)
		{
			int key=e.getKeyCode();
			if(key==KeyEvent.VK_LEFT)
			{
				lb1.setBounds(x-=10,y,224,235);
			}
			if(key==KeyEvent.VK_RIGHT)
			{
				lb1.setBounds(x+=10,y,224,235);
			}
			if(key==KeyEvent.VK_UP)
			{
				lb1.setBounds(x,y-=10,224,235);
			}
			if(key==KeyEvent.VK_DOWN)
			{
				lb1.setBounds(x,y+=10,224,235);
			}
		}}