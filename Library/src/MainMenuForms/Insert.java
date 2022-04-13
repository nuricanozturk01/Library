package MainMenuForms;


import Classes.Authors;
import Classes.Books;
import Classes.People;
import Classes.Publishers;
import Forms.Library;
import Util.Utility;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class Insert extends javax.swing.JFrame {

    
    
    // GLOBALS
    private Connection connection;
    private PreparedStatement pst;
    private Statement statement;
    private ResultSet result;
   
    
    //private final static String insertQuery = "INSERT INTO  Books (ISBN,title,category,page) VALUES (?,?,?,?);";
    private final static String insertQuery2 = "CALL insertBook(?,?,?,?);";
    
    
    // CONSTRUCTOR
    public Insert(Connection connection) throws SQLException 
    {
        
        this.connection = connection;
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        setTitle("Insert");
        initComponents();
        
       Utility.showBookBox(connection, statement, bookBox);
       Utility.showPublisherBox(connection, statement, pubBox);
       Utility.showAuthorBox(connection, statement, authorBox);
       Utility.showPeopleBox(connection, statement, peopleBox);
       Utility.showYearBox(connection, statement, yearBox);
    }
    public Insert() 
    {
        initComponents();
    }
    // CONSTRUCTOR END
    
  
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        isbnLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        catLbl = new javax.swing.JLabel();
        pageLbl = new javax.swing.JLabel();
        isbnTxt = new javax.swing.JTextField();
        titleTxt = new javax.swing.JTextField();
        catTxt = new javax.swing.JTextField();
        pageTxt = new javax.swing.JTextField();
        insetBtn = new javax.swing.JButton();
        authorBox = new javax.swing.JComboBox<>();
        chooseAuthorLbl = new javax.swing.JLabel();
        insertAuthorBtn = new javax.swing.JButton();
        InsertAAuthorBtn = new javax.swing.JButton();
        choosePubLbl = new javax.swing.JLabel();
        pubBox = new javax.swing.JComboBox<>();
        InsertPubBtn = new javax.swing.JButton();
        InsertAPubBtn = new javax.swing.JButton();
        choosePeopleLbl = new javax.swing.JLabel();
        peopleBox = new javax.swing.JComboBox<>();
        InsertPeopleBtn = new javax.swing.JButton();
        InsertAPeopleBtn = new javax.swing.JButton();
        bookBox = new javax.swing.JComboBox<>();
        chooseBookLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yearBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        isbnLbl.setText("Enter the ISBN:");

        titleLbl.setText("Enter the Title");

        catLbl.setText("Enter the category");

        pageLbl.setText("Enter the page");

        pageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageTxtActionPerformed(evt);
            }
        });

        insetBtn.setText("insert Book");
        insetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insetBtnActionPerformed(evt);
            }
        });

        authorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chooseAuthorLbl.setText("Choose Author");

        insertAuthorBtn.setText("insert Author-Book");
        insertAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAuthorBtnActionPerformed(evt);
            }
        });

        InsertAAuthorBtn.setText("Insert Author");
        InsertAAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAAuthorBtnActionPerformed(evt);
            }
        });

        choosePubLbl.setText("Choose Publisher");

        pubBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        InsertPubBtn.setText("Insert Book-Publisher");
        InsertPubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertPubBtnActionPerformed(evt);
            }
        });

        InsertAPubBtn.setText("Insert Publisher");
        InsertAPubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAPubBtnActionPerformed(evt);
            }
        });

        choosePeopleLbl.setText("Choose People");

        peopleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        InsertPeopleBtn.setText("Insert Book-People");
        InsertPeopleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertPeopleBtnActionPerformed(evt);
            }
        });

        InsertAPeopleBtn.setText("Insert Person");
        InsertAPeopleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAPeopleBtnActionPerformed(evt);
            }
        });

        bookBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bookBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBoxActionPerformed(evt);
            }
        });

        chooseBookLbl.setText("Choose Book");

        jLabel2.setText("Year");

        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Connect Book to others");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isbnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isbnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(catTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InsertAPeopleBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(InsertAAuthorBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titleTxt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(InsertAPubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(chooseAuthorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(authorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(choosePubLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(pubBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(insertAuthorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(48, 48, 48)
                                        .addComponent(InsertPubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(choosePeopleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(peopleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(InsertPeopleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insetBtn)
                                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pageTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chooseBookLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookBox, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {catTxt, isbnTxt, pageTxt, titleTxt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authorBox, peopleBox, pubBox});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {InsertAAuthorBtn, InsertAPeopleBtn, InsertAPubBtn, InsertPubBtn, insertAuthorBtn});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chooseAuthorLbl, choosePeopleLbl, choosePubLbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbnLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertAPubBtn))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catLbl)
                            .addComponent(catTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertAAuthorBtn)))
                    .addComponent(InsertAPeopleBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseBookLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseAuthorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choosePubLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pubBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choosePeopleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peopleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertAuthorBtn)
                    .addComponent(InsertPubBtn)
                    .addComponent(InsertPeopleBtn))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {catTxt, isbnTxt, pageTxt, titleTxt});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {catLbl, isbnLbl, pageLbl, titleLbl});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {InsertAAuthorBtn, InsertAPeopleBtn, InsertAPubBtn, InsertPeopleBtn, InsertPubBtn, insertAuthorBtn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chooseAuthorLbl, choosePeopleLbl, choosePubLbl});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    private void pageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageTxtActionPerformed
        
        
        
    }//GEN-LAST:event_pageTxtActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    private void insetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insetBtnActionPerformed
      
        try {
            String isbn = isbnTxt.getText();
            String title = titleTxt.getText();
            String category = catTxt.getText();
            int page = Integer.parseInt(pageTxt.getText());
            
            ArrayList<Books> books = Utility.getBooks(connection, statement);
            
            if (!Utility.isValidISBN(isbn,books))
            {
                Utility.showMessage("ISBN is include the sytem! \n", "ISBN Collision", 0);
                return;
            }
            
            
            insertBook(isbn,title,category,page);
            
            Library.update();
            Utility.showBookBox(connection, statement, bookBox);
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_insetBtnActionPerformed

    
     private void insertBook(String isbn , String title , String category , int page)
    {
        try 
        {
            pst = connection.prepareStatement(insertQuery2);
            
            pst.setString(1, isbn);
            pst.setString(2, title);
            pst.setString(3, category);
            pst.setInt(4,page);
            
            pst.executeUpdate();
            
            Utility.showMessage("Book is entered!","Insert!",1);
           
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    private void InsertAAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAAuthorBtnActionPerformed
        try 
        {
            InsertAuthor ia = new InsertAuthor(connection,authorBox);
            
            ia.setVisible(true);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InsertAAuthorBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // For avoid to code repetition targetIdx2 for year
    private <D,T> void insert( ArrayList<D> dest , ArrayList<T> target , int destIdx , int targetIdx , int targetIdx2,  String query ,
            String msg , String msgTitle ,JComboBox<String> destBox , JComboBox<String> targetBox)
    {
        
          try 
        {
            int k = JOptionPane.showInternalConfirmDialog(null, "Are You Sure ?");
            
            if (k == 1)
                return;
            
  
            if (destIdx <= 0 || destIdx > dest.size() || targetIdx <= 0  || targetIdx > target.size())
            {
                Utility.showMessage("ERROR! AFSFASF","INSERT ERROR",0);
                return;
            }
            
            PreparedStatement pst = connection.prepareStatement(query);
            
            pst.setInt(1, targetIdx);
            pst.setInt(2, destIdx);
            
            if (targetIdx2 != -1)
                pst.setInt(3, targetIdx2);
            
            pst.executeUpdate();
            
            Utility.showMessage(msg,msgTitle,1);
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    private void InsertPeopleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertPeopleBtnActionPerformed
        
        try 
        {
            String query = "CALL insertBookPeople(?,?,?);";
            
            ArrayList<Books> books = Utility.getBooks(connection, statement);
            ArrayList<People> people = Utility.getPeople(connection, statement);
            
            int bookIdx = bookBox.getSelectedIndex() + 1;
            int peopleIdx = peopleBox.getSelectedIndex() + 1;
            
            int idx = yearBox.getSelectedIndex();
            int year = Integer.parseInt(yearBox.getItemAt(idx));
            //if (year )
            
            
            
            insert(books , people , bookIdx , peopleIdx ,year, query , "People-Books is entered!" ,"Insert", bookBox , peopleBox );
            Library.update();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
                    

        
    }//GEN-LAST:event_InsertPeopleBtnActionPerformed

    private void InsertAPeopleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAPeopleBtnActionPerformed
       
        
        
        InsertPeople ip = new InsertPeople(connection,peopleBox);
        ip.setVisible(true);
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_InsertAPeopleBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    // Book Box
    private void bookBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBoxActionPerformed
        
        try 
        {
            int idx = bookBox.getSelectedIndex();
            ArrayList<Books> books = Utility.getBooks(connection, statement);
            
            isbnTxt.setText(books.get(idx).getISBN());
            titleTxt.setText(books.get(idx).getTitle());
            catTxt.setText(books.get(idx).getCategory());
            pageTxt.setText(Integer.toString(books.get(idx).getPage()));
        } 
        catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookBoxActionPerformed

    
    
    
    
    
    
    
    
    
    
    // insert Author button. When you select a book ( Choose book ) and select a author from ( Author book) then you select thr insert Author button
    // below functions matched  author and book so , book added autor or author have a book
    private void insertAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAuthorBtnActionPerformed
       
        
        try 
        {
     
            
            ArrayList<Books> books = Utility.getBooks(connection, statement);
            ArrayList<Authors> authors = Utility.getAuthors(connection, statement);
            
            int bookIdx = bookBox.getSelectedIndex() + 1;
            int authorIdx = authorBox.getSelectedIndex() + 1;
            
            String query = "CALL insertAuthorBooks(?,?);";
            
            
            insert(books , authors , bookIdx , authorIdx ,-1, query , "Author-Books is entered!" ,"Insert", bookBox , authorBox );
            Library.update();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_insertAuthorBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void InsertPubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertPubBtnActionPerformed
        
        
          try 
        {
            int bookIdx = bookBox.getSelectedIndex() + 1;
            int pubIdx = pubBox.getSelectedIndex() + 1;
            if (bookIdx == -1|| pubIdx == -1)
            {
                Utility.showMessage("Please Firstly choose Book Then other complement!", "Wrong Usage!", 3);
                return;
            }
            ArrayList<Books> books = Utility.getBooks(connection, statement);
            ArrayList<Publishers> pubs = Utility.getPublishers(connection, statement);
            
            
            
            String query = "INSERT INTO BookPublishers VALUES(?,? );";
            
            insert(books , pubs , bookIdx , pubIdx , -1 , query , "Publisher-Books is entered!" ,"Insert", bookBox , pubBox );
                  
            Library.update();        
                    
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_InsertPubBtnActionPerformed

    
    
    // Insert Another Publisher. If your publisher does not exists in publisher box , you should "Insert another Publisher" button
    private void InsertAPubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAPubBtnActionPerformed
        
        InsertPublisher ip = new InsertPublisher(connection , pubBox);
        ip.setVisible(true);
        
        
    }//GEN-LAST:event_InsertAPubBtnActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearBoxActionPerformed

   
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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertAAuthorBtn;
    private javax.swing.JButton InsertAPeopleBtn;
    private javax.swing.JButton InsertAPubBtn;
    private javax.swing.JButton InsertPeopleBtn;
    private javax.swing.JButton InsertPubBtn;
    private javax.swing.JComboBox<String> authorBox;
    private javax.swing.JComboBox<String> bookBox;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField catTxt;
    private javax.swing.JLabel chooseAuthorLbl;
    private javax.swing.JLabel chooseBookLbl;
    private javax.swing.JLabel choosePeopleLbl;
    private javax.swing.JLabel choosePubLbl;
    private javax.swing.JButton insertAuthorBtn;
    private javax.swing.JButton insetBtn;
    private javax.swing.JLabel isbnLbl;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pageLbl;
    private javax.swing.JTextField pageTxt;
    private javax.swing.JComboBox<String> peopleBox;
    private javax.swing.JComboBox<String> pubBox;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
