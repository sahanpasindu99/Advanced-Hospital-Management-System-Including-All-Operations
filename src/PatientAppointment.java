import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class PatientAppointment extends javax.swing.JFrame {

    public PatientAppointment() {
      
        initComponents();
        int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 5;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();

        jTextField1.setText(generatedString);
        
           jComboBox1.addItem("") ;
         jComboBox1.addItem("Nerve") ;
         jComboBox1.addItem("Dermatology") ;
         jComboBox1.addItem("Family Medicine") ;
           jComboBox1.addItem("Neurology") ;
           jComboBox1.addItem("Internal Medicine") ;
           jComboBox1.addItem("General Surgery") ;
           jComboBox1.addItem("Anesthesiologist") ;
           jComboBox1.addItem("Oncology") ;
           jComboBox1.addItem("Internal Medicine") ;
           jComboBox1.addItem("Intensive Care") ;
             
           
           
            try{

             Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        
            Statement st=con.createStatement(); 
              
                     ResultSet rs=st.executeQuery("select Test from labfacilities");
                       
                      jComboBox4.addItem("");
                        while(rs.next()){
                            jComboBox4.addItem(rs.getString(1));
                        }        
        }
        catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Error occurred","Error",JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
        }
         
              try{
              String type=jComboBox1.getSelectedItem().toString();

             Class.forName("com.mysql.cj.jdbc.Driver");
        
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
        
            Statement st=con.createStatement(); 
              
                     ResultSet rs=st.executeQuery("select PatientID from patients");
                       
                      jComboBox3.addItem("");
                        while(rs.next()){
                            jComboBox3.addItem(rs.getString(1));
                        }           
        }
        catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Error occurred","Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 450));
        setSize(new java.awt.Dimension(720, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 66, 140, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 113, 137, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 295, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 342, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 292, 137, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Patient ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 212, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Appointment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 28, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Get Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 342, -1, -1));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 209, 137, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Appointment ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 66, -1, -1));

        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 258, 134, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Category");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 116, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Test Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 258, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Doctor ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 166, -1, -1));

        jComboBox2.setEnabled(false);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 166, 137, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try{
            String type=jComboBox1.getSelectedItem().toString();
            String drName;

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");

            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select DoctorID,Name from doctors where DoctorID=(Select DoctorID from doctors where Specialization='"+type+"')");

            while(rs.next()){
                jComboBox2.addItem(rs.getString(1));
                drName=rs.getString(1);

            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error occurred","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new patientHome().show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{

            Date  date=jDateChooser1.getDate();
            String strDate=DateFormat.getDateInstance().format(date);
            String appointmentId=jTextField1.getText();
            String category= jComboBox1.getSelectedItem().toString();
            String doctorId=   jComboBox2.getSelectedItem().toString();
            String patientId=   jComboBox3.getSelectedItem().toString();
            String testType=   jComboBox4.getSelectedItem().toString();

            if( !testType.equals("") && !appointmentId.equals("") && !category.equals("") && !category.equals("") && !doctorId.equals("") && !patientId.equals("") && !strDate.equals("") ){
                this.dispose();
                new PatientReport(strDate,appointmentId,doctorId,patientId,testType).show();

            }else{
                JOptionPane.showMessageDialog(this, "All fields must be filled","Error",JOptionPane.ERROR_MESSAGE);
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error occurred","Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 String src="com.jtattoo.plaf.hifi.HiFiLookAndFeel";
                try {
                    UIManager.setLookAndFeel(src);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                new PatientAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
