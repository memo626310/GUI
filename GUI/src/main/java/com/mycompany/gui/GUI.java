/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author omnia fawzy
 */

public class GUI implements ActionListener {
    int count =0;
    LocalDate plus14=new LocalDate();
    JLabel label1;
    LocalDate date=LocalDate.now();
public GUI()  {
    
    JFrame frame=new JFrame();
     label1=new JLabel();
    label1.setText(String.valueOf(date));
   
    JButton btn = new JButton("hell yah");
    JPanel panel =new JPanel();
    panel.add(label1);
    panel.add(btn);
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    panel.setLayout(new GridLayout());
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("omnia");
    frame.pack();
    frame.setVisible(true);
    btn.setVisible(true);
btn.addActionListener(this);

}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        System.out.println(date.plusDays(14));
      //  label1.setText(date.plusDays(14));
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
