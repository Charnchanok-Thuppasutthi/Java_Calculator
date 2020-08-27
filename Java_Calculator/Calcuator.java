import java.lang.reflect.Field;

import javax.swing.*;
public class Calcuator {
    public static void main(String[]args){
    JFrame f=new JFrame("Calculator");
    
     JButton button_1=new JButton("1");  
    button_1.setBounds(50,150,95,50);  //y x size of x size of y
    f.add(button_1);
    
    JButton button_2=new JButton("2");  
    button_2.setBounds(145,150,95,50);  
    f.add(button_2); 

    JButton button_3=new JButton("3");  
    button_3.setBounds(240,150,95,50);  
    f.add(button_3); 

    JButton button_4=new JButton("4");  
    button_4.setBounds(50,200,95,50);  
    f.add(button_4); 

    JButton button_5=new JButton("5");  
    button_5.setBounds(145,200,95,50);  
    f.add(button_5);

    JButton button_6=new JButton("6");  
    button_6.setBounds(240,200,95,50);  
    f.add(button_6); 

    JButton button_7=new JButton("7");  
    button_7.setBounds(50,250,95,50);  
    f.add(button_7); 

    JButton button_8=new JButton("8");  
    button_8.setBounds(145,250,95,50);  
    f.add(button_8); 

    JButton button_9=new JButton("9");
    button_9.setBounds(240,250,95,50);
    f.add(button_9); 
    
    JButton button_0=new JButton("0");
    button_0.setBounds(145,300,95,50);
    f.add(button_0);  

    JButton button_jud=new JButton(".");
    button_jud.setBounds(50,300,95,50);
    f.add(button_jud);  

    JButton button_clear=new JButton("C");
    button_clear.setBounds(240,300,95,50);
    f.add(button_clear);
    
    JButton button_plus=new JButton("+");
    button_plus.setBounds(335,150,65,50);
    f.add(button_plus);

    JButton button_minus=new JButton("-");
    button_minus.setBounds(335,200,65,50);
    f.add(button_minus);

    JButton button_koon=new JButton("x");
    button_koon.setBounds(335,250,65,50);
    f.add(button_koon);

    JButton button_harn=new JButton("/");
    button_harn.setBounds(335,300,65,50);
    f.add(button_harn);

    JButton button_equal=new JButton("=");
    button_equal.setBounds(150,350,150,80);
    f.add(button_equal);

    JTextField txt_field;
    txt_field = new JTextField();
    txt_field.setBounds(50,100,350,50);
    f.add(txt_field);    

    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);



    }    
}