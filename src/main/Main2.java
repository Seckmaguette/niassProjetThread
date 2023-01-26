package main;

import java.util.concurrent.*;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();



        Callable<Integer> task1 = ()->{
            TimeUnit.SECONDS.sleep(5);
            return 1000;
        };

        Future<Integer> future = executorService.submit(task1);

        System.out.println("Future ok = "+future.isDone());
        Integer retour = future.get();
        System.out.println("retour = "+retour);
        System.out.println("Future ok = "+future.isDone());

        try {
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }


    }
}
