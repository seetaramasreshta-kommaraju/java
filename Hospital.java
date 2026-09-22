class Patient extends Thread {
    
    Patient(String name) {
        super(name);
    }

    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(getName() + " - Treatment step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Treatment interrupted");
            }
            System.out.println(getName() + " - Treatment completed");
        }

    }    
}

public class Hospital {
        public static void main(String[] args) {
            Patient p1 = new Patient("Normal Patient");
            Patient p2 = new Patient("Fever Patient");
            Patient p3 = new Patient("Critical Patient");

            p1.setPriority(Thread.MIN_PRIORITY);
            p2.setPriority(Thread.NORM_PRIORITY);
            p3.setPriority(Thread.MAX_PRIORITY);

            p1.start();
            p2.start(); 
            p3.start();
        }
    }