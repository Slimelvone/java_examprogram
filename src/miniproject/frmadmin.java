
package miniproject;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
public class frmadmin extends javax.swing.JFrame{
    config con = new config();
    String server = con.server;
    String userserver = con.userserver;
    String passwordserver = con.passwordserver;
    Connection connection;
    public frmadmin(){
        initComponents();
        control_frm();
        //select_for_deleteexam();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adminstatus = new javax.swing.JTextArea();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txt_adminstatus.setColumns(20);
        txt_adminstatus.setRows(5);
        jScrollPane1.setViewportView(txt_adminstatus);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 520, 310);

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear);
        btn_clear.setBounds(450, 330, 73, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_adminstatus.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed
    public void select_for_deleteexam(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select * from exam_input, subject where this_true != 0 and count != 0 and count > 100 and exam_input.exam_subject_id = subject.subject_id")) {
                    ResultSet result = ps.executeQuery();
                    while(result.next()){
                        int exam_true = (int)result.getInt("this_true");
                        int count = (int)result.getInt("count");
                        double percent;
                        percent = exam_true * 100 / count;
                        if(percent > 70 || percent < 10){
                            System.out.print(String.valueOf(result.getInt("exam_id")));
                            txt_adminstatus.setText(txt_adminstatus.getText() +"รหัสข้อสอบ "+ String.valueOf(result.getInt("exam_id")) +"  ,  "+ result.getString("subject_name") +"  ,  "+ result.getString("exam_username") 
                                    +"  ,  "+ percent +" % .... Delete successfully ...... \n");
                        deleteexam(result.getInt("exam_id") , result.getInt("exam_subject_id") , result.getString("exam_username"));   
                        }
                        
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void deleteexam(int examid, int subject_id, String username){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("delete from exam_input where exam_id = '"+examid+"'")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update skill set exp = exp - 30 where username = '"+username+"' and subject_id = '"+subject_id+"'")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
        }
    }
    public void control_frm(){
        Timer timer = new Timer();
        TimerTask ob_Helper = new clock();
        timer.schedule(ob_Helper, 1000, 10000); 
        
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
class clock extends TimerTask{
    public void run(){
        select_for_deleteexam();
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_adminstatus;
    // End of variables declaration//GEN-END:variables
}

