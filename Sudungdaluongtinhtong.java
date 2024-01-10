
package laptrinhmang1.week2;

public class Sudungdaluongtinhtong {
    public static void main (String[] args){
        //mang so nguyen
        int[] array={9,5,5,3,10,12,22,55,1000,11};
        //so luong luong
        int numThreads=2;
        //mang luong
        Thread[] ths=new Thread[numThreads];
        //
        SumCalculator[] cals = new SumCalculator[numThreads];
        //chay cac luong
        for(int i=0;i<numThreads;i++)
        {
            cals[i] =new SumCalculator(array, i, numThreads);
            ths[i] =new Thread(cals[i]);
            ths[i].start();
        }
        //doi cho tat ca cac luong hoan thanh
        for(int i=0;i<numThreads;i++)
        {
            try{
                ths[i].join();//cho luong ket thuc
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        int totalSum=0;
        for(SumCalculator c: cals)
        {
            totalSum +=c.getTong1phan();
        }
        //in ra
        System.out.println("In ra tong: "+ totalSum);
    }
}
class SumCalculator implements Runnable{
    private int [] array;
    private int startIndex;
    private int chia;
    private int tong1phan;

    public SumCalculator(int[] array, int startIndex, int chia) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tong1phan = tong1phan;
    }
    
    @Override
    public void run() {
        //tinh tong cua cac phan tu mang tren index
        for (int i=startIndex;i<array.length;i+=chia)
        {
            tong1phan +=array[i];
        }
    }
    
    public int getTong1phan() {
        return tong1phan;
    }
}
