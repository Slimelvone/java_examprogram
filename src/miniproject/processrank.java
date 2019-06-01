package miniproject;

import java.sql.*;
public class processrank{
    public String setrankname(int numrank){
        String[] rankmname = new String[31];
        rankmname[1] = "มือใหม่ 1";
        rankmname[2] = "มือใหม่ 2"; 
        rankmname[3] = "มือใหม่ 3"; 
        rankmname[4] = "มือใหม่ 4"; 
        rankmname[5] = "มือใหม่ 5"; 
        rankmname[6] = "ฝึกฝน 1"; 
        rankmname[7] = "ฝึกฝน 2"; 
        rankmname[8] = "ฝึกฝน 3"; 
        rankmname[9] = "ฝึกฝน 4"; 
        rankmname[10] = "ฝึกฝน 5"; 
        rankmname[11] = "คล่องแคล่าว 1"; 
        rankmname[12] = "คล่องแคล่าว 2"; 
        rankmname[13] = "คล่องแคล่าว 3"; 
        rankmname[14] = "คล่องแคล่าว 4"; 
        rankmname[15] = "คล่องแคล่าว 5"; 
        rankmname[16] = "เชียวชาญ 1"; 
        rankmname[17] = "เชียวชาญ 2"; 
        rankmname[18] = "เชียวชาญ 3"; 
        rankmname[19] = "เชียวชาญ 4"; 
        rankmname[20] = "เชียวชาญ 5"; 
        rankmname[21] = "ช่าง 1"; 
        rankmname[22] = "ช่าง 2"; 
        rankmname[23] = "ช่าง 3"; 
        rankmname[24] = "ช่าง 4"; 
        rankmname[25] = "ช่าง 5"; 
        rankmname[26] = "ลือชื่อ 1"; 
        rankmname[27] = "ลือชื่อ 2"; 
        rankmname[28] = "ลือชื่อ 3"; 
        rankmname[29] = "ลือชื่อ 4"; 
        rankmname[30] = "ลือชื่อ 5";
        
        return rankmname[numrank];
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
}
