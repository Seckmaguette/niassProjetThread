package main;

import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        Runnable task = ()->{
            System.out.println("Debut : "+ System.nanoTime());
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Tache en cours d'éxecution !");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fin : "+ System.nanoTime());
        };

        ScheduledFuture<?> future = executorService.schedule(task, 5, TimeUnit.SECONDS);
        System.out.println("Time = "+future.getDelay(TimeUnit.SECONDS));

        executorService.scheduleWithFixedDelay(task, 0, 6, TimeUnit.SECONDS);
        /*
        try {
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
         */
    }
}
