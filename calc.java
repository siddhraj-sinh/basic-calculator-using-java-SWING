import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc
{
   public static void main(String args[])
 {
    JFrame f = new JFrame("Calculator");
    JLabel l0 = new JLabel("select operation and press Enter");
    l0.setBackground(Color.red);
    l0.setOpaque(true);
    l0.setBounds(30,50,200,30);
    JLabel l1 = new JLabel("first Number");
    l1.setBounds(50,100,100,30);
    JTextField tf1 = new JTextField();
    tf1.setBounds(200,100,50,30);
    JLabel l2 = new JLabel("second Number");
    l2.setBounds(50,150,100,30);
    JTextField tf2 = new JTextField();
    tf2.setBounds(200,150,50,30);
    JLabel l3 = new JLabel();
    l3.setBounds(200,200,100,30);
    String[] op = {"+","-","*","/"};
    JComboBox<String> cb = new JComboBox<>(op);
    cb.setBounds(50,200,50,30);   
    JButton b = new JButton("Enter");
    b.setBounds(150,250,100,30);
    b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
    String value = cb.getSelectedItem().toString();
    String s1 = tf1.getText();
    String s2 = tf2.getText();
    double a = Double.parseDouble(s1);
    double b = Double.parseDouble(s2);
    double c=0;
    if(value == "+")
    {
      c = a + b;
      String result = String.valueOf(c); 
      l3.setText(result);  
    }
    else if(value == "-")
    {
      c = a - b;
      String result = String.valueOf(c); 
      l3.setText(result);
    }
    else if(value == "*")
    {
      c = a*b;
      String result = String.valueOf(c); 
      l3.setText(result);
    }
    else
    {
      c = a/b;
      String result = String.valueOf(c); 
      l3.setText(result);
    }
    
}
});
    f.add(l0);
    f.add(l1);
    f.add(tf1);
    f.add(l2);
    f.add(l3);
    f.add(tf2);
    f.add(b);
    f.add(cb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
 }
}