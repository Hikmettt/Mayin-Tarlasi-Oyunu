/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MayinTarlasi;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.URL;
import java.net.URLClassLoader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JFrame {

    private JLabel durumCubugu;
    private JLabel sure;
    private JButton kolay,normal,zor;
    int satir,sutun,mayinlar;
    public Main() {

        initUI();
    }
    private void initUI()
    {
        JLabel zorlukLabel = new JLabel();
        zorlukLabel.setText("Zorluk Seviyesi : ");   
        
       kolay = new JButton("Kolay");
       kolay.setSize(400,400);  
       normal = new JButton("Normal");
       normal.setSize(400,400);  
       zor = new JButton("Zor");
       zor.setSize(400,400); 
       JPanel panel = new JPanel();
   
       kolay.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
                satir = 9;
                sutun = 9;
                mayinlar = 10;
                panel.setVisible(false);
                initUI2();
           }
       });
      
       normal.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
                satir = 16;
                sutun = 16;
                mayinlar = 40;
                panel.setVisible(false);
                  initUI2();
           }
       });
       zor.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
                satir = 16;
                sutun = 30;
                mayinlar = 99;
                panel.setVisible(false);
                initUI2();
           }
       });
       
        GridLayout zorlukLayput = new GridLayout(4,1);
        panel.setLayout(zorlukLayput);
        panel.add(zorlukLabel);
        panel.add(kolay);
        panel.add(normal);
        panel.add(zor);  
        add(panel);
        
        setResizable(false);
        pack();

        setTitle("MayinTarlasi");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void initUI2() {

        durumCubugu = new JLabel();
               
        
        sure = new JLabel();
        sure.setText("Sure : ");
       
        Timer timer1 = new Timer("MyTimer-1");
        
        
        timer1.scheduleAtFixedRate(new ZamanTutucu(sure), 0, 1000);
        
        
        JPanel panel = new JPanel();
      
        GridLayout gridLyt = new GridLayout(1,2);
        panel.setLayout(gridLyt);
        panel.add(durumCubugu);
        panel.add(sure);
       
         
        add(new Oyun(durumCubugu,satir,sutun,mayinlar));   
        
        add(panel,BorderLayout.NORTH);
    
      
        
        
        /*
        Container contentPanel = getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
        
        contentPanel.setLayout(groupLayout);  
          
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()  
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(statusbar)
                .addGap(10,60,100)
                .addComponent(broad))  
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(sure)));  
  
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()  
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(statusbar).addComponent(broad))  
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(sure)));  
        */
       

        setResizable(false);
        pack();

        setTitle("MayinTarlasi");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new Main();
            ex.setVisible(true);
        });

   }
    
}
