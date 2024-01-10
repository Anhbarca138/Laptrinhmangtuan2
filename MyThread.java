
package laptrinhmang1.week2;
public class MyThread extends Thread{
    //tao luong
    @Override
    public void run(){
        System.out.println("Luong dang chay");
    }
    public static void main(String[] args){
        MyThread th=new MyThread();
        //chay luong
        th.start();
    }
}

