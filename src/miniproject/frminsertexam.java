package miniproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class frminsertexam extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frminsertexam(String ssusername) {
        initComponents();
        this.sessionusername = ssusername;
        setfrminsertexam();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gp_check = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dw_subject = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        txt_topic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_content = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txt_ch1 = new javax.swing.JTextField();
        txt_ch2 = new javax.swing.JTextField();
        txt_ch3 = new javax.swing.JTextField();
        txt_ch4 = new javax.swing.JTextField();
        btn_saveexam = new javax.swing.JButton();
        cb_ans1 = new javax.swing.JCheckBox();
        cb_ans2 = new javax.swing.JCheckBox();
        cb_ans3 = new javax.swing.JCheckBox();
        cb_ans4 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel2.setText("วิชา");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 49, 40, 21);

        dw_subject.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(dw_subject);
        dw_subject.setBounds(80, 50, 410, 27);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel3.setText("หัวข้อ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(14, 96, 50, 21);

        txt_topic.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_topic);
        txt_topic.setBounds(80, 90, 410, 30);

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel4.setText("เนื้อหา");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 158, 50, 21);

        txt_content.setColumns(20);
        txt_content.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_content.setRows(5);
        jScrollPane1.setViewportView(txt_content);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 470, 140);

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel5.setText("ตัวเลือก");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 320, 80, 21);

        txt_ch1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_ch1);
        txt_ch1.setBounds(100, 320, 330, 30);

        txt_ch2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_ch2);
        txt_ch2.setBounds(100, 360, 330, 30);

        txt_ch3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_ch3);
        txt_ch3.setBounds(100, 400, 330, 30);

        txt_ch4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_ch4);
        txt_ch4.setBounds(100, 440, 330, 30);

        btn_saveexam.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_saveexam.setText("Save");
        btn_saveexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveexamActionPerformed(evt);
            }
        });
        jPanel1.add(btn_saveexam);
        btn_saveexam.setBounds(220, 510, 150, 40);

        gp_check.add(cb_ans1);
        jPanel1.add(cb_ans1);
        cb_ans1.setBounds(440, 320, 40, 21);

        gp_check.add(cb_ans2);
        jPanel1.add(cb_ans2);
        cb_ans2.setBounds(440, 360, 40, 21);

        gp_check.add(cb_ans3);
        jPanel1.add(cb_ans3);
        cb_ans3.setBounds(440, 400, 40, 21);

        gp_check.add(cb_ans4);
        jPanel1.add(cb_ans4);
        cb_ans4.setBounds(440, 440, 40, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveexamActionPerformed
        if(checkans() != 0){
            try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("INSERT INTO exam_input "
                            + "(exam_username,exam_exp,exam_subject_id,exam_topic,exam_content,exam_choice1,exam_choice2,exam_choice3,exam_choice4,exam_ans,count,this_true)"
                            + " VALUES ('"+sessionusername+"','"+selectexp()+"','"+selectsubjectid()+"','"+txt_topic.getText()+"','"+txt_content.getText()+"', '"+txt_ch1.getText()+"', '"+txt_ch2.getText()+"', '"+txt_ch3.getText()+"', '"+txt_ch4.getText()+"','"+checkans()+"' ,'0' ,'0');")) {
                    int record = ps.executeUpdate();
                    if(record > 0){
                        jOptionPane1.showMessageDialog(null,"บันทึกแบบทดสอบเรียบร้อยแล้ว");
                        puls_exp();
                        this.dispose();
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }                                                                                
        }
        else{
            jOptionPane1.showMessageDialog(null,"กรุณาใส่คำตอบให้ถูกต้อง");
        }  
    }//GEN-LAST:event_btn_saveexamActionPerformed
    int subject_id;
    int exp;
    int ans;
    
    public int checkans(){
        if(cb_ans1.isSelected()){
            ans = 1;
        }
        else if(cb_ans2.isSelected()){
            ans = 2;
        }
        else if(cb_ans3.isSelected()){
            ans = 3;
        }
        else if(cb_ans4.isSelected()){
            ans = 4;
        }
        else{
            ans = 0;
        }
        return ans;
    }
    
    public int selectexp(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT exp from skill where subject_id = '"+selectsubjectid()+"' and username =  '"+sessionusername+"' ")) {
                    ResultSet getsubjectid = ps.executeQuery();
                    while (getsubjectid.next()) {
                        exp = getsubjectid.getInt("exp");
                        }  
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }    
            return exp;
    }
    
    public int selectsubjectid(){ 
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT subject_id from subject where subject_name = '"+dw_subject.getSelectedItem()+"'")) {
                    ResultSet getsubjectid = ps.executeQuery();
                    while (getsubjectid.next()) {
                        subject_id = getsubjectid.getInt("subject_id");
                        }  
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }    
            return subject_id;
    }
    
    public void setfrminsertexam(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select subject_name from subject where subject_id in (select subject_id from skill where username = '"+sessionusername+"') ")) {
                    ResultSet getsubjecttodropdowlist = ps.executeQuery();
                    while (getsubjecttodropdowlist.next()) {
                        dw_subject.addItem(String.valueOf(getsubjecttodropdowlist.getString("subject_name")));
                        }  
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void puls_exp(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update skill set exp = exp + 40 where username = '"+sessionusername+"' and subject_id = '"+selectsubjectid()+"'")) {
                    int record = ps.executeUpdate();
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
    private javax.swing.JButton btn_saveexam;
    private javax.swing.JCheckBox cb_ans1;
    private javax.swing.JCheckBox cb_ans2;
    private javax.swing.JCheckBox cb_ans3;
    private javax.swing.JCheckBox cb_ans4;
    private javax.swing.JComboBox<String> dw_subject;
    private javax.swing.ButtonGroup gp_check;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ch1;
    private javax.swing.JTextField txt_ch2;
    private javax.swing.JTextField txt_ch3;
    private javax.swing.JTextField txt_ch4;
    private javax.swing.JTextArea txt_content;
    private javax.swing.JTextField txt_topic;
    // End of variables declaration//GEN-END:variables
}
