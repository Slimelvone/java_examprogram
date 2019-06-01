package miniproject;

import java.sql.*;
public class setexp extends set{
    
    setexp(String ssusername){
        this.sessionusername = ssusername;
    }
    setexp(){   
    }
    
    @Override
    public String updateexp_true(int subjectid){
        int mystat = selectstat();
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update skill set exp = exp + '"+mystat+"' where username = '"+sessionusername+"' and subject_id = '"+subjectid+"'")) {
                    int record = ps.executeUpdate();
                    if(record > 0){
                        status = "<html><body><p>คุณตอบถูกต้อง<br> เราทำการเพื่ม "+ mystat +" คะแนน <br>ให้กับทักษะของวิชา"+selectsubjectname(subjectid)+" เรียบร้อยแล้ว<br>"+plusstat()+"</p></body></html>";
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return status;
    }
    
    public String minusstat(){
        int mystat = selectstat();
        int minus;
        if(mystat <= 0){
            minus = 0 ;
        }
        else if(mystat == 1){
            minus = 1 ;
        }
        else{
            minus = 2 ;
        }
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update userinfo set exam_stat = exam_stat - '"+minus+"' where username = '"+sessionusername+"'")) {
                    int record = ps.executeUpdate();
                    if(record > 0){
                        mystat = mystat - minus;
                        status = "<html>Stat คุณโดนลบ<br>คะแนนสำหรับการตอบถูกข้อต้อไปคือ <html>" + mystat;
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return status;
    }
    
    public String plusstat(){
        int mystat = selectstat();
        int plus;
        
        if(mystat >= 20){
            plus = 0 ;
        }
        else{
            plus = 1 ;
        }
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update userinfo set exam_stat = exam_stat + '"+plus+"' where username = '"+sessionusername+"'")) {
                    int record = ps.executeUpdate();
                    if(record > 0){
                        mystat = mystat + plus;
                        statusplus = "<html>Stat คุณได้เพิ่ม<br>คะแนนสำหรับการตอบถูกข้อต้อไปคือ <html>" + mystat;
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
        return statusplus;
    }
    
}
