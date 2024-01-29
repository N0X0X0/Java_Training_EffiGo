class Multithreadthing extends Thread{
    private int threadNumber;
    public Multithreadthing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println(i + " from thread" + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


public class Multithreading {
    public static void main(String args[]){
        // Multithreadthing myobj = new Multithreadthing();
        // Multithreadthing myobj1 = new Multithreadthing();
        // myobj.start();
        // myobj1.run();
        for(int i=0;i<4;i++){
            Multithreadthing myobj = new Multithreadthing(i);
            myobj.start();
        }
    }
}
 