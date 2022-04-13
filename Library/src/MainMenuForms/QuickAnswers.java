package MainMenuForms;
import Classes.*;

import Classes.Books;
import Util.Utility;

import com.mysql.cj.exceptions.WrongArgumentException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import quickAnswersForms.QuickAnswerA;
import quickAnswersForms.QuickAnswerC;
import quickAnswersForms.QuickAnswerD;
import quickAnswersForms.QuickAnswersB;










public class QuickAnswers extends javax.swing.JFrame 
{

    private Connection connection;
    private static Statement statement;
    
    
    
     private QuickAnswers() 
    {
       
    }
    
    
    
    
    public QuickAnswers(Connection connection) throws SQLException 
    {
        this.connection = connection;
        setTitle("Quick Answers");
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        initComponents();
         Utility.showAuthorBox(connection, statement, boxB);
         Utility.showBookBox(connection, statement, bookBox);
        
    }

   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        textA = new javax.swing.JTextField();
        lblQA = new javax.swing.JLabel();
        lblQB = new javax.swing.JLabel();
        lblQC = new javax.swing.JLabel();
        textC = new javax.swing.JTextField();
        lblQD = new javax.swing.JLabel();
        boxB = new javax.swing.JComboBox<>();
        bookBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        delNonB = new javax.swing.JButton();
        year = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();

