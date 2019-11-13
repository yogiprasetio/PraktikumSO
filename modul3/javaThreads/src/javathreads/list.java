package javathreads;
import java.util.ArrayList;
/**
 *
 * @author yogi-06926
 */
public class list {
    ArrayList<data> daftar;
    
    list(){
        daftar=new ArrayList<>();
    }
    
    public void tambahData(String nama,int list){
        data baru=new data(nama,list);
        daftar.add(baru);
    }
      
    public ArrayList<data>getALL(){
        return daftar;
    }
}
