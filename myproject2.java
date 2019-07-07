/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gu1s;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Adeleke Olamide
 */
public class myproject2 {
    private JFrame frame = new JFrame("calculator");
    
    private JTextArea area = new JTextArea();
    private JTextArea lab = new JTextArea();

    //calculation var
    double num1;
    double num2;
    String operation;
    double totalvar;

//number buttons
    private JButton button0 = new JButton("0");
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");

    //operators
    private JButton buttondiv = new JButton("/");
    private JButton buttonmult = new JButton("*");
    private JButton buttonadd = new JButton("+");
    private JButton buttonmin = new JButton("-");
    private JButton buttonpoint = new JButton(".");
    private JButton buttonequal = new JButton("=");
    private JButton buttonclear = new JButton("c");

    public myproject2() {
        frame.setVisible(true);
        frame.setSize(287, 380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        //area
        area.setSize(265, 40);
        area.setLocation(7, 5);
        area.setEditable(false);
        

        //label
        lab.setLayout(new FlowLayout(FlowLayout.RIGHT));
        lab.setSize(280,20);
        lab.setLocation(7, 85);
        lab.setEditable(false);

        //button0
        button0.setSize(120,48);
        button0.setLocation(10, 300);
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("0");
            }

        });
        //button3
        button3.setSize(50, 50);
        button3.setLocation(150, 180);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("3");
            }

        });
        //button2
        button2.setSize(50, 50);
        button2.setLocation(80, 180);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("2");
            }

        });
        //button1
        button1.setSize(50, 50);
        button1.setLocation(10, 180);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("1");
            }

        });
        //button4
        button4.setSize(50, 50);
        button4.setLocation(10, 120);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("4");
            }

        });
        //button5
        button5.setSize(50, 50);
        button5.setLocation(80, 120);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("5");
            }

        });
        //button6
        button6.setSize(50, 50);
        button6.setLocation(150, 120);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("6");
            }

        });
        //button7
        button7.setSize(50, 50);
        button7.setLocation(10, 60);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("7");
            }

        });
        //button8
        button8.setSize(50, 50);
        button8.setLocation(80, 60);
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("8");
            }

        });
        //button9
        button9.setSize(50, 50);
        button9.setLocation(150, 60);
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append("9");
            }

        });
        //buttondiv
        buttondiv.setSize(50, 50);
        buttondiv.setLocation(220, 60);
        buttondiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1= Double.parseDouble(area.getText());
           area.setText("");
           operation="/";
            }

        });
        //buttonmult
        buttonmult.setSize(50, 50);
        buttonmult.setLocation(220, 120);
        buttonmult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1= .parseDouble(area.getText());
           area.setText("");
           operation="*";
            }

        });
        //buttonmin
        buttonmin.setSize(50, 50);
        buttonmin.setLocation(220, 180);
        buttonmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               num1= Double.parseDouble(area.getText());
           area.setText("");
           operation="-"; 
            }

        });
        //buttonadd
        buttonadd.setSize(50, 107);
        buttonadd.setLocation(150, 240);
        buttonadd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1= Double.parseDouble(area.getText());
           area.setText("");
           operation="+";
            }

        });
        //buttonclear
        buttonclear.setSize(50, 50);
        buttonclear.setLocation(10, 240);
        buttonclear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.setText(" ");
                lab.setText(" ");
            }
            

        });

        //buttonpoint
        buttonpoint.setSize(50, 50);
        buttonpoint.setLocation(80, 240);
        buttonpoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.append(".");
            }

        });
        //buttonequal
        buttonequal.setSize(50, 107);
        buttonequal.setLocation(220, 240);
        buttonequal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String answer;
                num2 = Double.parseDouble(area.getText());
             
                if (operation == "+")
                {
                totalvar = num1 + num2;
                answer = String.format("%.0f", totalvar);
                area.setText(answer);
                
                }
                 if (operation == "-")
                 {
                     totalvar = num1 - num2;
                     answer = String.format("%.0f", totalvar);
                     area.setText(answer);
                 } else {
                 }
                  if (operation == "*")
                {
                totalvar = num1 * num2;
                answer = String.format("%.0f", totalvar);
                area.setText(answer);
                }
                if (operation == "/")
                {
                totalvar = num1 / num2;
          
                answer = String.format("%.2f",totalvar);
                area.setText(answer);
                
            
                
               
                }
               
            }

        });

        //add to screen
        frame.add(area);
        //frame.add(lab);
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttondiv);
        frame.add(buttonmult);
        frame.add(buttonmin);
        frame.add(buttonadd);
        frame.add(buttonpoint);
        frame.add(buttonequal);
        frame.add(buttonclear);

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new myproject2();
    }
    
}
