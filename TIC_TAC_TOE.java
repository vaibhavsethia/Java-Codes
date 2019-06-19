import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TIC_TAC_TOE implements ActionListener
{
	JFrame fr,fr2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,op1,op2;
	int c=2,count;
	TIC_TAC_TOE()
	{
		fr = new JFrame("TIC TAC TOE");
		fr.setSize(600,600);
		fr.setLayout(new GridLayout(3,3));
		
		fr2 = new JFrame("TIC TAC TOE");
		fr2.setLayout(null);
		fr2.setSize(290,250);
		
		b1 = new JButton("");
		b2 = new JButton("");
		b3 = new JButton("");
		b4 = new JButton("");
		b5 = new JButton("");
		b6 = new JButton("");
		b7 = new JButton("");
		b8 = new JButton("");
		b9 = new JButton("");
		op1 = new JButton("Player vs. Player");
		op2 = new JButton("Player vs. CPU");
		
		op1.setBounds(25,50,225,50);
		op2.setBounds(25,125,225,50);
		
		op1.addActionListener(this);
		op2.addActionListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		fr2.add(op1);
		fr2.add(op2);
		
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		fr.add(b4);
		fr.add(b5);
		fr.add(b6);
		fr.add(b7);
		fr.add(b8);
		fr.add(b9);
		
		fr2.setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==op1)
			{
			fr2.dispose();
			fr.setVisible(true);
			}
			
			if(e.getSource()==op2)
			JOptionPane.showMessageDialog(fr,"Coming Soon","Coming Soon",JOptionPane.INFORMATION_MESSAGE);
			
			if(e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5||e.getSource()==b6||e.getSource()==b7||e.getSource()==b8||e.getSource()==b9)
			{
			count++;
			if(e.getSource()==b1)
			{
				if(c%2==0)
				b1.setText("X");
				else
				b1.setText("O");
				
				c++;
			}
			if(e.getSource()==b2)
			{
				if(c%2==0)
				b2.setText("X");
				else
				b2.setText("O");
				
				c++;
			}
			if(e.getSource()==b3)
			{
				if(c%2==0)
				b3.setText("X");
				else
				b3.setText("O");
				
				c++;
			}
			if(e.getSource()==b4)
			{
				if(c%2==0)
				b4.setText("X");
				else
				b4.setText("O");
				
				c++;
			}
			if(e.getSource()==b5)
			{
				if(c%2==0)
				b5.setText("X");
				else
				b5.setText("O");
				
				c++;
			}
			if(e.getSource()==b6)
			{
				if(c%2==0)
				b6.setText("X");
				else
				b6.setText("O");
				
				c++;
			}
			if(e.getSource()==b7)
			{
				if(c%2==0)
				b7.setText("X");
				else
				b7.setText("O");
				
				c++;
			}
			if(e.getSource()==b8)
			{
				if(c%2==0)
				b8.setText("X");
				else
				b8.setText("O");
				
				c++;
			}
			if(e.getSource()==b9)
			{
				if(c%2==0)
				b9.setText("X");
				else
				b9.setText("O");
				
				c++;
			}
			
			
			if(b1.getActionCommand().equals("O")&&b2.getActionCommand().equals("O")&&b3.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b4.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b6.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b7.getActionCommand().equals("O")&&b8.getActionCommand().equals("O")&&b9.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b1.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b9.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b3.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b7.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(b1.getActionCommand().equals("X")&&b2.getActionCommand().equals("X")&&b3.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b4.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b6.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b7.getActionCommand().equals("X")&&b8.getActionCommand().equals("X")&&b9.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b1.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b9.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b3.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b7.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
			}
			if(count==8)
			win();
		}
		public void win()
		{
			if(b1.getActionCommand().equals("O")&&b2.getActionCommand().equals("O")&&b3.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b4.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b6.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b7.getActionCommand().equals("O")&&b8.getActionCommand().equals("O")&&b9.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b1.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b9.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b3.getActionCommand().equals("O")&&b5.getActionCommand().equals("O")&&b7.getActionCommand().equals("O"))
			{
				JOptionPane.showMessageDialog(fr,"Player Two Wins","Player Two wins",JOptionPane.INFORMATION_MESSAGE);
			}
			
			if(b1.getActionCommand().equals("X")&&b2.getActionCommand().equals("X")&&b3.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b4.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b6.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b7.getActionCommand().equals("X")&&b8.getActionCommand().equals("X")&&b9.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b1.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b9.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
			if(b3.getActionCommand().equals("X")&&b5.getActionCommand().equals("X")&&b7.getActionCommand().equals("X"))
			{
				JOptionPane.showMessageDialog(fr,"Player One Wins","Player One wins",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		public void gameEnd()
		{
			if(count==8)
			{
				win();
			}
		}
		public static void main(String ...S)
		{
			new TIC_TAC_TOE();
		}
}