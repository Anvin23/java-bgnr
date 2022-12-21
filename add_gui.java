package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class add_gui {
    public static void main(String[] args) {
        sum obj = new sum();
    }
}

class sum extends JFrame {
    public sum()
    {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.GREEN);

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add");
        JLabel l = new JLabel();
        t1.setColumns(20);
        t2.setColumns(20);

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String n1 = t1.getText();
                String n2 = t2.getText();
                int num1=Integer.parseInt(n1);
                int num2=Integer.parseInt(n2);
                int sum=num1+num2;
                l.setText(sum+"");
            }});
    }
}
