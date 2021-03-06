
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


public class ClassRoutineEditable extends javax.swing.JFrame {

    /**
     * Creates new form ClassRoutineEditable
     */
    public ClassRoutineEditable() {
        initComponents();
        setLocationRelativeTo(null);
        display();
    }
    
    public void display(){
        int cnt;
        
        try {
            statement=connect.prepareStatement("select *from classroutine");
            result=statement.executeQuery();
            ResultSetMetaData resMeta = result.getMetaData();
            
            cnt = resMeta.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)routineTable.getModel();
            dt.setRowCount(0);
            while(result.next()){
                
                Vector store= new Vector();
                
                for(int i=1; i<=cnt; i++){
                    
                    store.add(result.getString("time"));
                    store.add(result.getString("sunday"));
                    store.add(result.getString("monday"));
                    store.add(result.getString("tuesday"));
                    store.add(result.getString("wednesday"));
                    store.add(result.getString("thursday"));
                    
                }
                dt.addRow(store);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ClassRoutineEditable.class.getName()).log(Level.SEVERE, null, ex);
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

        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        editTimeLabel = new javax.swing.JLabel();
        sundayTextField = new javax.swing.JTextField();
        editTimeTextField = new javax.swing.JTextField();
        sundayLabel = new javax.swing.JLabel();
        mondayLabel = new javax.swing.JLabel();
        tuesdayLabel = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        thursdayLabel = new javax.swing.JLabel();
        mondayTextField = new javax.swing.JTextField();
        tuesdayTextField = new javax.swing.JTextField();
        wednesdayTextField = new javax.swing.JTextField();
        thursdayTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        routineTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deletButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(255, 204, 204));
        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(175, 5, 73));
        titleLabel.setText("Class routine");

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        editTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editTimeLabel.setText("Edit Time:");

        sundayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sundayLabel.setText("Sunday:");

        mondayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mondayLabel.setText("Monday:");

        tuesdayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tuesdayLabel.setText("Tuesday:");

        wednesdayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wednesdayLabel.setText("Wednesday:");

        thursdayLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thursdayLabel.setText("Thursday:");

        routineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"
            }
        ));
        routineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                routineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(routineTable);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(333, 333, 333))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mondayLabel)
                    .addComponent(sundayLabel)
                    .addComponent(editTimeLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mondayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sundayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thursdayLabel)
                    .addComponent(tuesdayLabel)
                    .addComponent(wednesdayLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuesdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wednesdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thursdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuesdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tuesdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wednesdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wednesdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sundayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sundayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mondayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mondayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thursdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thursdayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String time = editTimeTextField.getText();
        String sunday = sundayTextField.getText();
        String monday = mondayTextField.getText();
        String tuesday = tuesdayTextField.getText();
        String wednesday = wednesdayTextField.getText();
        String thursday = thursdayTextField.getText();
        
        try {
            
            statement = connect.prepareStatement("update classroutine set time=?, sunday=?, monday=?, tuesday=?, wednesday=?, thursday=? where time=?");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to update?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                statement.setString(1, time);
                statement.setString(2, sunday);
                statement.setString(3, monday);
                statement.setString(4, tuesday);
                statement.setString(5, wednesday);
                statement.setString(6, thursday);
                statement.setString(7, oldTime);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Updated!");
                
                editTimeTextField.setText("");
                sundayTextField.setText("");
                mondayTextField.setText("");
                tuesdayTextField.setText("");
                wednesdayTextField.setText("");
                thursdayTextField.setText("");
                
                display();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ClassRoutineEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed
        
        try {
            
            statement = connect.prepareStatement("delete from classroutine where time=?");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to delete?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                
                statement.setString(1, oldTime);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Deleted!");
                
                editTimeTextField.setText("");
                sundayTextField.setText("");
                mondayTextField.setText("");
                tuesdayTextField.setText("");
                wednesdayTextField.setText("");
                thursdayTextField.setText("");
                
                display();
                
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(ClassRoutineEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deletButtonActionPerformed

    private void routineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_routineTableMouseClicked
        int row = routineTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) routineTable.getModel();
        
        oldTime = model.getValueAt(row, 0).toString();
        
        editTimeTextField.setText(model.getValueAt(row, 0).toString());
        sundayTextField.setText(model.getValueAt(row, 1).toString());
        mondayTextField.setText(model.getValueAt(row, 2).toString());
        tuesdayTextField.setText(model.getValueAt(row, 3).toString());
        wednesdayTextField.setText(model.getValueAt(row, 4).toString());
        thursdayTextField.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_routineTableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new ExistingInfo().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
       
        String time = editTimeTextField.getText();
        String sunday = sundayTextField.getText();
        String monday = mondayTextField.getText();
        String tuesday = tuesdayTextField.getText();
        String wednesday = wednesdayTextField.getText();
        String thursday = thursdayTextField.getText();
        
        try {
            
            statement = connect.prepareStatement("insert into classroutine (time, sunday, monday, tuesday, wednesday, thursday) values(?,?,?,?,?,?)");
            
            String ck = JOptionPane.showInputDialog(this, "Are you sure want to insert?\nPress Y for Yes\nPress N for No");
            
            if(ck.equals("Y") || ck.equals("y")){
                statement.setString(1, time);
                statement.setString(2, sunday);
                statement.setString(3, monday);
                statement.setString(4, tuesday);
                statement.setString(5, wednesday);
                statement.setString(6, thursday);
                
                statement.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Inserted!");
                
                editTimeTextField.setText("");
                sundayTextField.setText("");
                mondayTextField.setText("");
                tuesdayTextField.setText("");
                wednesdayTextField.setText("");
                thursdayTextField.setText("");
                
                display();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ClassRoutineEditable.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ClassRoutineEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassRoutineEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassRoutineEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassRoutineEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassRoutineEditable().setVisible(true);
            }
        });
    }

    ///custom variables.
    private SQL objRoutine = new SQL();
    
    Connection connect = objRoutine.connection();
    PreparedStatement statement;
    ResultSet result;
    
    private String oldTime;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deletButton;
    private javax.swing.JLabel editTimeLabel;
    private javax.swing.JTextField editTimeTextField;
    private javax.swing.JButton insertButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mondayLabel;
    private javax.swing.JTextField mondayTextField;
    private javax.swing.JTable routineTable;
    private javax.swing.JLabel sundayLabel;
    private javax.swing.JTextField sundayTextField;
    private javax.swing.JLabel thursdayLabel;
    private javax.swing.JTextField thursdayTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel tuesdayLabel;
    private javax.swing.JTextField tuesdayTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JTextField wednesdayTextField;
    // End of variables declaration//GEN-END:variables
}
