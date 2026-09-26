class ReportThread extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Report generation: "+i+" by "+Thread.currentThread().getName());
        }
    }
}
class TransactionThread implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Transaction Processing: "+i+" by "+Thread.currentThread().getName());
        }
    }
}
class LoggingThread extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Loggging Activity: "+i+" by "+Thread.currentThread().getName());
        }
    }
}
public class ThreadPriorityDemo{
    public static void main(String[] args) {
        ReportThread t1 = new ReportThread();
        Thread t2 = new Thread(new TransactionThread());
        LoggingThread t3 = new LoggingThread();
        
        t1.setPriority(Thread.MIN_PRIORITY);//1
        t2.setPriority(Thread.MAX_PRIORITY);//10
        t3.setPriority(Thread.NORM_PRIORITY);//5

        t1.start();
        t2.start();
        t3.start();
    }
}