        btnA.setText("click");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setText("click");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setText("click");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setText("click");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        textA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAActionPerformed(evt);
            }
        });

        lblQA.setText("Show the author name(s) and surname(s) whose name starts with a given string. Enter the string");

        lblQB.setText("Show the title of the books written by a given author. Enter the Author Name ( Only name)");

        lblQC.setText(" Show the book title, author name, surname and country, publisher name and addressfor a given book’s ISBN. Enter ISBN");

        textC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCActionPerformed(evt);
            }
        });

        lblQD.setText("Count how many different people has read a given book. ( please enter the full title)");

        boxB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBActionPerformed(evt);
            }
        });

        bookBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Delete a person (from all the relevant tables of your DB) who has not read a book for the last 20  years. ");

        delNonB.setText("Delete");
        delNonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delNonBActionPerformed(evt);
            }
        });

        year.setText("Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQB)
                    .addComponent(lblQA, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQC, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQD, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(boxB, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delNonB)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnA, btnB, btnC, btnD});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textA, textC});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblQA, lblQB, lblQC, lblQD});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblQB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnB)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxB, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(textC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblQD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD)
                    .addComponent(bookBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delNonB)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnA, btnB, btnC, btnD});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textA, textC});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblQA, lblQB, lblQC, lblQD});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        
        
        int idx = boxB.getSelectedIndex();
        String s = boxB.getItemAt(idx);
        
        if(!Utility.isValid(s))
            return;
        
        showResultB(s);
       
    }//GEN-LAST:event_btnBActionPerformed

    private void showResultB(String str)
    {
         try 
        {
            String query = "select DISTINCT book.ISBN , book.title , book.category , book.page \n" +
                            "FROM AuthorBooks ab \n" +
                            "JOIN Authors author ON ab.authorID = author.authorID \n" +
                            "JOIN Books book ON book.bookID = ab.bookID \n" +
                            "WHERE author.name = \"" + str + "\";";
            
            
            ResultSet result = statement.executeQuery(query);
            
            ArrayList<Books> books = new ArrayList<>();
            
            while(result.next())
                books.add(new Books(
                        result.getString("ISBN") , 
                        result.getString("title") , 
                        result.getString("category"),
                        result.getInt("page"))
                        );
            
            // Frame
            QuickAnswersB qb = new QuickAnswersB(books , str);
            qb.setVisible(true);
           
           
        } 
        catch (SQLException ex) 
        {
            System.err.println("Connection FAILED!");
        }
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        String str = textA.getText();
         if(!Utility.isValid(str))
            return;
        showResultA(str);
        textA.setText(null);
       
    }//GEN-LAST:event_btnAActionPerformed

     private void showResultA(String str)
    { 
        
        try 
        {
            String query = "SELECT name , surname From Authors WHERE name LIKE " + " \""+str+"%\" ;";
            ResultSet result = statement.executeQuery(query);
            ArrayList<Authors> authors = new ArrayList<Authors>();
            
            while(result.next())
                authors.add(new Authors(result.getString("name") , result.getString("surname")));
        
           
            QuickAnswerA qa = new QuickAnswerA(authors , str);
            qa.setVisible(true);
        } 
        catch (SQLException ex) 
        {
           System.err.println("Connection FAILED!");
        }
    }
    
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed

        
        
        String str = textC.getText();
        
        if(!Utility.isValid(str))
            return;
        
        if (str.length() != 13)
        {
            JOptionPane.showMessageDialog(null,"You have to enter 13 digits", "LENGTH ERROR" ,JOptionPane.ERROR_MESSAGE);
            textC.setText(null);
            return;
        }
        
        showResultC(str);
        textC.setText(null);
       
    }//GEN-LAST:event_btnCActionPerformed

    
    
     private void showResultC(String str)
    { 
        
        try 
        {
            String query = "SELECT book.title , a.name , a.surname , a.country , p.name , p.address " +
                            "FROM Books book , Authors a , AuthorBooks ab ,BookPublishers bp , Publishers p " + 
                            "WHERE book.bookID = ab.BookID "+
                            "AND a.authorID = ab.authorID AND p.publisherID = bp.publisherID "+
                            "AND bp.bookID = book.bookID AND book.ISBN = \"" + str + "\";";
            
            ResultSet result = statement.executeQuery(query);
            
       
            ArrayList<ArrayList<String>> list = new ArrayList<>();
            
                        
            for (int i = 0 ; result.next() ; ++i)
            {
                list.add(i, new ArrayList<String>());
                list.get(i).add(result.getString("title"));                              
                list.get(i).add(result.getString("name"));     
                list.get(i).add(result.getString("surname"));     
                list.get(i).add(result.getString("country"));     
                list.get(i).add(result.getString("p.name"));     
                list.get(i).add(result.getString("p.address"));
            }
   
        
           
            QuickAnswerC qc = new QuickAnswerC(list , str);
            qc.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Connection FAILED!");
        }
    }
    
    
    
    
    
    
    
    
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        
        int idx = bookBox.getSelectedIndex();
        String str = bookBox.getItemAt(idx);
 
        if(!Utility.isValid(str))
            return;
        showResultsD(str);
        
        
    }//GEN-LAST:event_btnDActionPerformed

    
    private void showResultsD(String str)
    {
         try 
        {
            String query = " SELECT DISTINCT book.title , COUNT(p1.peopleID) FROM\n" +
                            " Books book , People p1 , BooksPeople bp \n" +
                            " WHERE book.bookID = bp.bookID AND p1.peopleID = bp.peopleID"
                            + " AND book.title = \""+str+"\"; ";
            
            ResultSet result = statement.executeQuery(query);
            
       
            
            
            ArrayList<String> list = new ArrayList<String>();
            while ( result.next() )
            {
                list.add(result.getString("book.title"));
                list.add(Integer.toString(result.getInt(("COUNT(p1.peopleID)"))));
            }
   
        
           
            QuickAnswerD qd = new QuickAnswerD(list , str);
            qd.setVisible(true);
        } 
        catch (SQLException ex) 
        {
            System.err.println("Connection FAILED!");
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void textAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAActionPerformed
        
    }//GEN-LAST:event_textAActionPerformed

    private void textCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCActionPerformed

    private void boxBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxBActionPerformed

    private void delNonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delNonBActionPerformed
        try 
        {
            
            
            String y  = yearTxt.getText();
        
            int year = Integer.parseInt(y);
      
            String msg = "Deleted Non Readers Last "+year + " !";
            
            String query = "CALL deleteLastNYear(?);";
            
            
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setInt(1, year);
            
            pst.executeUpdate();
            pst.executeQuery();
            
            Utility.showMessage(msg,"DELETED!",1);
        
        

        
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(QuickAnswers.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_delNonBActionPerformed

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
            java.util.logging.Logger.getLogger(QuickAnswers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickAnswers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickAnswers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickAnswers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuickAnswers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bookBox;
    private javax.swing.JComboBox<String> boxB;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton delNonB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblQA;
    private javax.swing.JLabel lblQB;
    private javax.swing.JLabel lblQC;
    private javax.swing.JLabel lblQD;
    private javax.swing.JTextField textA;
    private javax.swing.JTextField textC;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
