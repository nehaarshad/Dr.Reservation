/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docreservationsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Feedback");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setText("Your Name");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        type1.setText("Feedback");
        jPanel1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 20));

        type2.setText("Doctor Name");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 20));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 30));

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String name=  jname.getText();
        new phome(name).setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
feedback();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    public void feedback() {
        
    String f=jTextArea1.getText();
    int patientId = getid();  // Get patient ID from the patient table
    int doctorId = getid1();  // Get doctor ID from the doctor table
    
        try (Connection con = databaseconnection.getConnection()) {
             if (con != null) {
            // SQL query to insert feedback into the feedbacktable
            String query = "INSERT INTO feedback ( doctor_id, patient_id,rating, review) "
                    + "VALUES (?, ?, 4.7, ?)";  // Rating set to 4.7 by default

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, doctorId);  // Set patient ID
            ps.setInt(2, patientId);   // Set doctor ID
            ps.setString(3, f);       // Set review from the text area

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Feedback submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to submit feedback.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }}
    public static void main(String args[]) {
       
    }
public int getid1(){ 
    String dname=jTextField3.getText();
    int id = 0;
    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            String query = "SELECT doctor_id FROM `doctor` WHERE name = ? ";  
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dname);

            ResultSet rs = ps.executeQuery();
       
            if (rs.next()) {
               id=rs.getInt("doctor_id");  
            } else {
                
                JOptionPane.showMessageDialog(this, "Doctor not found!.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // If database connection fails
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return id;
}
public int getid(){ 
    String dname=jTextField2.getText();
    int id = 0;
    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            String query = "SELECT patient_id FROM `patient` WHERE name = ? ";  
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, dname);

            ResultSet rs = ps.executeQuery();
       
            if (rs.next()) {
               id=rs.getInt("patient_id");  
            } else {
                
                JOptionPane.showMessageDialog(this, "patient not found!.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // If database connection fails
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return id;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables
}