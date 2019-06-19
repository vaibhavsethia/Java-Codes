import java.awt.*;
class Calculator
{
Frame fr;
Button b[] = new Button[16];
TextField tf1;
String str[] = {" 1"," 2"," 3"," *"," 4"," 5"," 6"," -"," 7"," 8"," 9"," +"," 0"," ."," ="," /"};
Calculator()
{
for(int i=0;i<16;i++)
{
b[i] = new Button(str[i]);
}
fr = new Frame("Calculator");
System.out.println();
fr.setSize(350,440);
fr.setLayout(null);
tf1 = new TextField();
tf1.setBounds(20,50,300,50);
b[0].setBounds(20,120,60,60);
b[1].setBounds(100,120,60,60);
b[2].setBounds(180,120,60,60);
b[3].setBounds(260,120,60,60);
b[4].setBounds(20,200,60,60);
b[5].setBounds(100,200,60,60);
b[6].setBounds(180,200,60,60);
b[7].setBounds(260,200,60,60);
b[8].setBounds(20,280,60,60);
b[9].setBounds(100,280,60,60);
b[10].setBounds(180,280,60,60);
b[11].setBounds(260,280,60,60);
b[12].setBounds(20,360,60,60);
b[13].setBounds(100,360,60,60);
b[14].setBounds(180,360,60,60);
b[15].setBounds(260,360,60,60);
fr.add(tf1);
for(int i=0;i<16;i++)
{
fr.add(b[i]);
}
fr.setVisible(true);
}
public static void main(String ...S)
{
new Calculator();
}
}