package miniproject;

import java.sql.*;
import javax.swing.JOptionPane;

public class frmoptionmyexam extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frmoptionmyexam(String ssusername) {
        initComponents();
        this.sessionusername = ssusername;
        mysubjectisnotlearning();
        mysubjectislearning();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        dw_subjectnotlearning = new javax.swing.JComboBox<String>();
        dw_subjectlearning = new javax.swing.JComboBox<String>();
        btn_learning = new javax.swing.JButton();
        btn_deleteleaning = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        dw_subjectnotlearning.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(dw_subjectnotlearning);
        dw_subjectnotlearning.setBounds(60, 130, 260, 27);

        dw_subjectlearning.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(dw_subjectlearning);
        dw_subjectlearning.setBounds(60, 210, 260, 27);

        btn_learning.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_learning.setText("เรียน");
        btn_learning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_learningActionPerformed(evt);
            }
        });
        jPanel1.add(btn_learning);
        btn_learning.setBounds(350, 130, 70, 29);

        btn_deleteleaning.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_deleteleaning.setText("ลบ");
        btn_deleteleaning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteleaningActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteleaning);
        btn_deleteleaning.setBounds(350, 210, 70, 29);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 22)); // NOI18N
        jLabel1.setText("จัดการรายวิชาของคุณเพื่อง่ายต่อการทำข้อสอบครั้งต่อไป");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 60, 330, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_learningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_learningActionPerformed
        int dialogButton = jOptionPane1.YES_NO_OPTION;
        int dialogResult = jOptionPane1.showConfirmDialog(this, "คุณต้องการที่จะเพื่มวิชา "+dw_subjectnotlearning.getSelectedItem()+" หรือไม่ ?", "ยืนยัน", dialogButton);
        if(dialogResult == 0){
            try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement rank = connect.prepareStatement("INSERT INTO userrank (username , rank , count_all , count_thisrank , true_all , true_thisrank , chance_thisrank , subject_id ) "
                            + "values ('"+sessionusername+"' , '1' , '0' , '0' , '0' , '0' , '1' , (select subject_id from subject where subject_name = '"+dw_subjectnotlearning.getSelectedItem()+"'))")) {
                    int record = rank.executeUpdate();
                    if (record > 0 ){
                        JOptionPane.showMessageDialog(null,"ทำการเพื่มวิชา "+dw_subjectnotlearning.getSelectedItem()+" ลงในการเรียนของคุณเรียบร้อยแล้ว ","สำเร็จ",JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"กรุณาตรวจสอบวิชาของคุณใหม่อีกครั้ง","ผิดพลาด",JOptionPane.PLAIN_MESSAGE);
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
            try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement skill = connect.prepareStatement("INSERT INTO skill (username , subject_id , exp) "
                            + "values ('"+sessionusername+"' , (select subject_id from subject where subject_name = '"+dw_subjectnotlearning.getSelectedItem()+"') , '0')")) {
                    int record = skill.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        }
        mysubjectisnotlearning();
        mysubjectislearning();
    }//GEN-LAST:event_btn_learningActionPerformed

    private void btn_deleteleaningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteleaningActionPerformed
        int dialogButton = jOptionPane1.YES_NO_OPTION;
        int dialogResult = jOptionPane1.showConfirmDialog(this, "<html>คุณต้องการที่จะลบวิชา "+dw_subjectlearning.getSelectedItem()+" หรือไม่ ? <br> กรณีลบจะไม่สามาถากู้คืนทักษะทั่วไป และ ความชำนาญได้</html>","ยืนยัน", dialogButton);
        if(dialogResult == 0){
            try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement delrank = connect.prepareStatement("delete from userrank where username = '"+sessionusername+"' and subject_id = (select subject_id from subject where subject_name = '"+dw_subjectlearning.getSelectedItem()+"')")) {
                    int record = delrank.executeUpdate();
                    if (record > 0 ){
                        JOptionPane.showMessageDialog(null,"ทำการลบวิชา "+dw_subjectlearning.getSelectedItem()+" เรียบร้อยแล้ว ","สำเร็จ",JOptionPane.PLAIN_MESSAGE);
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
            
            try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement delrank = connect.prepareStatement("delete from skill where username = '"+sessionusername+"' and subject_id = (select subject_id from subject where subject_name = '"+dw_subjectlearning.getSelectedItem()+"')")) {
                    int record = delrank.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        }
        mysubjectisnotlearning();
        mysubjectislearning();
        frmhome refrmhome = new frmhome(sessionusername);
        refrmhome.re();
    }//GEN-LAST:event_btn_deleteleaningActionPerformed
    private int count = 0 ;
    public void mysubjectisnotlearning(){
        dw_subjectnotlearning.removeAllItems();
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select subject_name from subject where subject_id not in (select subject_id from skill where username = '"+sessionusername+"') ")){
                    ResultSet getsubjectname = ps.executeQuery(); 
                    while (getsubjectname.next()) {
                        count++;
                        dw_subjectnotlearning.addItem(String.valueOf(getsubjectname.getString("subject_name")));
                        }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    
    public void mysubjectislearning(){
        dw_subjectlearning.removeAllItems();
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select subject_name from subject where subject_id in (select subject_id from skill where username = '"+sessionusername+"') ")){
                    ResultSet getsubjectname = ps.executeQuery(); 
                    while (getsubjectname.next()) {
                        count++;
                        dw_subjectlearning.addItem(String.valueOf(getsubjectname.getString("subject_name")));
                        }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void closeConnection() {
                   if(connection != null)
                    try    {
                        connection.close();
                        connection = null;
                    }
                    catch (SQLException ex){
                        System.err.println("Message: "+ ex.getMessage());
                    }
           }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deleteleaning;
    private javax.swing.JButton btn_learning;
    private javax.swing.JComboBox<String> dw_subjectlearning;
    private javax.swing.JComboBox<String> dw_subjectnotlearning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
