import javax.swing.*;
import java.awt.*;
import java .awt.event.*;

class ComboTest implements ActionListener
{
JFrame fr;
JComboBox cb,cb1;
DefaultComboBoxModel hrmodel,mhmodel,mpmodel,upmodel;
ComboTest()
{
fr=new JFrame();
fr.setLayout(null);
fr.setSize(500,500);

String s1[]={"Harayana","Maharashtra","MP","UP"};

cb=new JComboBox(s1);
cb.setBounds(150,200,100,30);
fr.add(cb);

cb1=new JComboBox();
cb1.setBounds(300,200,100,30);
fr.add(cb1);

hrmodel=new DefaultComboBoxModel();
hrmodel.addElement("fbd");
hrmodel.addElement("karnal");
hrmodel.addElement("rohtak");
hrmodel.addElement("pwl");

mhmodel=new DefaultComboBoxModel();
mhmodel.addElement("Mumbai");
mhmodel.addElement("pune");
mhmodel.addElement("bandra");
mhmodel.addElement("nagpur");

mpmodel=new DefaultComboBoxModel();
mpmodel.addElement("bhopal");
mpmodel.addElement("gwalior");
mpmodel.addElement("ujjain");
mpmodel.addElement("Indore");

upmodel=new DefaultComboBoxModel();
upmodel.addElement("Mathura");
upmodel.addElement("Agra");
upmodel.addElement("lucknow");
upmodel.addElement("varanasi");

cb.addActionListener(this);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
		String state=(String)cb.getSelectedItem();
		if(state.equals("Harayana"))
		cb1.setModel(hrmodel);

		if(state.equals("UP"))
		cb1.setModel(upmodel);

		if(state.equals("MP"))
		cb1.setModel(mpmodel);

		if(state.equals("Maharashtra"))
		cb1.setModel(mhmodel);

}	
public static void main(String s[])
{

new ComboTest();
}

}