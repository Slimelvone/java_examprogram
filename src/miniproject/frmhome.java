package miniproject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.*;

public class frmhome extends javax.swing.JFrame {
    String sessionusername;
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frmhome(String ssusername) {
        initComponents();
        this.sessionusername = ssusername;
        getbasicinfo();
        getexp();
        getrank();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_basicinfo = new javax.swing.JPanel();
        lb_username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_fname = new javax.swing.JLabel();
        lb_lname = new javax.swing.JLabel();
        lb_race = new javax.swing.JLabel();
        lb_nationality = new javax.swing.JLabel();
        lb_religion = new javax.swing.JLabel();
        lb_birthday = new javax.swing.JLabel();
        lb_phone = new javax.swing.JLabel();
        lb_email = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lb_address = new javax.swing.JLabel();
        lb_address1 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb_sj5 = new javax.swing.JLabel();
        lb_sjexp5 = new javax.swing.JLabel();
        lb_sj4 = new javax.swing.JLabel();
        lb_sjexp4 = new javax.swing.JLabel();
        lb_sjexp3 = new javax.swing.JLabel();
        lb_sj3 = new javax.swing.JLabel();
        lb_sj2 = new javax.swing.JLabel();
        lb_sjexp2 = new javax.swing.JLabel();
        lb_sjexp1 = new javax.swing.JLabel();
        lb_sj1 = new javax.swing.JLabel();
        pcb_sjb1 = new javax.swing.JProgressBar();
        pcb_sjb2 = new javax.swing.JProgressBar();
        pcb_sjb3 = new javax.swing.JProgressBar();
        pcb_sjb4 = new javax.swing.JProgressBar();
        pcb_sjb5 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        pn_menubar = new javax.swing.JPanel();
        btn_insertexam = new javax.swing.JButton();
        btn_option = new javax.swing.JButton();
        btn_selectsubject = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lb_subjectrank1 = new javax.swing.JLabel();
        lb_subjectrank2 = new javax.swing.JLabel();
        lb_subjectrank3 = new javax.swing.JLabel();
        lb_subjectrank4 = new javax.swing.JLabel();
        lb_subjectrank5 = new javax.swing.JLabel();
        lb_rank1 = new javax.swing.JLabel();
        lb_rank2 = new javax.swing.JLabel();
        lb_rank3 = new javax.swing.JLabel();
        lb_rank4 = new javax.swing.JLabel();
        lb_rank5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_basicinfo.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jp_basicinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_username.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_username.setText("ชื่อ  : ");
        jp_basicinfo.add(lb_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, -1));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel1.setText("วันเดือนปีเกิด : ");
        jp_basicinfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel2.setText("เชื่อชาติ : ");
        jp_basicinfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel3.setText("สัญชาติ : ");
        jp_basicinfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel4.setText("ศาสนา : ");
        jp_basicinfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, -1));

        lb_fname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_fname.setText("ชื่อ");
        jp_basicinfo.add(lb_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 40, -1));

        lb_lname.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_lname.setText("นาสกุล");
        jp_basicinfo.add(lb_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 60, -1));

        lb_race.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_race.setText("เชื่อชาติ");
        jp_basicinfo.add(lb_race, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 80, -1));

        lb_nationality.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_nationality.setText("สัญชาติ");
        jp_basicinfo.add(lb_nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, -1));

        lb_religion.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_religion.setText("ศาสนา");
        jp_basicinfo.add(lb_religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 80, -1));

        lb_birthday.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_birthday.setText("วันเดือนปีเกิด");
        jp_basicinfo.add(lb_birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 110, -1));

        lb_phone.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_phone.setText("เบอร์โทร");
        jp_basicinfo.add(lb_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 110, -1));

        lb_email.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_email.setText("Email");
        jp_basicinfo.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, -1));

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel6.setText("เบอร์โทร : ");
        jp_basicinfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jLabel7.setText("Email : ");
        jp_basicinfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel8.setText("ข้อมูลพื้นฐาน");
        jp_basicinfo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 31, -1, -1));

        lb_address.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_address.setText("ที่อยู่");
        jp_basicinfo.add(lb_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, -1));

        lb_address1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_address1.setText("ที่อยู่");
        jp_basicinfo.add(lb_address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, -1));

        btn_refresh.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jp_basicinfo.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, -1));

        btn_logout.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jp_basicinfo.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jPanel1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_sj5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj5.setText("วืชาที่ 5");
        jPanel1.add(lb_sj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 173, -1));

        lb_sjexp5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp5.setText("exp5");
        jPanel1.add(lb_sjexp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 80, -1));

        lb_sj4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj4.setText("วืชาที่ 4");
        jPanel1.add(lb_sj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 173, -1));

        lb_sjexp4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp4.setText("exp4");
        jPanel1.add(lb_sjexp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, -1));

        lb_sjexp3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp3.setText("exp3");
        jPanel1.add(lb_sjexp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, -1));

        lb_sj3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj3.setText("วืชาที่ 3");
        jPanel1.add(lb_sj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 173, -1));

        lb_sj2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj2.setText("วืชาที่ 2");
        jPanel1.add(lb_sj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 164, -1));

        lb_sjexp2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp2.setText("exp2");
        jPanel1.add(lb_sjexp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, -1));

        lb_sjexp1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sjexp1.setText("exp1");
        jPanel1.add(lb_sjexp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 80, -1));

        lb_sj1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_sj1.setText("วืชาที่ 1");
        jPanel1.add(lb_sj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 173, -1));
        jPanel1.add(pcb_sjb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, -1));
        jPanel1.add(pcb_sjb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 300, -1));
        jPanel1.add(pcb_sjb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 300, -1));
        jPanel1.add(pcb_sjb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 300, -1));
        jPanel1.add(pcb_sjb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 300, -1));

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel5.setText("ทักษะทั่วไป (Max Lv. 60)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        pn_menubar.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        pn_menubar.setLayout(null);

        btn_insertexam.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_insertexam.setText("เพิ่มข้อสอบ");
        btn_insertexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertexamActionPerformed(evt);
            }
        });
        pn_menubar.add(btn_insertexam);
        btn_insertexam.setBounds(20, 90, 190, 40);

        btn_option.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_option.setText("จัดการแบบทดสอบ");
        btn_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_optionActionPerformed(evt);
            }
        });
        pn_menubar.add(btn_option);
        btn_option.setBounds(20, 210, 190, 40);

        btn_selectsubject.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        btn_selectsubject.setText("ทำข้อสอบ");
        btn_selectsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectsubjectActionPerformed(evt);
            }
        });
        pn_menubar.add(btn_selectsubject);
        btn_selectsubject.setBounds(20, 150, 190, 40);

        jPanel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel9.setText("ระดับความชำนาญ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 40, 250, 24);

        lb_subjectrank1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank1.setText("rank วิชาที่ 1");
        jPanel2.add(lb_subjectrank1);
        lb_subjectrank1.setBounds(20, 100, 200, 21);

        lb_subjectrank2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank2.setText("rank วิชาที่ 1");
        jPanel2.add(lb_subjectrank2);
        lb_subjectrank2.setBounds(20, 140, 200, 21);

        lb_subjectrank3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank3.setText("rank วิชาที่ 1");
        jPanel2.add(lb_subjectrank3);
        lb_subjectrank3.setBounds(20, 180, 200, 21);

        lb_subjectrank4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank4.setText("rank วิชาที่ 1");
        jPanel2.add(lb_subjectrank4);
        lb_subjectrank4.setBounds(20, 220, 200, 21);

        lb_subjectrank5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_subjectrank5.setText("rank วิชาที่ 1");
        jPanel2.add(lb_subjectrank5);
        lb_subjectrank5.setBounds(20, 260, 200, 21);

        lb_rank1.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_rank1.setText("rank1");
        jPanel2.add(lb_rank1);
        lb_rank1.setBounds(230, 100, 80, 14);

        lb_rank2.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_rank2.setText("rank1");
        jPanel2.add(lb_rank2);
        lb_rank2.setBounds(230, 140, 80, 14);

        lb_rank3.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_rank3.setText("rank1");
        jPanel2.add(lb_rank3);
        lb_rank3.setBounds(230, 180, 80, 14);

        lb_rank4.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_rank4.setText("rank1");
        jPanel2.add(lb_rank4);
        lb_rank4.setBounds(230, 220, 80, 14);

        lb_rank5.setFont(new java.awt.Font("TH SarabunPSK", 0, 18)); // NOI18N
        lb_rank5.setText("rank1");
        jPanel2.add(lb_rank5);
        lb_rank5.setBounds(230, 260, 80, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pn_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_basicinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_basicinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(pn_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertexamActionPerformed
        frminsertexam insertexam = new frminsertexam(sessionusername);
        insertexam.setVisible(true);
    }//GEN-LAST:event_btn_insertexamActionPerformed

    private void btn_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_optionActionPerformed
        frmoptionmyexam ob_option = new frmoptionmyexam(sessionusername);
        ob_option.setVisible(true);
    }//GEN-LAST:event_btn_optionActionPerformed

    private void btn_selectsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectsubjectActionPerformed
        frmselectsubjectforshowexam ob_selectnubject = new frmselectsubjectforshowexam(sessionusername);
        ob_selectnubject.setVisible(true);
    }//GEN-LAST:event_btn_selectsubjectActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        getbasicinfo();
        getexp();
        getrank();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        this.dispose();
        frmlogin ob_login = new frmlogin();
        ob_login.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed
    public void getbasicinfo(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("Select * from userinfo where username = '"+sessionusername+"'")) {
                    ResultSet result = ps.executeQuery();
                    result.next();
                    closeConnection();
                        lb_fname.setText(result.getString("fname"));
                        lb_lname.setText(result.getString("lname"));
                        lb_birthday.setText(result.getString("birthday"));
                        lb_race.setText(result.getString("race"));
                        lb_nationality.setText(result.getString("nationality"));
                        lb_address.setText(result.getString("address"));
                        lb_phone.setText(result.getString("phone"));
                        lb_email.setText(result.getString("email"));
                        lb_religion.setText(result.getString("religion"));
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void getexp(){
        int i = 0;
        String[] sjbname = new String[6];
        int[] exp = new int[6];
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT subject.subject_name,skill.exp FROM skill,subject WHERE username = '"+sessionusername+"' and skill.subject_id = subject.subject_id ORDER BY exp DESC LIMIT 5;")) {
                    ResultSet getsubjectid = ps.executeQuery();
                    while (getsubjectid.next()) {
                        sjbname[i] = getsubjectid.getString(1);
                        exp[i] = getsubjectid.getInt(2);
                        i++;
                        }  
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        
        processlavel exp1 = new processlavel(exp[0]);
        processlavel exp2 = new processlavel(exp[1]);
        processlavel exp3 = new processlavel(exp[2]);
        processlavel exp4 = new processlavel(exp[3]);
        processlavel exp5 = new processlavel(exp[4]);
        
        
        
        pcb_sjb1.setValue(exp1.getpercent());
        pcb_sjb2.setValue(exp2.getpercent());
        pcb_sjb3.setValue(exp3.getpercent());
        pcb_sjb4.setValue(exp4.getpercent());
        pcb_sjb5.setValue(exp5.getpercent());
        
        pcb_sjb1.setStringPainted(true);
        pcb_sjb2.setStringPainted(true);
        pcb_sjb3.setStringPainted(true);
        pcb_sjb4.setStringPainted(true);
        pcb_sjb5.setStringPainted(true);
        
        lb_sjexp1.setText(String.valueOf("Lv. "+exp1.getlavel()));
        lb_sjexp2.setText(String.valueOf("Lv. "+exp2.getlavel()));
        lb_sjexp3.setText(String.valueOf("Lv. "+exp3.getlavel()));
        lb_sjexp4.setText(String.valueOf("Lv. "+exp4.getlavel()));
        lb_sjexp5.setText(String.valueOf("Lv. "+exp5.getlavel()));
        
        lb_sj1.setText(String.valueOf(sjbname[0]));
        lb_sj2.setText(String.valueOf(sjbname[1]));
        lb_sj3.setText(String.valueOf(sjbname[2]));
        lb_sj4.setText(String.valueOf(sjbname[3]));
        lb_sj5.setText(String.valueOf(sjbname[4]));
    }
    
    public void getrank(){
        int i = 0;
        String[] sjbname = new String[6];
        int[] rank = new int[6];
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("SELECT `subject`.`subject_name`, `userrank`.`rank` FROM `userrank`,`subject` WHERE`username` = '"+sessionusername+"' AND `userrank`.`subject_id` = `subject`.`subject_id` ORDER BY `rank` DESC LIMIT 5;")) {
                    ResultSet getsubjectid = ps.executeQuery();
                    while (getsubjectid.next()) {
                        sjbname[i] = getsubjectid.getString("subject_name");
                        rank[i] = getsubjectid.getInt("rank");
                        i++;
                        }  
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        
        lb_subjectrank1.setText(sjbname[0]);
        lb_subjectrank2.setText(sjbname[1]);
        lb_subjectrank3.setText(sjbname[2]);
        lb_subjectrank4.setText(sjbname[3]);
        lb_subjectrank5.setText(sjbname[4]);
        
        processrank ob_rankname = new processrank();
        
        lb_rank1.setForeground(Color.decode(setcolor(rank[0])));
        lb_rank2.setForeground(Color.decode(setcolor(rank[1])));
        lb_rank3.setForeground(Color.decode(setcolor(rank[2])));
        lb_rank4.setForeground(Color.decode(setcolor(rank[3])));
        lb_rank5.setForeground(Color.decode(setcolor(rank[4])));
        
        
        lb_rank1.setText(ob_rankname.setrankname(rank[0]));
        lb_rank2.setText(ob_rankname.setrankname(rank[1]));
        lb_rank3.setText(ob_rankname.setrankname(rank[2]));
        lb_rank4.setText(ob_rankname.setrankname(rank[3]));
        lb_rank5.setText(ob_rankname.setrankname(rank[4]));
    }
    public void re(){
        getbasicinfo();
        getexp();
        getrank();
    }
    
    String color;
    public String setcolor(int rank){
        if(rank <= 5 ){
            color = "#000000";
        }
        else if (rank <= 10){
            color = "#008000";
        }
        else if (rank <= 15){
            color = "#000099";
        }
        else if (rank <= 20){
            color = "#ff6600";
        }
        else if (rank <= 25){
            color = "#cc0000";
        }
        else {
            color = "#800080";
        }
        return color;
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
    private javax.swing.JButton btn_insertexam;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_option;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_selectsubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jp_basicinfo;
    private javax.swing.JLabel lb_address;
    private javax.swing.JLabel lb_address1;
    private javax.swing.JLabel lb_birthday;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_fname;
    private javax.swing.JLabel lb_lname;
    private javax.swing.JLabel lb_nationality;
    private javax.swing.JLabel lb_phone;
    private javax.swing.JLabel lb_race;
    private javax.swing.JLabel lb_rank1;
    private javax.swing.JLabel lb_rank2;
    private javax.swing.JLabel lb_rank3;
    private javax.swing.JLabel lb_rank4;
    private javax.swing.JLabel lb_rank5;
    private javax.swing.JLabel lb_religion;
    private javax.swing.JLabel lb_sj1;
    private javax.swing.JLabel lb_sj2;
    private javax.swing.JLabel lb_sj3;
    private javax.swing.JLabel lb_sj4;
    private javax.swing.JLabel lb_sj5;
    private javax.swing.JLabel lb_sjexp1;
    private javax.swing.JLabel lb_sjexp2;
    private javax.swing.JLabel lb_sjexp3;
    private javax.swing.JLabel lb_sjexp4;
    private javax.swing.JLabel lb_sjexp5;
    private javax.swing.JLabel lb_subjectrank1;
    private javax.swing.JLabel lb_subjectrank2;
    private javax.swing.JLabel lb_subjectrank3;
    private javax.swing.JLabel lb_subjectrank4;
    private javax.swing.JLabel lb_subjectrank5;
    private javax.swing.JLabel lb_username;
    private javax.swing.JProgressBar pcb_sjb1;
    private javax.swing.JProgressBar pcb_sjb2;
    private javax.swing.JProgressBar pcb_sjb3;
    private javax.swing.JProgressBar pcb_sjb4;
    private javax.swing.JProgressBar pcb_sjb5;
    private javax.swing.JPanel pn_menubar;
    // End of variables declaration//GEN-END:variables
}
