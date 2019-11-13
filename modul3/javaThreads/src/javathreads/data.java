package javathreads;
//import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class data {
//    ArrayList<String> namas;
    private String jeneng;
    private int urut;
//    data(){
//        namas=new ArrayList<>();
//    }
    
    data(String nama,int list){
        this.jeneng=nama;
        this.urut=list;
//        namas.add(jeneng);
    }
    
    public String getJeneng(){
        return jeneng;
    }
    
    
//    public ArrayList<String>getALL(){
//        return namas;
//    }

    public int getUrut() {
        return urut;
    }
}
