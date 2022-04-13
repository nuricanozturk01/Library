
package MainMenuForms;
import Classes.Books;
import Classes.Publishers;
import Forms.Library;
import Util.Utility;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class UpdateForm extends javax.swing.JFrame {

    //GLOBALS
     private Connection connection;
     private Statement statement;
     private ResultSet result;
     
   


    //GLOBALS
     
     
     
     
     // Constructor Start
    public UpdateForm(Connection connection) throws SQLException 
    {
        
        this.connection = connection;        
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        initComponents();
        setTitle("Update");
        
        // Box for update
        Utility.showBookBox(connection,statement,boxBook);
        Utility.showPublisherBox(connection,statement,boxName);
        
    }
    public UpdateForm() 
    {
        setTitle("Update");
        initComponents();
    }
    // Constructor Finish

    
    
    
    
    
   
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPubBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pbNameLbl = new javax.swing.JLabel();
        newAddrLbl = new javax.swing.JLabel();
        newAddr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bNameLbl = new javax.swing.JLabel();
        newISBNLbl = new javax.swing.JLabel();
        boxBook = new javax.swing.JComboBox<>();
        newISBNText = new javax.swing.JTextField();
        boxName = new javax.swing.JComboBox<>();
        upISBNBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        oldAddr = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oldISBN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        upPubBtn.setText("Update Publishers");
        upPubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upPubBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Update Publisher Address");

        pbNameLbl.setText("Publisher Name:");

        newAddrLbl.setText("New Address:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Update Book ISBN");

        bNameLbl.setText("Book Name:");

        newISBNLbl.setText("New ISBN:");

        boxBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBookActionPerformed(evt);
            }
        });

        boxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNameActionPerformed(evt);
            }
        });

        upISBNBtn.setText("Update ISBN");
        upISBNBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upISBNBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Old Address");

        jLabel5.setText("Old ISBN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oldAddr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(pbNameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(boxName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(newAddrLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(upPubBtn, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(upISBNBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(newISBNLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxBook, 0, 184, Short.MAX_VALUE)
                            .addComponent(oldISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bNameLbl, jLabel2, jLabel5, newAddrLbl, newISBNLbl, pbNameLbl});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newAddr, newISBNText});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {upISBNBtn, upPubBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pbNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxBook, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(oldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(oldAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newAddrLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(upPubBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newISBNLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(upISBNBtn)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bNameLbl, jLabel2, jLabel5, newAddrLbl, newISBNLbl, pbNameLbl});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boxBook, boxName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {newAddr, newISBNText});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {upISBNBtn, upPubBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBookActionPerformed
        try 
         {
            int idx = boxBook.getSelectedIndex();
        
            ArrayList<Books> list = Utility.getBooks(connection, statement);
             
            oldISBN.setText(list.get(idx).getISBN());
         } 
         catch (SQLException ex) 
         {
             Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_boxBookActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void upPubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upPubBtnActionPerformed
        
       
             
        String addr = newAddr.getText();
        if (addr.isBlank() || addr.isEmpty()  )
        {
            Utility.showMessage("ADDRESS IS NOT CONTAIN BLANK OR EMPTY", "WARNING", 3);
            return;
        }
        newAddr.setText(null);
        int idx = boxName.getSelectedIndex();
            
        updateAddress(addr , idx);
         
        Library.update();
        
    }//GEN-LAST:event_upPubBtnActionPerformed

    
     private void updateAddress(String newAddr , int idx)
    {
         try 
         {
             ArrayList<Publishers> pubs = Utility.getPublishers(connection, statement);
             
             PreparedStatement pst = connection.prepareStatement("UPDATE Publishers SET address = ? WHERE name = ?");
             
             pst.setString(1, newAddr);
             pst.setString(2, pubs.get(idx).getName());
             
             pst.executeUpdate();
             oldAddr.setText(newAddr);
             Utility.showMessage("Address is updated!","Update!",2);
            
         }
         catch (SQLException ex) 
         {
             Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    private void upISBNBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upISBNBtnActionPerformed
        
        String ısbn = newISBNText.getText();
        if (ısbn.isBlank() || ısbn.isEmpty() || ısbn.length() != 13 )
        {
            Utility.showMessage("ISBN IS MUST BE 13 DIGITS AND NEVER BLANK OR EMPTY", "WARNING", 3);
            return;
        }
        newISBNText.setText(null);
        int idx = boxBook.getSelectedIndex();
        
        updateISBN(ısbn , idx);
        
        Library.update();
        
    }//GEN-LAST:event_upISBNBtnActionPerformed

    private void boxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNameActionPerformed
        
         try 
         {
            int idx = boxName.getSelectedIndex();
        
            ArrayList<Publishers> list = Utility.getPublishers(connection, statement);
             
            oldAddr.setText(list.get(idx).getAddress());
         } 
         catch (SQLException ex) 
         {
             Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_boxNameActionPerformed

    
   
    
    private void updateISBN(String ısbn , int idx)
    {
         try 
         {
             ArrayList<Books> books = Utility.getBooks(connection, statement);
             
             PreparedStatement pst = connection.prepareStatement("UPDATE Books SET ISBN = ? WHERE title = ?");
             
             pst.setString(1, ısbn);
             pst.setString(2, books.get(idx).getTitle());
             oldISBN.setText(ısbn);
             pst.executeUpdate();
             Utility.showMessage("ISBN is updated!","Update!",2);
            
         }
         catch (SQLException ex) 
         {
             Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bNameLbl;
    private javax.swing.JComboBox<String> boxBook;
    private javax.swing.JComboBox<String> boxName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField newAddr;
    private javax.swing.JLabel newAddrLbl;
    private javax.swing.JLabel newISBNLbl;
    private javax.swing.JTextField newISBNText;
    private javax.swing.JLabel oldAddr;
    private javax.swing.JLabel oldISBN;
    private javax.swing.JLabel pbNameLbl;
    private javax.swing.JButton upISBNBtn;
    private javax.swing.JButton upPubBtn;
    // End of variables declaration//GEN-END:variables
}
