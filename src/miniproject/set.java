package miniproject;
import java.sql.*;
import javax.swing.JOptionPane;
public class set extends javax.swing.JFrame{ // Supper class
    String sessionusername;
    String server = "jdbc:mysql://localhost:3306/examdb?useUnicode=true&characterEncoding=UTF-8";
    String userserver = "root";
    String passwordserver = "12345678";
    Connection connection;
    
    int subject_id;
    int stat;
    int mypercent_thisrank;
    int count_thisrank;
    int true_thisrank;
    int chance_thisrank;
    int myrank;
    
    String status;
    String statusplus;
    String query;
    String subjectname;
    

    set(String ssusername,int sjbid){
        this.sessionusername = ssusername;
        this.subject_id = sjbid;
    }
    set(String ssusername){
        this.sessionusername = ssusername;
    }
    set(){
    }
    
    // methos selection 
    // Polymorphism
    public String selectsubjectname(int subject_id){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select subject_name from subject where subject_id = '"+subject_id+"'")) {
                    ResultSet getmystat = ps.executeQuery();
                    getmystat.next(); 
                        subjectname = getmystat.getString("subject_name");
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return subjectname;
    }
    
    public int selectstat(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select exam_stat from userinfo where username = '"+sessionusername+"'")) {
                    ResultSet getmystat = ps.executeQuery();
                    getmystat.next(); 
                        stat = getmystat.getInt("exam_stat");
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return stat;
    }
    // จัดการ table exam_Log
    public void puttoexamlog(int examid, boolean hasrow){
       if (hasrow){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("insert into exam_log(exam_id, username) values('"+examid+"' , '"+sessionusername+"');")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        }
    }
    // จัดการ percent การโดนลบของแบบทดสอบ ของ หน้า admin
    public void setexam_input(int exam_id,int status){
        if(status == 1){
            query = "update exam_input set count = count + 1 , this_true = this_true + 1 where exam_id = '"+exam_id+"'";
        }
        else{
            query = "update exam_input set count = count + 1  where exam_id = '"+exam_id+"'";
        }
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement(query)) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    
    // close_connection
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
    
    // Polymorphism Override
    
    // @Override setexp
    public String updateexp_true(int subjectid){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
        return status;
    }
    public String minusstat(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
        return status;
    }
    public String plusstat(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
        return statusplus;
    }
    // @Override rank
    public void true_rank(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
    }
    public void fales_rank(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
    }
    public void up_rank(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
    }
    public void down_rank(){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
    }
    public int true_percent_thisrank(int count , int count_true){
        JOptionPane.showMessageDialog(null,"ระบบขัดข้องกรุณาลองใหม่อีกครั้งภายหลัง","ผิดพลาด",JOptionPane.WARNING_MESSAGE);
        return mypercent_thisrank;
    }
    
}

