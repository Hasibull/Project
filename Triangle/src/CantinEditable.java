
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CantinEditable extends javax.swing.JFrame {

    /**
     * Creates new form CantinEditable
     */
    public CantinEditable() {
        initComponents();
        setLocationRelativeTo(null);
        display();
    }
    
    private void display(){
        int cnt;
        
        try {
            statement=connect.prepareStatement("select *from cantin");
            result=statement.executeQuery();
            ResultSetMetaData resMeta = result.getMetaData();
            
            cnt = resMeta.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)contentTable.getModel();
            dt.setRowCount(0);
            while(result.next()){
                
                Vector store= new Vector();
                
                for(int i=1; i<=cnt; i++){
                    
                    store.add(result.getString("foodname"));
                    store.add(result.getString("available"));
                    store.add(result.getString("price"));
                    
                }
                dt.addRow(store);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CantinEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editAvailableNoTextField = new javax.swing.JTextPane();
        editFoodNameLabel = new javax.swing.JLabel();
        foodNameLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        editFoodNameTextField = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        editPriceTextField = new javax.swing.JTextPane();
        updateButton = new javax.swing.JButton();
        deletButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        insertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(255, 204, 204));
        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(175, 5, 73));
        titleLabel.setText("  Cantin");

        foodNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        foodNameLabel.setText("Edit Available No:");

        editAvailableNoTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editAvailableNoTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane2.setViewportView(editAvailableNoTextField);

        editFoodNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editFoodNameLabel.setText("Edit Food Name:");

        foodNameLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        foodNameLabel2.setText("Edit Price:");

        editFoodNameTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editFoodNameTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane3.setViewportView(editFoodNameTextField);

        editPriceTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editPriceTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane4.setViewportView(editPriceTextField);

        updateButton.setBackground(new java.awt.Color(153, 255, 153));
        updateButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(204, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deletButton.setBackground(new java.awt.Color(153, 255, 153));
        deletButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deletButton.setForeground(new java.awt.Color(204, 0, 0));
        deletButton.setText("Delete");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Name", "Available No", "Price"
            }
        ));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contentTable);

        insertButton.setBackground(new java.awt.Color(153, 255, 153));
        insertButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        insertButton.setForeground(new java.awt.Color(204, 0, 0));
        insertButton.setText("Insert");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(backButton)
                        .addGap(304, 304, 304)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editFoodNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(foodNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(foodNameLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editFoodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 138, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new ExistingInfo().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        String foodName = editFoodNameTextField.getText();
        String available = editAvailableNoTextField.getText();
        String price = editPriceTextField.getText();
        
        try {
            
            statement = connect.prepareStatement("update cantin set foodname=?, available=?, price=? where foodname=?");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to update?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                
                statement.setString(1, foodName);
                statement.setString(2, available);
                statement.setString(3, price);
                statement.setString(4, oldName);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Updated!");
                
                editFoodNameTextField.setText("");
                editAvailableNoTextField.setText("");
                editPriceTextField.setText("");
                
                display();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CantinEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed
        try {
            
            statement = connect.prepareStatement("delete from cantin where foodname=?");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to delete?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                
                statement.setString(1, oldName);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Deleted!");
                
                editFoodNameTextField.setText("");
                editAvailableNoTextField.setText("");
                editPriceTextField.setText("");
                
                display();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CantinEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletButtonActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        int row = contentTable.getSelectedRow();

        DefaultTableModel table = (DefaultTableModel)contentTable.getModel();
        
        oldName = table.getValueAt(row, 0).toString();
        
        editFoodNameTextField.setText(table.getValueAt(row, 0).toString());
        editAvailableNoTextField.setText(table.getValueAt(row, 1).toString());
        editPriceTextField.setText(table.getValueAt(row, 2).toString());
    }//GEN-LAST:event_contentTableMouseClicked

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        
        String foodName = editFoodNameTextField.getText();
        String available = editAvailableNoTextField.getText();
        String price = editPriceTextField.getText();
        
        try {
            
            statement = connect.prepareStatement("insert into cantin (foodname, available, price) values(?,?,?)");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to insert?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                
                statement.setString(1, foodName);
                statement.setString(2, available);
                statement.setString(3, price);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Inserted!");
                
                editFoodNameTextField.setText("");
                editAvailableNoTextField.setText("");
                editPriceTextField.setText("");
                
                display();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CantinEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_insertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CantinEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CantinEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CantinEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CantinEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CantinEditable().setVisible(true);
            }
        });
    }
    
    //custom variables.
    SQL objCantin = new SQL();
    
    Connection connect = objCantin.connection();
    
    PreparedStatement statement;
    ResultSet result;
    
    private String oldName;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable contentTable;
    private javax.swing.JButton deletButton;
    private javax.swing.JTextPane editAvailableNoTextField;
    private javax.swing.JLabel editFoodNameLabel;
    private javax.swing.JTextPane editFoodNameTextField;
    private javax.swing.JTextPane editPriceTextField;
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JLabel foodNameLabel2;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
