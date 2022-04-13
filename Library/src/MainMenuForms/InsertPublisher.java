package MainMenuForms;

import Forms.Library;
import Util.Utility;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class InsertPublisher extends javax.swing.JFrame 
{

    private Connection connection;
    private PreparedStatement pst;      
    private final static  String insertAnotherPub = "CALL insertPublisher(?,?);";
    
    private JComboBox<String> box;
    public InsertPublisher(Connection connection , JComboBox<String> box) 
    {
        this.connection = connection;
        this.box = box;
        setTitle("Insert Another Publisher");
        initComponents();
    }
    public InsertPublisher() 
    {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pbNameLbl = new javax.swing.JLabel();
        pbAddrLbl = new javax.swing.JLabel();
        pubNameTxt = new javax.swing.JTextField();
        pubAddrTxt = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pbNameLbl.setText("Publisher Name");

        pbAddrLbl.setText("Publisher Address");

        pubNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubNameTxtActionPerformed(evt);
            }
        });

        insertButton.setText("click");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pbAddrLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(pbNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pubNameTxt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pubAddrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(194, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pubNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbAddrLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pubAddrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(insertButton)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pbAddrLbl, pbNameLbl});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pubAddrTxt, pubNameTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pubNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubNameTxtActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        
        try 
        {
            String name = pubNameTxt.getText();
            String address = pubAddrTxt.getText();
            
            if (name.isBlank() || name.isEmpty() || address.isBlank() || address.isEmpty())
            {
                Utility.showMessage("YOU HAVE TO ENTER TEXT","INSERT ERROR!",0);
                return;
            }
            
            pst = connection.prepareStatement(insertAnotherPub);
            
            pst.setString(1, name);
            pst.setString(2, address);
            
            pst.executeUpdate();
            Utility.showPublisherBox(connection, pst, box);
            Utility.showMessage("Publisher is entered!","Insert!",1);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(InsertPublisher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_insertButtonActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(InsertPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new InsertPublisher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel pbAddrLbl;
    private javax.swing.JLabel pbNameLbl;
    private javax.swing.JTextField pubAddrTxt;
    private javax.swing.JTextField pubNameTxt;
    // End of variables declaration//GEN-END:variables
}
