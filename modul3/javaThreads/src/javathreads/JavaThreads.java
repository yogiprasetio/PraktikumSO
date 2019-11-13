package javathreads;
import java.util.Scanner;

public class JavaThreads {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        list ls=new list();
        Thread chrot;
        String nama;
        int list;
        char ljt='Y';
        int id=0;
        do{
        System.out.println("===================== Program nyoba Threads iki ================");
        System.out.println("menu : ");
        System.out.println("1. Nekat coba");
        System.out.println("2. jalankan");
            System.out.println("3. keluar");
        System.out.println("================================================================");
        System.out.print("pilihan : ");
        id=in.nextInt();
        if(id==1){
            System.out.print("Masukkan nama teman/kerabat/siapapun : ");
            nama=in.next();
            System.out.print("urutan : ");
            list=in.nextInt();
//            chrot=new Thread(new chreads(nama));
//            chrot.start();
            ls.tambahData(nama, list);
        }
        else if(id==2){
            for(data Data : ls.getALL()){
//                System.out.println("= "+Data.getJeneng());
//                System.out.println("= "+Data.getUrut());
            chrot=new Thread(new chreads(Data.getJeneng(),Data.getUrut()));
            chrot.run();
            }
        }
        else if(id==3){
            System.out.print("bye.......");
            int sure = 0;
            System.exit(sure);
        }
           
    }
        while(ljt=='Y');
    }
}
