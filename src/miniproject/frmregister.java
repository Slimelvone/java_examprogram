package miniproject;

import java.sql.*;
import javax.swing.JOptionPane;

public class frmregister extends javax.swing.JFrame {
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frmregister() {
        initComponents();
    }
    public void register(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement skill = connect.prepareStatement("INSERT INTO `userinfo` (`username`, `password`, `fname`, `lname`, `birthday`, `race`, `nationality`, `religion`, `address`, `phone`, `email`, `exam_stat`)"
                            + " VALUES ('"+txt_username.getText()+"', '"+txt_password.getText()+"', '"+txt_fname.getText()+"', '"+txt_lname.getText()+"', '"+txt_birthday.getText()+"', '"+txt_race.getText()+"', '"+txt_nationality.getText()+"', '"+txt_religion.getText()+"', '"+txt_address.getText()+"', '"+txt_phone.getText()+"', '"+txt_email.getText()+"' , '0'); ")) {
                    int record = skill.executeUpdate();
                    if(record > 0){
                        JOptionPane.showMessageDialog(null,"ลงทะเบียนเรียบร้อยแล้ว","สำเร็จ",JOptionPane.PLAIN_MESSAGE);
                        this.dispose();
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null,"กรุณาใส่วันเกิดให้ถูกต้อง","ผิดพลาด",JOptionPane.PLAIN_MESSAGE);    
            }
    }
    boolean bl_cheackusername;
    public boolean cheackusername(String ch_username){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT username from userinfo where username = '"+ch_username+"'")) {
                    ResultSet result = ps.executeQuery();
                    if(result.next()){
                        bl_cheackusername = true;
                    }
                    else{
                        bl_cheackusername = false;
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return bl_cheackusername;
    }
    public void closeConnection() {
                   if(connection != null)
                    try    {
                        connection.close();
                        connection = null;
                    }
                    catch (SQLException ex)    {
                        System.err.println("Message: "+ ex.getMessage());
                    }
           }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_birthday = new javax.swing.JTextField();
        txt_race = new javax.swing.JTextField();
        txt_nationality = new javax.swing.JTextField();
        txt_religion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        txt_phone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_sumit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        txt_username.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_username);
        txt_username.setBounds(180, 30, 340, 30);

        txt_fname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_fname);
        txt_fname.setBounds(180, 140, 340, 30);

        txt_lname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_lname);
        txt_lname.setBounds(180, 190, 340, 30);

        txt_birthday.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_birthday);
        txt_birthday.setBounds(180, 230, 190, 30);

        txt_race.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_race);
        txt_race.setBounds(180, 270, 340, 30);

        txt_nationality.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_nationality);
        txt_nationality.setBounds(180, 310, 340, 30);

        txt_religion.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_religion);
        txt_religion.setBounds(180, 360, 340, 30);

        txt_address.setColumns(20);
        txt_address.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        txt_address.setRows(5);
        jScrollPane1.setViewportView(txt_address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 400, 350, 110);

        txt_phone.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_phone);
        txt_phone.setBounds(180, 520, 340, 30);

        txt_email.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.add(txt_email);
        txt_email.setBounds(180, 560, 340, 30);

        btn_sumit.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_sumit.setText("ลงทะเบียน");
        btn_sumit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sumit);
        btn_sumit.setBounds(200, 610, 190, 50);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel1.setText("ปี ค.ศ. - เดือน - วัน");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 240, 110, 21);

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel2.setText("Username : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 30, 110, 21);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel3.setText("Password : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 80, 110, 21);

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel4.setText("ชื่อ : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 140, 110, 21);

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel5.setText("นามสกุล : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 190, 110, 21);

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel6.setText("Email :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 560, 110, 21);

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel7.setText("วันเกิด : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 230, 110, 21);

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel8.setText("เซื้อชาติ :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 270, 110, 21);

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel9.setText("สัญชาติ :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 310, 110, 21);

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel10.setText("ศาสนา :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 360, 110, 21);

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel11.setText("ที่อยู่ :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 400, 110, 21);

        jLabel12.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel12.setText("เบอร์โทรศัพท์ :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 520, 110, 21);
        jPanel1.add(txt_password);
        txt_password.setBounds(180, 80, 340, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sumitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumitActionPerformed

            if(txt_username.getText().equals("") || txt_password.getText().equals("") || txt_fname.getText().equals("") || txt_lname.getText().equals("") || txt_birthday.getText().equals("") || txt_race.getText().equals("") || txt_nationality.getText().equals("") || txt_religion.getText().equals("") || txt_address.getText().equals("") || txt_phone.getText().equals("") || txt_email.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"กรุณากรอกข้อมูลให้ครบ","ผิดพลาด",JOptionPane.PLAIN_MESSAGE);
            }
            else if(cheackusername(txt_username.getText())){
                JOptionPane.showMessageDialog(null,"Username นี้มีอยู่แล้วกรุณาเปลี่ยน","ผิดพลาด",JOptionPane.PLAIN_MESSAGE);
            }
            else{
                register();
            }
    }//GEN-LAST:event_btn_sumitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sumit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_nationality;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_race;
    private javax.swing.JTextField txt_religion;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
