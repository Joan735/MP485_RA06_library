/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.Book;
import static main.FileManager.fileWriter;
import static main.Library.inventory;

/**
 *
 * @author Joan Ye
 */
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Add() {
        super("Add student");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        jTxtQuantity.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) { // Si no es número, cancelar el evento
                    evt.consume();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblAdd = new javax.swing.JLabel();
        jBtnReturn = new javax.swing.JButton();
        jTxtPrice = new javax.swing.JTextField();
        jLblPrice = new javax.swing.JLabel();
        jTxtQuantity = new javax.swing.JTextField();
        jLblQuantity = new javax.swing.JLabel();
        jTxtTitle = new javax.swing.JTextField();
        jLblTitle = new javax.swing.JLabel();
        jTxtISBN = new javax.swing.JTextField();
        jLblISBN = new javax.swing.JLabel();
        jTxtAuthors = new javax.swing.JTextField();
        jLblAuthors = new javax.swing.JLabel();
        jBtnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jLblAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLblAdd.setText("ADD BOOK");

        jBtnReturn.setBackground(new java.awt.Color(40, 40, 40));
        jBtnReturn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtnReturn.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReturn.setText("Return");
        jBtnReturn.setFocusPainted(false);
        jBtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReturnActionPerformed(evt);
            }
        });

        jLblPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLblPrice.setText("Price");

        jLblQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLblQuantity.setText("Quantity");

        jLblTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLblTitle.setText("Title");

        jLblISBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLblISBN.setText("ISBN");

        jLblAuthors.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLblAuthors.setText("Authors Example: (Mark Twain, J.K. Rowling)");

        jBtnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        jBtnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBtnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSubmit.setText("Submit");
        jBtnSubmit.setFocusPainted(false);
        jBtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnReturn)
                        .addGap(18, 18, 18)
                        .addComponent(jLblAdd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLblISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtAuthors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jTxtISBN, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtTitle, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLblAuthors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTxtQuantity)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jBtnSubmit)))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBtnReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblAuthors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSubmit))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReturnActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnReturnActionPerformed

    private void jBtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitActionPerformed
        if (!jTxtTitle.getText().equals("") && !jTxtISBN.getText().equals("") && !jTxtAuthors.getText().equals("")
                && !jTxtPrice.getText().equals("") && !jTxtQuantity.getText().equals("")) {
            Iterator it = inventory.keySet().iterator();
            //Variables
            String key;
            String authors[];
            boolean found = false;
            ArrayList<String> authorList = new ArrayList<>();
            double price;
            try {
                price = Double.parseDouble(jTxtPrice.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Incorrect format of the price. Ex:(4.99)", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (Double.parseDouble(jTxtPrice.getText()) <= 0 || Integer.parseInt(jTxtQuantity.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Price and quantity can't be negative and price can't be 0.", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Book addBook = new Book(jTxtTitle.getText(), jTxtISBN.getText(), authorList, price, Integer.parseInt(jTxtQuantity.getText()));
            Book inventoryBook;
            // Verify if the book exists
            while (it.hasNext()) {
                key = (String) it.next();
                inventoryBook = inventory.get(key);
                if (inventoryBook.equals(addBook)) {
                    found = true;
                    break;
                }
            }
            // Add the book to the HashMap
            if (!found) {
                authors = jTxtAuthors.getText().split(", ");
                for (int i = 0; i < authors.length; i++) {
                    authorList.add(authors[i]);
                }
                inventory.put(jTxtISBN.getText(), addBook);
                // Save the book in the file
                Menu menu = new Menu();
                try {
                    fileWriter();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error while adding the book.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    menu.setVisible(true);
                    this.setVisible(false);
                }
                JOptionPane.showMessageDialog(this, "The book has been added.", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                menu.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "This book already exists.", "WARNING", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete all the fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSubmitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnReturn;
    private javax.swing.JButton jBtnSubmit;
    private javax.swing.JLabel jLblAdd;
    private javax.swing.JLabel jLblAuthors;
    private javax.swing.JLabel jLblISBN;
    private javax.swing.JLabel jLblPrice;
    private javax.swing.JLabel jLblQuantity;
    private javax.swing.JLabel jLblTitle;
    private javax.swing.JTextField jTxtAuthors;
    private javax.swing.JTextField jTxtISBN;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JTextField jTxtQuantity;
    private javax.swing.JTextField jTxtTitle;
    // End of variables declaration//GEN-END:variables
}
