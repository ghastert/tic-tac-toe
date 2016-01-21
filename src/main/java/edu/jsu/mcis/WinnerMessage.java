package edu.jsu.mcis;

import java.util.*;

public class WinnerMessage extends javax.swing.JFrame {

    public WinnerMessage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        message = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(message)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(message)
                .addGap(69, 69, 69))
        );

        pack();
    }   
		
		public void newMessage(String newMessage)
		{
			message.setText(newMessage);
		}
                    
    private static javax.swing.JLabel message;                  
}
