//import java.lang.reflect.Field;

import javax.swing.*;
import java.awt.event.*;  
public class Calcuator implements ActionListener {
        String display_text = "";
        int num1,num2;
        JFrame f;
        JButton button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_0;
        JButton button_point,button_clear,button_plus,button_minus,button_multipy,button_divide,button_equal;
        JTextField txt_field;
        Calcuator(){
            //this.display_text = display_text;
            //this.num1 = num1;
            //this.num2 = num2;

            // สร้างออปเจ็คต่างๆเเล้ว add เข้า frame
            f=new JFrame("Calculator");
    
            button_1 =new JButton("1");  
            button_1.setBounds(50,150,95,50);  //y x size of x size of y
            f.add(button_1);
    
            button_2=new JButton("2");  
            button_2.setBounds(145,150,95,50);  
            f.add(button_2); 

            button_3=new JButton("3");  
            button_3.setBounds(240,150,95,50);  
            f.add(button_3); 

            button_4=new JButton("4");  
            button_4.setBounds(50,200,95,50);  
            f.add(button_4); 

            button_5=new JButton("5");  
            button_5.setBounds(145,200,95,50);  
            f.add(button_5);

            button_6=new JButton("6");  
            button_6.setBounds(240,200,95,50);  
            f.add(button_6); 

            button_7=new JButton("7");  
            button_7.setBounds(50,250,95,50);  
            f.add(button_7); 

            button_8=new JButton("8");  
            button_8.setBounds(145,250,95,50);  
            f.add(button_8); 

            button_9=new JButton("9");
            button_9.setBounds(240,250,95,50);
            f.add(button_9); 
    
            button_0=new JButton("0");
            button_0.setBounds(145,300,95,50);
            f.add(button_0);  

            button_point=new JButton(".");
            button_point.setBounds(50,300,95,50);
            f.add(button_point);  

            button_clear=new JButton("C");
            button_clear.setBounds(240,300,95,50);
            f.add(button_clear);
    
            button_plus=new JButton("+");
            button_plus.setBounds(335,150,65,50);
            f.add(button_plus);

            button_minus=new JButton("-");
            button_minus.setBounds(335,200,65,50);
            f.add(button_minus);

            button_multipy=new JButton("x");
            button_multipy.setBounds(335,250,65,50);
            f.add(button_multipy);

            button_divide=new JButton("/");
            button_divide.setBounds(335,300,65,50);
            f.add(button_divide);

            button_equal=new JButton("=");
            button_equal.setBounds(150,350,150,80);
            f.add(button_equal);

            txt_field = new JTextField();
            txt_field.setBounds(50,100,350,50);
            txt_field.setText(" ");
            f.add(txt_field);    
            //setting frame
            f.setSize(500,500);
            f.setLayout(null);
            f.setVisible(true);


            //add actions
            button_1.addActionListener(this);
            button_2.addActionListener(this);
            button_3.addActionListener(this);
            button_4.addActionListener(this);
            button_5.addActionListener(this);
            button_6.addActionListener(this);
            button_7.addActionListener(this);
            button_8.addActionListener(this);
            button_9.addActionListener(this);
            button_0.addActionListener(this);

        }
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == button_1){
                display_text += "1";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_2){
                display_text += "2";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_3){
                display_text += "3";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_4){
                display_text += "4";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_5){
                display_text += "5";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_6){
                display_text += "6";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_7){
                display_text += "7";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_8){
                display_text += "8";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_9){
                display_text += "9";
                txt_field.setText(display_text);
            }
            else if(e.getSource() == button_0){
                display_text += "0";
                txt_field.setText(display_text);
            }
        }
    public static void main(String[]args){
        new Calcuator();
    }   

}