
package laptrinhmang1.week2;
public class Vongdonluong {
    public static void main (String[] args) {
        //tao mot luong moi
        Thread th1=new Thread(new DNRunable2());
        //bat dau luong
        th1.start();
        //cho
        try {
            Thread.sleep(2000);//nghi 2s
        } catch (Exception e) {
                e.printStackTrace();
    }
        //ngung 
        th1.interrupt();
    }
}
class DNRunable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Luong dang chay - Trang thai: "
                +Thread.currentThread().getState());
        try {
            Thread.sleep(3000); //nghi 3s
        } catch (Exception e){
            System.out.println("Luong bi ngat ngu - Trang thai: "+
                    Thread.currentThread().getState());
        }
        System.out.println("Luong da ket thuc - Trang thai: "+
                Thread.currentThread().getState());
    }
}
