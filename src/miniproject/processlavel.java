package miniproject;
public class processlavel {
    int pc_yourlavel;
    int pc_distance;
    int pc_expuperlavel;
    int pc_exp;
    double pc_yourpercent;
    
    processlavel(int exp){
        lavel(exp);
    }
    
    public void lavel(int getexp){
        int[] lavel = new int[61];
        lavel[0] = 0;
        lavel[1] = 25;
        lavel[2] = 45;
        lavel[3] = 76;
        lavel[4] = 115;
        lavel[5] = 164;
        lavel[6] = 225;
        lavel[7] = 301;
        lavel[8] = 397;
        lavel[9] = 516;
        lavel[10] = 665;
        lavel[11] = 844;
        lavel[12] = 1066;
        lavel[13] = 1341;
        lavel[14] = 1681;
        lavel[15] = 2104;
        lavel[16] = 2628;
        lavel[17] = 3278;
        lavel[18] = 4085;
        lavel[19] = 5084;
        lavel[20] = 6323;
        lavel[21] = 7796;
        lavel[22] = 9608;
        lavel[23] = 11836;
        lavel[24] = 14576;
        lavel[25] = 17947;
        lavel[26] = 22094;
        lavel[27] = 27194;
        lavel[28] = 33467;
        lavel[29] = 41182;
        lavel[30] = 50673;
        lavel[31] = 61838;
        lavel[32] = 75460;
        lavel[33] = 92079;
        lavel[34] = 112354;
        lavel[35] = 137089;
        lavel[36] = 167267;
        lavel[37] = 204083;
        lavel[38] = 248999;
        lavel[39] = 303796;
        lavel[40] = 370649;
        lavel[41] = 448502;
        lavel[42] = 542704;
        lavel[43] = 656689;
        lavel[44] = 794610;
        lavel[45] = 961495;
        lavel[46] = 1163426;
        lavel[47] = 1407762;
        lavel[48] = 1703409;
        lavel[49] = 2061142;
        lavel[50] = 2493998;
        lavel[51] = 3017755;
        lavel[52] = 3651500;
        lavel[53] = 4418332;
        lavel[54] = 5346198;
        lavel[55] = 6468917;
        lavel[56] = 7827406;
        lavel[57] = 9471178;
        lavel[58] = 11460143;
        lavel[59] = 13866789;
        lavel[60] = 16778832;
        pc_exp = getexp;
        for(int i = 0; i <= 60 ; i++){
            if(pc_exp > lavel[i])
            {
                pc_yourlavel = i;
                pc_distance = lavel[i+1] - lavel[i];
                pc_expuperlavel = lavel[i+1];
            }
        }
        pc_yourpercent = percent(pc_exp,pc_distance,pc_expuperlavel);
        setlavel(pc_yourlavel);
        setpercent(pc_yourpercent);
    }
    private int sh_lv;
    private int sh_percent;
    
    public void setpercent(double getpercent){
        
        this.sh_percent = (int)getpercent;
    }
    public int getpercent(){
        return sh_percent;
    }
    public void setlavel(int getlavel){
        this.sh_lv = getlavel;
    }
    public int getlavel(){
        return sh_lv;
    }
    public double percent(int exp ,int distance, int expuperlavel){
        double percent;
        percent = expuperlavel - exp;
        percent = 100 - (percent * 100) / distance;
        return percent;
    }
    
}
