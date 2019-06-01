package miniproject;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicHTML;
public class frmshowexamnormal extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    String subjectname;
    public frmshowexamnormal(String ssusername,String subjectname) {
        initComponents();
        this.sessionusername = ssusername;
        this.subjectname = subjectname;
        randomexam();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gp_ans = new javax.swing.ButtonGroup();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        lb_examid = new javax.swing.JLabel();
        lb_examusername = new javax.swing.JLabel();
        lb_subjectname = new javax.swing.JLabel();
        lb_examtopic = new javax.swing.JLabel();
        lb_examcontent = new javax.swing.JLabel();
        cb_ans1 = new javax.swing.JCheckBox();
        cb_ans2 = new javax.swing.JCheckBox();
        cb_ans3 = new javax.swing.JCheckBox();
        cb_ans4 = new javax.swing.JCheckBox();
        btn_send = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lb_mystat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_sj1 = new javax.swing.JLabel();
        pcb_sjb1 = new javax.swing.JProgressBar();
        lb_sjexp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        lb_examid.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examid.setText("examid");
        jPanel1.add(lb_examid);
        lb_examid.setBounds(440, 20, 60, 21);

        lb_examusername.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examusername.setText("examusername");
        jPanel1.add(lb_examusername);
        lb_examusername.setBounds(430, 50, 90, 21);

        lb_subjectname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectname.setText("วิชา");
        jPanel1.add(lb_subjectname);
        lb_subjectname.setBounds(80, 70, 270, 21);

        lb_examtopic.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examtopic.setText("หัวข้อ");
        jPanel1.add(lb_examtopic);
        lb_examtopic.setBounds(80, 100, 330, 21);

        lb_examcontent.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examcontent.setText("เนิ้อหา");
        jPanel1.add(lb_examcontent);
        lb_examcontent.setBounds(50, 140, 450, 120);

        gp_ans.add(cb_ans1);
        cb_ans1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans1.setText("ตัวเลือกที่ 1");
        jPanel1.add(cb_ans1);
        cb_ans1.setBounds(80, 270, 410, 29);

        gp_ans.add(cb_ans2);
        cb_ans2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans2.setText("ตัวเลือกที่ 2");
        jPanel1.add(cb_ans2);
        cb_ans2.setBounds(80, 300, 420, 29);

        gp_ans.add(cb_ans3);
        cb_ans3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans3.setText("ตัวเลือกที่ 3");
        jPanel1.add(cb_ans3);
        cb_ans3.setBounds(80, 330, 420, 29);

        gp_ans.add(cb_ans4);
        cb_ans4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans4.setText("ตัวเลือกที่ 4");
        jPanel1.add(cb_ans4);
        cb_ans4.setBounds(80, 360, 420, 29);

        btn_send.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        jPanel1.add(btn_send);
        btn_send.setBounds(220, 430, 100, 40);

        lb.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb.setText("jLabel1");
        jPanel1.add(lb);
        lb.setBounds(340, 440, 40, 21);

        jLabel12.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel12.setText("รหัส");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(370, 20, 50, 20);

        jLabel13.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel13.setText("ผู้ออกข้อสอบ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(330, 50, 80, 20);

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel11.setText("วิชา");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 70, 40, 20);

        jLabel15.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel15.setText("หัวข้อ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 100, 40, 20);

        jLabel14.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel14.setText("เนื้อหา");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 130, 40, 20);

        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel10.setText("คะแนนสำหรับข้อนี้ :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 170, 120, 21);

        lb_mystat.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_mystat.setText("...");
        jPanel2.add(lb_mystat);
        lb_mystat.setBounds(180, 170, 40, 21);

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel5.setText("สถานะปัจจุบัน");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 130, 110, 21);

        lb_sj1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj1.setText("วิชาที่ 1");
        jPanel2.add(lb_sj1);
        lb_sj1.setBounds(20, 260, 260, 21);
        jPanel2.add(pcb_sjb1);
        pcb_sjb1.setBounds(20, 300, 260, 20);

        lb_sjexp1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp1.setText("exp1");
        jPanel2.add(lb_sjexp1);
        lb_sjexp1.setBounds(230, 280, 50, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int ans;
    private int subject_id;
    private int examid;
    private boolean visible_thisfrm;
    
    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        set ob_setexp = new setexp(sessionusername);
        
        if(ans == 1 && cb_ans1.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setexp.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setexp.setexam_input(examid, 1);
        }
        else if(ans == 2 && cb_ans2.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setexp.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setexp.setexam_input(examid, 1); 
        }
        else if(ans == 3 && cb_ans3.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setexp.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setexp.setexam_input(examid, 1);
            
        }
        else if(ans == 4 && cb_ans4.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setexp.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setexp.setexam_input(examid, 1);
        }
        else{
            JOptionPane.showMessageDialog(null,ob_setexp.minusstat(),"ตอบไม่ถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setexp.setexam_input(examid, 0);
        }
        randomexam();
        
        if(!get_check_row_exam()){
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_sendActionPerformed

    public void randomexam(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT * FROM exam_input,subject,userinfo "
                            + "where subject.subject_id = exam_input.exam_subject_id "
                            + "and userinfo.username = exam_input.exam_username "
                            + "and exam_input.exam_username != '"+sessionusername+"'"
                            + "and exam_input.exam_subject_id in(select subject_id from skill where username = '"+sessionusername+"') "
                            + "and exam_input.exam_id not in(select exam_id from exam_log where username = '"+sessionusername+"') "
                            + "and exam_input.exam_subject_id = (select subject_id from subject where subject_name = '"+subjectname+"')"
                            + "ORDER BY RAND() LIMIT 1;")) {
                    ResultSet result = ps.executeQuery();
                    if (result.next()){
                    examid = result.getInt("exam_id");
                    lb_examid.setText(String.valueOf(examid));
                    lb_examusername.setText(result.getString("fname"));
                    lb_subjectname.setText(result.getString("subject_name"));
                    lb_examtopic.setText(result.getString("exam_topic"));
                    lb_examcontent.setText(result.getString("exam_content"));
                    cb_ans1.setText(result.getString("exam_choice1"));
                    cb_ans2.setText(result.getString("exam_choice2"));
                    cb_ans3.setText(result.getString("exam_choice3"));
                    cb_ans4.setText(result.getString("exam_choice4"));
                    ans = result.getInt("exam_ans");
                    subject_id = result.getInt("exam_subject_id");
                    lb.setText(String.valueOf(ans));
                    selectmystat();
                    closeConnection();
                    set_check_row_exam(true);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"ยังไม่มีแบบทดสอบ ของ วิชา "+subjectname+" ณ ขณะนี้ กรุณาลองวิชาอื่น","ไม่มีข้อมูล",JOptionPane.PLAIN_MESSAGE);
                        set_check_row_exam(false);
                        frmselectsubjectforshowexam newload = new frmselectsubjectforshowexam(sessionusername);
                        newload.setVisible(true);
                    }
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        set ob_setlog = new set(sessionusername);
        ob_setlog.puttoexamlog(examid,get_check_row_exam());
        load_getexp();
    }
    
    public void set_check_row_exam(boolean visible){
        visible_thisfrm = visible;
    }
    public boolean get_check_row_exam(){
        return visible_thisfrm;
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
    int exp;
    public void load_getexp(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select exp from skill where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'")) {
                    ResultSet getsubjectid = ps.executeQuery();
                    getsubjectid.next();
                        exp = getsubjectid.getInt("exp"); 
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        
        processlavel exp1 = new processlavel(exp);
        pcb_sjb1.setValue(exp1.getpercent());
        pcb_sjb1.setStringPainted(true);
        lb_sjexp1.setText(String.valueOf("Lv. "+exp1.getlavel()));
        lb_sj1.setText(String.valueOf(subjectname));
    }
    public void selectmystat(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select exam_stat from userinfo where username = '"+sessionusername+"'")) {
                    ResultSet getstat = ps.executeQuery();
                    getstat.next();
                        lb_mystat.setText(String.valueOf(getstat.getInt("exam_stat")));
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_send;
    private javax.swing.JCheckBox cb_ans1;
    private javax.swing.JCheckBox cb_ans2;
    private javax.swing.JCheckBox cb_ans3;
    private javax.swing.JCheckBox cb_ans4;
    private javax.swing.ButtonGroup gp_ans;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb_examcontent;
    private javax.swing.JLabel lb_examid;
    private javax.swing.JLabel lb_examtopic;
    private javax.swing.JLabel lb_examusername;
    private javax.swing.JLabel lb_mystat;
    private javax.swing.JLabel lb_sj1;
    private javax.swing.JLabel lb_sjexp1;
    private javax.swing.JLabel lb_subjectname;
    private javax.swing.JProgressBar pcb_sjb1;
    // End of variables declaration//GEN-END:variables
}
