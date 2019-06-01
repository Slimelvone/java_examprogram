package miniproject;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicHTML;
public class frmshowexamadvance extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    String subjectname;
    private int subject_id;
    
    public frmshowexamadvance(String ssusername,String subjectname) {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_goaltruepercent = new javax.swing.JLabel();
        lb_goalcount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_subjectrank = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_myrank = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_mycount = new javax.swing.JLabel();
        lb_mypercent = new javax.swing.JLabel();
        lb_mychance = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_mystat = new javax.swing.JLabel();
        lb_sj1 = new javax.swing.JLabel();
        lb_sjexp1 = new javax.swing.JLabel();
        pcb_sjb1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        lb_examid.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examid.setText("examid");
        jPanel1.add(lb_examid);
        lb_examid.setBounds(430, 20, 60, 21);

        lb_examusername.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examusername.setText("examusername");
        jPanel1.add(lb_examusername);
        lb_examusername.setBounds(410, 50, 90, 21);

        lb_subjectname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectname.setText("วิชา");
        jPanel1.add(lb_subjectname);
        lb_subjectname.setBounds(100, 70, 270, 21);

        lb_examtopic.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examtopic.setText("หัวข้อ");
        jPanel1.add(lb_examtopic);
        lb_examtopic.setBounds(100, 100, 330, 21);

        lb_examcontent.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_examcontent.setText("เนิ้อหา");
        jPanel1.add(lb_examcontent);
        lb_examcontent.setBounds(50, 160, 450, 100);

        gp_ans.add(cb_ans1);
        cb_ans1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans1.setText("ตัวเลือกที่ 1");
        jPanel1.add(cb_ans1);
        cb_ans1.setBounds(80, 270, 400, 29);

        gp_ans.add(cb_ans2);
        cb_ans2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans2.setText("ตัวเลือกที่ 2");
        jPanel1.add(cb_ans2);
        cb_ans2.setBounds(80, 300, 400, 29);

        gp_ans.add(cb_ans3);
        cb_ans3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans3.setText("ตัวเลือกที่ 3");
        jPanel1.add(cb_ans3);
        cb_ans3.setBounds(80, 330, 390, 29);

        gp_ans.add(cb_ans4);
        cb_ans4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        cb_ans4.setText("ตัวเลือกที่ 4");
        jPanel1.add(cb_ans4);
        cb_ans4.setBounds(80, 360, 400, 29);

        btn_send.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        jPanel1.add(btn_send);
        btn_send.setBounds(203, 419, 90, 40);

        lb.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb.setText("jLabel1");
        jPanel1.add(lb);
        lb.setBounds(310, 430, 50, 21);

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel11.setText("วิชา");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 70, 40, 20);

        jLabel12.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel12.setText("รหัส");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 24, 50, 20);

        jLabel13.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel13.setText("ผู้ออกข้อสอบ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(320, 50, 80, 20);

        jLabel14.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel14.setText("เนื้อหา");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 130, 40, 20);

        jLabel15.setFont(new java.awt.Font("TH SarabunPSK", 1, 18)); // NOI18N
        jLabel15.setText("หัวข้อ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 100, 40, 20);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel1.setText("เงื่อนไขการเลือนระดับขั้นต่อไป");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 160, 24);

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel2.setText("จำนวนข้อสอบที่ต้องทำ :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 130, 21);

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel3.setText(" เปอร์เซนความถูกต้อง : ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 110, 130, 21);

        lb_goaltruepercent.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_goaltruepercent.setText("....");
        jPanel2.add(lb_goaltruepercent);
        lb_goaltruepercent.setBounds(180, 110, 80, 21);

        lb_goalcount.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_goalcount.setText("....");
        jPanel2.add(lb_goalcount);
        lb_goalcount.setBounds(180, 80, 80, 21);

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel4.setText("วิชา :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 50, 50, 21);

        lb_subjectrank.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank.setText("...");
        jPanel2.add(lb_subjectrank);
        lb_subjectrank.setBounds(80, 50, 230, 21);

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel5.setText("สถานะปัจจุบัน");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 170, 110, 24);

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel6.setText("ระดับที่ : ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 210, 60, 21);

        lb_myrank.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_myrank.setText("...");
        jPanel2.add(lb_myrank);
        lb_myrank.setBounds(190, 210, 90, 21);

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel7.setText("ข้อสอบที่เหลือ :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 270, 90, 21);

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel8.setText("เปอร์เซน ณ ปัจจุบัน :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 300, 110, 21);

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel9.setText("โอกาศที่เหลือ : ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 330, 90, 21);

        lb_mycount.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_mycount.setText("...");
        jPanel2.add(lb_mycount);
        lb_mycount.setBounds(190, 270, 70, 21);

        lb_mypercent.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_mypercent.setText("...");
        jPanel2.add(lb_mypercent);
        lb_mypercent.setBounds(190, 300, 70, 21);

        lb_mychance.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_mychance.setText("...");
        jPanel2.add(lb_mychance);
        lb_mychance.setBounds(190, 330, 70, 21);

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel10.setText("คะแนนสำหรับข้อนี้ :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 240, 120, 21);

        lb_mystat.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_mystat.setText("...");
        jPanel2.add(lb_mystat);
        lb_mystat.setBounds(190, 240, 40, 21);

        lb_sj1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj1.setText("วืชาที่ 1");
        jPanel2.add(lb_sj1);
        lb_sj1.setBounds(20, 440, 260, 21);

        lb_sjexp1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp1.setText("exp1");
        jPanel2.add(lb_sjexp1);
        lb_sjexp1.setBounds(240, 460, 50, 21);
        jPanel2.add(pcb_sjb1);
        pcb_sjb1.setBounds(20, 480, 270, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int ans;
    private int examid;
    private boolean visible_thisfrm;
    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed

        set ob_setrank = new setrank(sessionusername,subject_id);
        
        if(ans == 1 && cb_ans1.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setrank.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setrank.true_rank();
        }
        else if(ans == 2 && cb_ans2.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setrank.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setrank.true_rank();
        }
        else if(ans == 3 && cb_ans3.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setrank.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setrank.true_rank();
        }
        else if(ans == 4 && cb_ans4.isSelected()){
            JOptionPane.showMessageDialog(null,ob_setrank.updateexp_true(subject_id),"ตอบถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setrank.true_rank();
        }
        else{
            JOptionPane.showMessageDialog(null,ob_setrank.minusstat(),"ตอบไม่ถุกต้อง",JOptionPane.PLAIN_MESSAGE);
            ob_setrank.fales_rank();
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
        
        show_rankStatusNow();
        show_rankCondition();
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
    
    private int myrank;
    private int count_thisrank;
    private int true_thisrank;
    private int chance_thisrank;
    
    public void show_rankCondition(){
        int[] count = new int[31];
        count[1] = 10;
        count[2] = 20;
        count[3] = 30;
        count[4] = 40;
        count[5] = 50;
        count[6] = 60;
        count[7] = 70;
        count[8] = 80;
        count[9] = 90;
        count[10] = 100;
        count[11] = 110;
        count[12] = 120;
        count[13] = 130;
        count[14] = 140;
        count[15] = 150;
        count[16] = 160;
        count[17] = 170;
        count[18] = 180;
        count[19] = 190;
        count[20] = 200;
        count[21] = 210;
        count[22] = 220;
        count[23] = 230;
        count[24] = 240;
        count[25] = 250;
        count[26] = 260;
        count[27] = 270;
        count[28] = 280;
        count[29] = 290;
        count[30] = 300;

        int[] truepercent = new int[31];
        truepercent[1] = 65;
        truepercent[2] = 66;
        truepercent[3] = 67;
        truepercent[4] = 68;
        truepercent[5] = 69;
        truepercent[6] = 70;
        truepercent[7] = 71;
        truepercent[8] = 72;
        truepercent[9] = 73;
        truepercent[10] = 74;
        truepercent[11] = 75;
        truepercent[12] = 76;
        truepercent[13] = 77;
        truepercent[14] = 78;
        truepercent[15] = 79;
        truepercent[16] = 80;
        truepercent[17] = 81;
        truepercent[18] = 82;
        truepercent[19] = 83;
        truepercent[20] = 84;
        truepercent[21] = 85;
        truepercent[22] = 86;
        truepercent[23] = 87;
        truepercent[24] = 88;
        truepercent[25] = 89;
        truepercent[26] = 90;
        truepercent[27] = 91;
        truepercent[28] = 92;
        truepercent[29] = 93;
        truepercent[30] = 94;
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("Select rank from userrank where username = '"+sessionusername+"' "
                            + "and subject_id = '"+subject_id+"'")) {
                    ResultSet result = ps.executeQuery();
                    if(result.next())
                    myrank = (int)result.getInt("rank");
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        lb_subjectrank.setText(subjectname);
        lb_goalcount.setText(String.valueOf(count[myrank])+"  ข้อ");
        lb_goaltruepercent.setText(String.valueOf(truepercent[myrank])+"  %");
    }
    
    public void show_rankStatusNow(){
        int[] count = new int[31];
        count[1] = 10;
        count[2] = 20;
        count[3] = 30;
        count[4] = 40;
        count[5] = 50;
        count[6] = 60;
        count[7] = 70;
        count[8] = 80;
        count[9] = 90;
        count[10] = 100;
        count[11] = 110;
        count[12] = 120;
        count[13] = 130;
        count[14] = 140;
        count[15] = 150;
        count[16] = 160;
        count[17] = 170;
        count[18] = 180;
        count[19] = 190;
        count[20] = 200;
        count[21] = 210;
        count[22] = 220;
        count[23] = 230;
        count[24] = 240;
        count[25] = 250;
        count[26] = 260;
        count[27] = 270;
        count[28] = 280;
        count[29] = 290;
        count[30] = 300;

        int[] truepercent = new int[31];
        truepercent[1] = 65;
        truepercent[2] = 66;
        truepercent[3] = 67;
        truepercent[4] = 68;
        truepercent[5] = 69;
        truepercent[6] = 70;
        truepercent[7] = 71;
        truepercent[8] = 72;
        truepercent[9] = 73;
        truepercent[10] = 74;
        truepercent[11] = 75;
        truepercent[12] = 76;
        truepercent[13] = 77;
        truepercent[14] = 78;
        truepercent[15] = 79;
        truepercent[16] = 80;
        truepercent[17] = 81;
        truepercent[18] = 82;
        truepercent[19] = 83;
        truepercent[20] = 84;
        truepercent[21] = 85;
        truepercent[22] = 86;
        truepercent[23] = 87;
        truepercent[24] = 88;
        truepercent[25] = 89;
        truepercent[26] = 90;
        truepercent[27] = 91;
        truepercent[28] = 92;
        truepercent[29] = 93;
        truepercent[30] = 94;
        
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("Select * from userrank where username = '"+sessionusername+"' "
                            + "and subject_id = '"+subject_id+"'")) {
                    ResultSet result = ps.executeQuery();
                    if(result.next()){
                    myrank = (int)result.getInt("rank");
                    count_thisrank = (int)result.getInt("count_thisrank");
                    true_thisrank = (int)result.getInt("true_thisrank");
                    chance_thisrank = (int)result.getInt("chance_thisrank");
                    }
                    closeConnection();
                    }
        catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        setrank ob_setrank = new setrank(sessionusername,subject_id);
        
        processrank ob_rankname = new processrank();
        lb_myrank.setForeground(Color.decode(ob_rankname.setcolor(myrank)));
        lb_myrank.setText(ob_rankname.setrankname(myrank));
        lb_mycount.setText(String.valueOf(count[myrank]-count_thisrank)+ "  ข้อ");
        lb_mypercent.setText(String.valueOf(ob_setrank.true_percent_thisrank(count_thisrank , true_thisrank)) +"  %");
        lb_mychance.setText(String.valueOf(chance_thisrank));
        
        if(count_thisrank >= count[myrank] && ob_setrank.true_percent_thisrank(count_thisrank , true_thisrank) >= truepercent[myrank]){
            System.out.print("up");
            ob_setrank.up_rank();
            show_rankStatusNow();
        }
        else if(count_thisrank >= count[myrank] && ob_setrank.true_percent_thisrank(count_thisrank , true_thisrank) < truepercent[myrank]){
            System.out.print("down");
            ob_setrank.down_rank();
            show_rankStatusNow();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb_examcontent;
    private javax.swing.JLabel lb_examid;
    private javax.swing.JLabel lb_examtopic;
    private javax.swing.JLabel lb_examusername;
    private javax.swing.JLabel lb_goalcount;
    private javax.swing.JLabel lb_goaltruepercent;
    private javax.swing.JLabel lb_mychance;
    private javax.swing.JLabel lb_mycount;
    private javax.swing.JLabel lb_mypercent;
    private javax.swing.JLabel lb_myrank;
    private javax.swing.JLabel lb_mystat;
    private javax.swing.JLabel lb_sj1;
    private javax.swing.JLabel lb_sjexp1;
    private javax.swing.JLabel lb_subjectname;
    private javax.swing.JLabel lb_subjectrank;
    private javax.swing.JProgressBar pcb_sjb1;
    // End of variables declaration//GEN-END:variables
}
