package javathreads;

/**
 *
 * @author yogi-06926
 */
class chreads implements Runnable{
    String nama;
    int lis;
    
    chreads(String nama,int list){
        this.nama=nama;
        this.lis=list;
    }
     public void run(){
        
        try {
                for (int i=0;i<lis;i++){
            System.out.println("\nThread " + nama +" "+(i+1)+ ": ada pada Posisi -> " + i);
            Thread.currentThread().sleep(1000);
        }
                
            } catch (InterruptedException ie) {
                System.out.println("\nTer-Execute");
            }
        try {
                
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println("\nTer-Execute");
            }
     
        
    }
    
   
}
