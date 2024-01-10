
package laptrinhmang1.week2;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sudungdaluong {
    public static void main(String[] args) {
        // goi luong
        Thread th1=new Thread(new DNRunable("Luong 1"));
        th1.start();
        
        Thread th2=new Thread(new DNRunable("Luong 2"));
        th2.start();
    }
}
class DNRunable implements Runnable{
    private String threadName; //quan ly theo ten
    //ham khoi tao

    public DNRunable(String threadName) {
        this.threadName =threadName;
    }
    
    @Override
    public void run() {
        System.out.println("Bat dau thuc hien cong viec trong"+
                threadName);
        //thuc hien cong viec cua luong
        for(int i=0;i<=5;i++)
        {
            System.out.println(threadName+";Buoc"+i);
            try {
                Thread.sleep(2000);//ngu 2s
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }   
}
