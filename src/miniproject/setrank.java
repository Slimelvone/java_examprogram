package miniproject;
import java.sql.*;
public class setrank extends setexp{
    
    setrank(String ssusername,int sjbid){
        this.sessionusername = ssusername;
        this.subject_id = sjbid;
    }
    setrank(){
    }
    
    @Override
    public void true_rank(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update userrank set count_all = count_all + '1' , count_thisrank = count_thisrank + '1' ,true_all = true_all + '1' , true_thisrank =  true_thisrank + '1' "
                            + "where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void fales_rank(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update userrank set count_all = count_all + '1' , count_thisrank = count_thisrank + '1'"
                            + "where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
            }
    }
    public void up_rank(){
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("update userrank set rank = rank + '1' , count_thisrank = '0' , true_thisrank = '0' ,  chance_thisrank = '2'"
                            + "where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'")) {
                    int record = ps.executeUpdate();
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
        }
    }

    public void down_rank(){
        
        try (
                    Connection connect = DriverManager.getConnection(server,userserver,passwordserver);
                    PreparedStatement ps = connect.prepareStatement("select * from userrank where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'")) {
                    ResultSet result = ps.executeQuery();
                    if(result.next()){
                        if(result.getInt("rank") > 1 && result.getInt("chance_thisrank") > 1){
                            //chance_thisrank - 1
                            System.out.print("1111");
                            query = "update userrank set chance_thisrank = chance_thisrank - '1' , count_thisrank = '0' , true_thisrank = '0' where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'";
                        }
                        else if(result.getInt("rank") > 1 && result.getInt("chance_thisrank") < 1){
                            System.out.print("2222");
                            query = "update userrank set rank = rank - '1' , chance_thisrank = '2',count_thisrank = '0' , true_thisrank = '0' where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'";
                        
                        }
                        else if (result.getInt("rank") <= 1){
                            query = "update userrank set rank = '1' , chance_thisrank = '2', count_thisrank = '0' , true_thisrank = '0' where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'";
                        }
                        else{
                            //rank = 1 chance_thisrank = 0
                            query = "update userrank set rank = rank - '1' , chance_thisrank = '1', count_thisrank = '0' , true_thisrank = '0' where username = '"+sessionusername+"' and subject_id = '"+subject_id+"'";
                        }
                    }
                    closeConnection();
                    }
            catch (SQLException ex){
                    System.err.println("Message: "+ ex.getMessage());
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
    
    public int true_percent_thisrank(int count , int count_true){
        if(count != 0){
        mypercent_thisrank = (count_true * 100)/ count;
        }
        return mypercent_thisrank;
    }
}

