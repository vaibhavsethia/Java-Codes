import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Calender implements ActionListener
{
    JFrame fr;
    JButton b1;
    JTextField tf1,tf2,tf3,tf4;
    JLabel l1,l2,l3,l4;
    int ey,day,month,year,mfinal;
    String d3;
    Calender()
    {
        fr = new JFrame("Calender");
        fr.setSize(600,600);
        fr.setLayout(null);
        l1 = new JLabel("Day");
        l2 = new JLabel("Month");
        l3 = new JLabel("Year");
        l4 = new JLabel("Resulant Day");
        l1.setBounds(20,20,60,80);
        l2.setBounds(20,150,60,80);
        l3.setBounds(20,280,60,80);
        l4.setBounds(20,410,100,80);
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf1.setBounds(120,20,400,80);
        tf2.setBounds(120,150,400,80);
        tf3.setBounds(120,280,400,80);
        tf4.setBounds(120,410,400,80);
        b1 = new JButton("Calculate");
        b1.setBounds(120,500,400,50);
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(tf3);
        fr.add(tf4);
        fr.add(b1);
        b1.addActionListener(this);
        fr.setVisible(true);
    }
    public String calculate(int d,int m,int y)
    {
        int td,ly=0,ny=0,m2=1,m3=1;
         for(int i = 1;i<=year-1;i++)
        {
            if(i%4==0)
            {
                ly++;
            }
            else
            {
                ny++;
            }
        }
        for(int i=1;i<=m;i++)
        {
        switch(i)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
            m2 += (m*31);
            break;
            
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            m2 += (m*30);
            break;
            
            case 2:
            if(year%100==0||year%400==0||year%4==0)
            {                
                m3 = 29;
            }
            else
            {
                m3 = 28;
            }
            
        }
        }
        mfinal = m2+m3;
        td = (ly*366)+(ny*365)+mfinal+d;
        int r = td%7;
        switch(r-1)
        {
        case 0:
        d3 = "Sunday";
        break;
        
        case 1:
        d3 = "Monday";
        break;
        
        case 2:
        d3 = "Tuesday";
        break;
        
        case 3:
        d3 = "Wednesday";
        break;
        
        case 4:
        d3 = "Thursday";
        break;
        
        case 5:
        d3 = "Friday";
        break;
        
        case 6:
        d3 = "Saturday";
        break;
        }
        return d3;
    }
    public void actionPerformed(ActionEvent e)
    {
        day = Integer.parseInt(tf1.getText());
        month = Integer.parseInt(tf2.getText());
        year = Integer.parseInt(tf3.getText());
        String result = new Calender().calculate(day,month,year);
        if(e.getSource()==b1)
        {
            tf4.setText(result);
        }
    }
    public static void main(String S[])
    {
        new Calender();
    }
}