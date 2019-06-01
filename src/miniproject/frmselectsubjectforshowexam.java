package miniproject;

import java.sql.*;

public class frmselectsubjectforshowexam extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frmselectsubjectforshowexam(String ssusername) {
        initComponents();
        this.sessionusername = ssusername;
        mysubjectislearning();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dw_selectsubject = new javax.swing.JComboBox<>();
        btn_showexamnormal = new javax.swing.JButton();
        btn_showexamadvance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        dw_selectsubject.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(dw_selectsubject);
        dw_selectsubject.setBounds(80, 120, 300, 20);

        btn_showexamnormal.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_showexamnormal.setText("ทำข้อสอบแบบทั่วไป");
        btn_showexamnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showexamnormalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_showexamnormal);
        btn_showexamnormal.setBounds(40, 200, 140, 30);

        btn_showexamadvance.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_showexamadvance.setText("ทำข้อสอบแบบพิเศษ (จัดระดับ)");
        btn_showexamadvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showexamadvanceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_showexamadvance);
        btn_showexamadvance.setBounds(210, 200, 210, 30);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("ข้อสอบที่มีให้ทำ ณ ตอนนี้");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 50, 160, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_showexamnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showexamnormalActionPerformed
        frmshowexamnormal ob_showexamnormal = new frmshowexamnormal(sessionusername,String.valueOf(dw_selectsubject.getSelectedItem()));
        ob_showexamnormal.setVisible(ob_showexamnormal.get_check_row_exam());
        this.dispose();
    }//GEN-LAST:event_btn_showexamnormalActionPerformed

    private void btn_showexamadvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showexamadvanceActionPerformed
        frmshowexamadvance ob_showexamadvance = new frmshowexamadvance(sessionusername,String.valueOf(dw_selectsubject.getSelectedItem()));
        ob_showexamadvance.setVisible(ob_showexamadvance.get_check_row_exam());
        this.dispose();
    }//GEN-LAST:event_btn_showexamadvanceActionPerformed
    private int count = 0 ;
    public void mysubjectislearning(){
        dw_selectsubject.removeAllItems();
        
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select subject.subject_name from skill,subject where skill.username = '"+sessionusername+"' "
                            + "and skill.subject_id = subject.subject_id "
                            + "and skill.subject_id in (select exam_subject_id from exam_input where exam_input.exam_username != '"+sessionusername+"' "
                                + "and exam_input.exam_id not in (select exam_id from exam_log where username = '"+sessionusername+"'))"

                    )) 
                    {
                    ResultSet getsubjectname = ps.executeQuery();
                    
                    while (getsubjectname.next()) {
                        count++;
                        dw_selectsubject.addItem(String.valueOf(getsubjectname.getString("subject_name")));
                        }
                    if(count == 0){
                        dw_selectsubject.addItem("ยังไม่มีข้อมูลของแบบทดสอบที่คุณทำได้กรุณารอ...");
                        btn_showexamnormal.setEnabled(false);
                        btn_showexamadvance.setEnabled(false);
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
    private javax.swing.JButton btn_showexamadvance;
    private javax.swing.JButton btn_showexamnormal;
    private javax.swing.JComboBox<String> dw_selectsubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
