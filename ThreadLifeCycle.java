class MyThread extends Thread{
    @Override 
    public void run(){
        try {
            System.err.println("Thread is Running");
            Thread.sleep(2000);
            System.out.println("Thread resumed after waiting");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}


public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        //new
        System.out.println("After Creation: " + t.getState());

        //runnable
        t.start();
        System.out.println("After start: "  + t.getState());

        //give the thread time to enter  sleep
        Thread.sleep(500);

        // timed waiting
        System.out.println("During waiting: " + t.getState());

        //give the thread time to finish
        Thread.sleep(3000); 
            
    }
}
