package threads;

public class Thread3 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true){
            try {
                Thread.sleep(1000);
                if(i == 10) break;
                i++;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
