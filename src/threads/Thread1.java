package threads;

public class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true){
            try {
                Thread.sleep(1000);
                if(i == 10) break;
                System.out.println("Thread 1, i = "+i);
                i++;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
