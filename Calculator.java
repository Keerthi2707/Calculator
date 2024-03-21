
import java.awt.*;
import java.awt.event.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pkeer
 */
public class Calculator extends Frame implements ActionListener {

    TextField display;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, clear, equals;

    Calculator() {
        display = new TextField("0");
        display.setBounds(50, 190, 280, 70);
        
        addWindowListener(new WindowListener(){
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("");
            }

            @Override
            public void windowClosed(WindowEvent e) {
               System.out.println("");
            }

            @Override
            public void windowIconified(WindowEvent e) {
               System.out.println("");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
              System.out.println("");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
               System.out.println("");
            }
        });

        btn1 = new Button("1");
        btn1.setBounds(50, 400, 70, 70);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(120, 400, 70, 70);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(190, 400, 70, 70);
        btn3.addActionListener(this);

        btn4 = new Button("4");
        btn4.setBounds(50, 330, 70, 70);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(120, 330, 70, 70);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(190, 330, 70, 70);
        btn6.addActionListener(this);

        btn7 = new Button("7");
        btn7.setBounds(50, 260, 70, 70);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(120, 260, 70, 70);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(190, 260, 70, 70);
        btn9.addActionListener(this);

        btn10 = new Button("0");
        btn10.setBounds(50, 470, 70, 70);
        btn10.addActionListener(this);

        btn11 = new Button("+");
        btn11.setBounds(260, 260, 70, 70);
        btn11.addActionListener(this);

        btn12 = new Button("-");
        btn12.setBounds(260, 330, 70, 70);
        btn12.addActionListener(this);

        btn13 = new Button("*");
        btn13.setBounds(260, 400, 70, 70);
        btn13.addActionListener(this);

        btn14 = new Button("/");
        btn14.setBounds(260, 470, 70, 70);
        btn14.addActionListener(this);

        clear = new Button("C");
        clear.setBounds(190, 470, 70, 70);
        clear.addActionListener(this);

        equals = new Button("=");
        equals.setBounds(120, 470, 70, 70);
        equals.addActionListener(this);

        add(display);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(clear);
        add(equals);

        setLayout(null);
        setVisible(true);
        setSize(500,600);
        setTitle("Calculator");

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            String expression = display.getText();
            expression += "1";
            display.setText(expression);
        }
        if (e.getSource() == btn2) {
            String expression = display.getText();
            expression += "2";
            display.setText(expression);
        }
        if (e.getSource() == btn3) {
            String expression = display.getText();
            expression += "3";
            display.setText(expression);
        }
        if (e.getSource() == btn4) {
            String expression = display.getText();
            expression += "4";
            display.setText(expression);
        }
        if (e.getSource() == btn5) {
            String expression = display.getText();
            expression += "5";
            display.setText(expression);
        }
        if (e.getSource() == btn6) {
            String expression = display.getText();
            expression += "6";
            display.setText(expression);
        }
        if (e.getSource() == btn7) {
            String expression = display.getText();
            expression += "7";
            display.setText(expression);
        }
        if (e.getSource() == btn8) {
            String expression = display.getText();
            expression += "1";
            display.setText(expression);
        }
        if (e.getSource() == btn8) {
            String expression = display.getText();
            expression += "1";
            display.setText(expression);
        }
        if (e.getSource() == btn9) {
            String expression = display.getText();
            expression += "9";
            display.setText(expression);
        }
        if (e.getSource() == btn10) {
            String expression = display.getText();
            expression += "0";
            display.setText(expression);
        }
        if (e.getSource() == clear) {
            display.setText("0");
        }
        if (e.getSource() == btn11) {
            String expression = display.getText();
            expression += "+";
            display.setText(expression);
        }
        if (e.getSource() == btn12) {
            String expression = display.getText();
            expression += "-";
            display.setText(expression);
        }
        if (e.getSource() == btn13) {
            String expression = display.getText();
            expression += "*";
            display.setText(expression);
        }
        if (e.getSource() == btn14) {
            String expression = display.getText();
            expression += "/";
            display.setText(expression);
        }
        if (e.getSource() == equals) {
            int a, b, i;
            char operator = '+';
            String expression = display.getText();
            String tempA = "", tempB = "";
            for (i = 0; i < expression.length(); i++) {
                if (Character.isDigit(expression.charAt(i))) {
                    tempA += expression.charAt(i);

                } else {
                    operator = expression.charAt(i);
                    break;
                }
            }
            tempB = expression.substring(i + 1);

            int A = Integer.parseInt(tempA);
            int B = Integer.parseInt(tempB);

            float result = 0;

            switch (operator) {
                case '+':
                    result = A + B;
                    break;
                case '-':
                    result = A - B;
                    break;
                case '*':
                    result = A * B;
                    break;
                case '/':
                    result = (float)A /(float) B;
                    break;
            }
            display.setText(String.valueOf(result));

        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
