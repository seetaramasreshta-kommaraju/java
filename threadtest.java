class numbertask extends Thread
{
    @Override
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Number: "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Thread terminated");
        }
    }
}

class lettertask extends Thread
{
    @Override 
    public void run(){
        try{
            for(char c='A';c<='E';c++){
                System.out.println("Letter: "+c);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Thread terminated");
        }
    }
}

public class threadtest {
    public static void main(String[] args){
        numbertask t1 = new numbertask();
        lettertask t2 = new lettertask();
        t1.start();
        t2.start();
    }
}
