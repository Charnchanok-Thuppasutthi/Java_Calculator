import javax.swing.*;
import java.awt.event.*;

public class Calcuator implements ActionListener {
    String display_text = "";
    JFrame f;
    JButton button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0;
    JButton button_point, button_clear, button_plus, button_minus, button_multipy, button_divide, button_equal;
    JTextField txt_field;
    String num1 = ""  ;
    String num2 = "" ;
    String op = "" ;
    double result = 0 ;
    boolean check = true ;
    String str_result = "";

    public static void main(String[] args) {
        new Calcuator();
    }

    Calcuator() {
   
        // สร้างออปเจ็คต่างๆเเล้ว add เข้า frame
        f = new JFrame("Calculator");

        // setting frame
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit from the program when click X
        f.setLocationRelativeTo(null); // set position of the program to the center of windown

        button_1 = new JButton("1");
        button_1.setBounds(50+20, 150, 95, 50); // y x size of x size of y
        f.add(button_1);

        button_2 = new JButton("2");
        button_2.setBounds(145+20, 150, 95, 50);
        f.add(button_2);

        button_3 = new JButton("3");
        button_3.setBounds(240+20, 150, 95, 50);
        f.add(button_3);

        button_4 = new JButton("4");
        button_4.setBounds(50+20, 200, 95, 50);
        f.add(button_4);

        button_5 = new JButton("5");
        button_5.setBounds(145+20, 200, 95, 50);
        f.add(button_5);

        button_6 = new JButton("6");
        button_6.setBounds(240+20, 200, 95, 50);
        f.add(button_6);

        button_7 = new JButton("7");
        button_7.setBounds(50+20, 250, 95, 50);
        f.add(button_7);

        button_8 = new JButton("8");
        button_8.setBounds(145+20, 250, 95, 50);
        f.add(button_8);

        button_9 = new JButton("9");
        button_9.setBounds(240+20, 250, 95, 50);
        f.add(button_9);

        button_0 = new JButton("0");
        button_0.setBounds(145+20, 300, 95, 50);
        f.add(button_0);

        button_point = new JButton(".");
        button_point.setBounds(50+20, 300, 95, 50);
        f.add(button_point);

        button_clear = new JButton("C");
        button_clear.setBounds(240+20, 300, 95, 50);
        f.add(button_clear);

        button_plus = new JButton("+");
        button_plus.setBounds(335+20, 150, 65, 50);
        f.add(button_plus);

        button_minus = new JButton("-");
        button_minus.setBounds(335+20, 200, 65, 50);
        f.add(button_minus);

        button_multipy = new JButton("x");
        button_multipy.setBounds(335+20, 250, 65, 50);
        f.add(button_multipy);

        button_divide = new JButton("/");
        button_divide.setBounds(335+20, 300, 65, 50);
        f.add(button_divide);

        button_equal = new JButton("=");
        button_equal.setBounds(150+20, 350, 150, 80);
        f.add(button_equal);

        txt_field = new JTextField();
        txt_field.setBounds(50+20, 100, 350, 50);
        txt_field.setText("0.0");
        f.add(txt_field);

        // add actions
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
        button_point.addActionListener(this);
        button_clear.addActionListener(this);
        button_plus.addActionListener(this);
        button_minus.addActionListener(this);
        button_multipy.addActionListener(this);
        button_divide.addActionListener(this);
        button_equal.addActionListener(this);

    }
  
    public void actionPerformed(ActionEvent e) {
        
        String s = e.getActionCommand();
        
        System.out.println(s.charAt(0));
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.'){
            if (check) {
                num1 += s.charAt(0) ;
                txt_field.setText(num1 + " " + op + " " + num2);
            }
            else {
                num2 += s.charAt(0) ;
                txt_field.setText(num1 + " " + op + " " + num2);
            }
        }
        else if (s.charAt(0) == 'C'){
            num1 = "" ;
            num2 = "" ;
            op = "" ;
            check = true ;
            txt_field.setText("0.0");
        }
        else if (s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == 'x' || s.charAt(0) == '/' ){
            op = s;
            check = false ;
            txt_field.setText(num1 + " " + op + " " + num2);
        }
        else if (s.charAt(0) == '='){
            txt_field.setText("");
            if (op == "-"){
                result = Double.valueOf(num1) - Double.valueOf(num2) ;
            }
            else if (op == "+"){
                result = Double.valueOf(num1) + Double.valueOf(num2) ;
            }
            else if (op == "x"){
                result = Double.valueOf(num1) * Double.valueOf(num2) ;
            }
            else if (op == "/"){
                result = Double.valueOf(num1) / Double.valueOf(num2) ;
            }
            str_result = (num1 + " " + op + " " + num2+ " = " + String.valueOf(result));
            txt_field.setText(str_result);
        }
    }
}
