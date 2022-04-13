package Forms;


import Classes.*;
import Interfaces.ITable;
import MainMenuForms.Insert;
import MainMenuForms.UpdateForm;
import MainMenuForms.QuickAnswers;
import MainMenuForms.Remove;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Library extends javax.swing.JFrame
{
    
    
    private Connection connection;
    private static DBConnector db = null;
    private QuickAnswers quickAnswers ;
    private static Statement statement;
    
    private static DefaultTableModel model;
    
    
    public Library() 
    {
         db = new DBConnector("root", "12345", "jdbc:mysql://localhost:3306/library");
        
        setTitle("Library v1.0");
        
        connectDatabase();
        
        initComponents();
        
        model = (DefaultTableModel) mainTable.getModel();
        update();
        
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    }
        
       public static void update()
       {
           showTable();
       }
        
       private void connectDatabase()
       { 
         
           
           try
           {
               connection = db.getConnection();
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
               System.out.println("Connection Successfull!");
           }
           catch(SQLException e)
           {
               System.err.println("NOT CONNECTED!\n" + e.getMessage());
               
           }
           
       }
  
       
  
    private static ArrayList<ArrayList<String>> getList() 
    {
         try 
        {
            
            String query = 
                    "SELECT book.ISBN , book.title , book.category , book.page , CONCAT(author.name , \" \" ,author.surname)\n" +
                    "FROM Books book , Authors author ,  AuthorBooks ab \n" +
                    "WHERE book.bookID = ab.BookID\n" +
                    "AND author.authorID = ab.authorID\n" 
                    ;
            
            ResultSet result = statement.executeQuery(query);
            
       
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            
                        
            for (int i = 0 ; result.next() ; ++i)
            {
                list.add(i, new ArrayList<String>());
                list.get(i).add(result.getString("book.ISBN"));
                list.get(i).add(result.getString("book.title"));    
                list.get(i).add(result.getString("book.category"));   
                list.get(i).add(result.getString("book.page").toString());     
                list.get(i).add(result.getString("CONCAT(author.name , \" \" ,author.surname)"));     
                  
                
            }
   
        
           
            return list;
        } 
        catch (SQLException ex) 
        {
            System.err.println("Connection FAILED!");
        }
         return null;
    }
    
    private static void showTable()
    {
        ArrayList<ArrayList<String>> list = getList();
        model.setRowCount(0);
        for (int i = 0 ; i < list.size() ; ++i)
        {
            Object[] row = {list.get(i).get(0) , list.get(i).get(1) , list.get(i).get(2) , list.get(i).get(3),
                            list.get(i).get(4)  };
            model.addRow(row);
        }
    }
       
       
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        qaButton = new javax.swing.JButton();
        searchButton = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        qaButton.setText("Quick Answers");
        qaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qaButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search:");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove ");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update ");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Title", "Category", "Page", "Author"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(mainTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qaButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(removeBtn)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {insert, qaButton, removeBtn, updateBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBtn)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qaButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {insert, qaButton, removeBtn, updateBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    private void qaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qaButtonActionPerformed
              
        try 
        {        
            quickAnswers = new QuickAnswers(connection);
            quickAnswers.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Frame is not created!\n" + ex.getMessage());
        }
        
    }//GEN-LAST:event_qaButtonActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        Remove remove = new Remove(connection,statement);
        remove.setVisible(true);
    }//GEN-LAST:event_removeBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        try 
        {
             Insert ib = new Insert(connection);
             ib.setVisible(true);
        } 
        catch (SQLException ex) 
        {
             System.err.println("SQL Exception!\n" + ex.getMessage());
        }
       
    }//GEN-LAST:event_insertActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        try 
        {
            UpdateForm update = new UpdateForm(connection);
            update.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Frame is not created!\n" + ex.getMessage());
        }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String str = searchField.getText(); 
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        mainTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(str));
    }//GEN-LAST:event_searchFieldKeyReleased


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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  
        {
            public void run() 
            {
                
                new Library().setVisible(true);
             
            }
        }
                                        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton qaButton;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

   
    
}
